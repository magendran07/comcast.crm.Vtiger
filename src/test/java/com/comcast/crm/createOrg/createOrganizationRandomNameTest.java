package com.comcast.crm.createOrg;

import java.io.IOException;

import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.fileutility;
import com.comcast.crm.generic.webdriver.utility.webDriverUtility;
import com.comcast.crm.javaUtility.javaUtility;
import com.comcast.crm.objectepositoryuitlity.createOrg;

import baseUtitlity.BaseClass;

public class createOrganizationRandomNameTest extends BaseClass{
	
	@Test(groups = "RegressionTest")
	public void createOrganization() throws IOException {
		createOrg cop=new createOrg(driver);
		webDriverUtility implicitwait=new webDriverUtility();
		implicitwait.implicitywait(20, driver);
		cop.navigateToOrganization();
		cop.createOrganization();
		javaUtility file=new javaUtility();
		fileutility orgName=new fileutility();
		String fetchName=orgName.getDataFormPropertyFile("headerName");
		String name=fetchName+file.randomNumber();
		cop.organizationName(name);
		
		
	}

}
