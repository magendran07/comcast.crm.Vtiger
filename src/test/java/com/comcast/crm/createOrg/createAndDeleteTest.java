package com.comcast.crm.createOrg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.comcast.crm.excelUtility.excelDataUtilityTest;

import com.comcast.crm.generic.fileutility.fileutilityTest;

import com.comcast.crm.generic.webdriver.utility.webDriverUtilityTest;

import com.comcast.crm.javaUtility.javaUtilityTest;

import com.comcast.crm.objectepositoryuitlity.createDeleteTheOrganizationTest;

import com.comcast.crm.objectepositoryuitlity.createOrgTest;
import baseUtitlity.BaseClassTest;

public class createAndDeleteTest  extends BaseClassTest{
public static	String name;
	@Test(groups = "SmokeTest")
	public void createOrg() throws IOException, InterruptedException {
		createOrgTest cop=new createOrgTest(driver);
		webDriverUtilityTest implicitwait=new webDriverUtilityTest();
		implicitwait.implicitywait(20, driver);
		cop.navigateToOrganization();
		cop.createOrganization();
		javaUtilityTest file=new javaUtilityTest();
		fileutilityTest orgName=new fileutilityTest();
		String fetchName=orgName.getDataFormPropertyFile("headerName");
	name=fetchName+file.randomNumber();
		cop.organizationName(name);
		cop.saveButton();
		System.out.println("saved");	
	}
	@AfterMethod
	public void deleteOrg() throws InterruptedException {
		webDriverUtilityTest utility=new webDriverUtilityTest();
		Thread.sleep(2000);
		//utility.implicitywait(40, driver);
		createDeleteTheOrganizationTest cod=new createDeleteTheOrganizationTest(driver);
		cod.navigateToOrganization();
		cod.deleteButton(name);
		utility.handleAlert(driver);	
	}
	@AfterClass
	public void writeBackEXcel() throws IOException {
		
		excelDataUtilityTest data=new excelDataUtilityTest();
		Assert.assertEquals(name, name);
		data.writeBackData(name);
		
	}
	

}
