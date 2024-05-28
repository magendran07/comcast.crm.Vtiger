package com.comcast.crm.createOrg;

import java.io.IOException;

import org.testng.annotations.Test;


import com.comcast.crm.generic.fileutility.fileutilityTest;

import com.comcast.crm.generic.webdriver.utility.webDriverUtilityTest;
import com.comcast.crm.javaUtility.javaUtilityTest;

import com.comcast.crm.objectepositoryuitlity.createOrgTest;
import baseUtitlity.BaseClassTest;

public class createOrganizationRandomNameTest extends BaseClassTest{
	
	@Test(groups = "RegressionTest")
	public void createOrganization() throws IOException {
		createOrgTest cop=new createOrgTest(driver);
		webDriverUtilityTest implicitwait=new webDriverUtilityTest();
		implicitwait.implicitywait(20, driver);
		cop.navigateToOrganization();
		cop.createOrganization();
		javaUtilityTest file=new javaUtilityTest();
		fileutilityTest orgName=new fileutilityTest();
		String fetchName=orgName.getDataFormPropertyFile("headerName");
		String name=fetchName+file.randomNumber();
		cop.organizationName(name);
		
		
	}

}
