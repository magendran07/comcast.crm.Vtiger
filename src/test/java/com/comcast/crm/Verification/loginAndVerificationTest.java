package com.comcast.crm.Verification;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.comcast.crm.generic.webdriver.utility.webDriverUtilityTest;
import com.comcast.crm.objectepositoryuitlity.loginAndVerificationpageTest;
import baseUtitlity.BaseClassTest;

public class loginAndVerificationTest  extends BaseClassTest{
	@Test
	public void loginpageVerification() {
		loginAndVerificationpageTest lop=new loginAndVerificationpageTest
				(driver);
		webDriverUtilityTest utility=new webDriverUtilityTest();
		utility.implicitywait(20, driver);
	boolean flag=lop.headerText();
	Assert.assertEquals(flag, true);
	}
}
