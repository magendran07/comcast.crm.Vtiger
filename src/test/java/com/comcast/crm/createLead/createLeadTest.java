package com.comcast.crm.createLead;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriver.utility.webDriverUtilityTest;
import com.comcast.crm.javaUtility.javaUtilityTest;
import com.comcast.crm.objectepositoryuitlity.createLeadsTest;

import baseUtitlity.BaseClassTest;

public class createLeadTest  extends BaseClassTest{

	@Test(groups = "SmokeTest")
	public void s() throws IOException, InterruptedException {
	createLeadsTest led=new createLeadsTest(driver);
	webDriverUtilityTest access=new webDriverUtilityTest();
	access.implicitywait(40, driver);
	led.lead();
	led.createLead();
	Thread.sleep(2000);
	javaUtilityTest utility=new javaUtilityTest();
	String typeName=utility.randomNumber();
	led.companyName(typeName);

	String leadName=utility.randomNumber();
	led.lastname(leadName);
	led.saveButton();
	}
}
