package com.comcast.crm.Verification;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriver.utility.webDriverUtility;
import com.comcast.crm.objectepositoryuitlity.loginAndVerificationpage;

import baseUtitlity.BaseClass;

public class loginAndVerification  extends BaseClass{
	@Test
	public void loginpageVerification() {
		loginAndVerificationpage lop=new loginAndVerificationpage(driver);
		webDriverUtility utility=new webDriverUtility();
		utility.implicitywait(20, driver);
	boolean flag=lop.headerText();
	Assert.assertEquals(flag, true);
	}
}
