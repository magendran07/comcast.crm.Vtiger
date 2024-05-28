package com.comcast.crm.createLead;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriver.utility.webDriverUtility;
import com.comcast.crm.javaUtility.javaUtility;
import com.comcast.crm.listnerUtility.listIMPPages;
import com.comcast.crm.objectepositoryuitlity.createLeads;

import baseUtitlity.BaseClass;

public class createLeadTest  extends BaseClass{

	@Test(groups = "SmokeTest")
	public void s() throws IOException, InterruptedException {
	createLeads led=new createLeads(driver);
	webDriverUtility access=new webDriverUtility();
	access.implicitywait(40, driver);
	led.lead();
	led.createLead();
	Thread.sleep(2000);
	javaUtility utility=new javaUtility();
	String typeName=utility.randomNumber();
	led.companyName(typeName);

	String leadName=utility.randomNumber();
	led.lastname(leadName);
	led.saveButton();
	}
}
