package com.comcast.crm.Verification;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.comcast.crm.generic.webdriver.utility.webDriverUtility;
import com.comcast.crm.objectepositoryuitlity.loginAndVerificationpage;

import baseUtitlity.BaseClass;
@Listeners(com.comcast.crm.listnerUtility.listIMPPages.class)
public class loginSoftAssertTest extends BaseClass {
	@Test
	public void loginSoft() {
		webDriverUtility utility=new webDriverUtility();
		utility.implicitywait(20, driver);
		loginAndVerificationpage lop=new loginAndVerificationpage(driver);
		String name=	lop.headerVerification();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(" ", name);	
		soft.assertAll();
	}

}
