package com.comcast.crm.Verification;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.comcast.crm.generic.webdriver.utility.webDriverUtilityTest;

import com.comcast.crm.objectepositoryuitlity.loginAndVerificationpageTest;
import baseUtitlity.BaseClassTest;
@Listeners(com.comcast.crm.listnerUtility.listIMPPagesTest.class)
public class loginSoftAssertTest extends BaseClassTest {
	@Test
	public void loginSoft() {
		webDriverUtilityTest utility=new webDriverUtilityTest();
		utility.implicitywait(20, driver);
		loginAndVerificationpageTest lop=new loginAndVerificationpageTest(driver);
		String name=	lop.headerVerification();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(" ", name);	
		soft.assertAll();
	}

}
