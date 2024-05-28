package com.comcast.crm.createOrg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.comcast.crm.excelUtility.excelDataUtility;
import com.comcast.crm.generic.fileutility.fileutility;
import com.comcast.crm.generic.webdriver.utility.webDriverUtility;
import com.comcast.crm.javaUtility.javaUtility;
import com.comcast.crm.objectepositoryuitlity.createDeleteTheOrganization;
import com.comcast.crm.objectepositoryuitlity.createOrg;

import baseUtitlity.BaseClass;

public class createAndDeleteTest  extends BaseClass{
public static	String name;
	@Test(groups = "SmokeTest")
	public void createOrg() throws IOException, InterruptedException {
		createOrg cop=new createOrg(driver);
		webDriverUtility implicitwait=new webDriverUtility();
		implicitwait.implicitywait(20, driver);
		cop.navigateToOrganization();
		cop.createOrganization();
		javaUtility file=new javaUtility();
		fileutility orgName=new fileutility();
		String fetchName=orgName.getDataFormPropertyFile("headerName");
	name=fetchName+file.randomNumber();
		cop.organizationName(name);
		cop.saveButton();
		System.out.println("saved");	
	}
	@AfterMethod
	public void deleteOrg() throws InterruptedException {
		webDriverUtility utility=new webDriverUtility();
		Thread.sleep(2000);
		//utility.implicitywait(40, driver);
		createDeleteTheOrganization cod=new createDeleteTheOrganization(driver);
		cod.navigateToOrganization();
		cod.deleteButton(name);
		utility.handleAlert(driver);	
	}
	@AfterClass
	public void writeBackEXcel() throws IOException {
		
		excelDataUtility data=new excelDataUtility();
		Assert.assertEquals(name, name);
		data.writeBackData(name);
		
	}
	

}
