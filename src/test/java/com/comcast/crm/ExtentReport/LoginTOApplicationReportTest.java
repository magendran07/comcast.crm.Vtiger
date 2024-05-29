package com.comcast.crm.ExtentReport;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.listnerUtility.listIMPPagesTest;
import baseUtitlity.BaseClassTest;
@Listeners(com.comcast.crm.listnerUtility.listIMPPagesTest.class)
public class LoginTOApplicationReportTest extends BaseClassTest {

	@Test(groups = "RegressionTest")
	public void  loginExtentReport() throws IOException {
	
		if("Hme".equals("Home")) {
			listIMPPagesTest.test.log(Status.PASS,"Login is successfull");
		}
		else {
			listIMPPagesTest.test.log(Status.FAIL,"Login is Not Failed");
		}
		
	}
	@Test(groups = "SmokeTest")
	public void createContact() {
	listIMPPagesTest.test.log(Status.INFO, "login to app");
		listIMPPagesTest.test.log(Status.PASS, "Navigate to ContactPage");
		TakesScreenshot screen=(TakesScreenshot)driver;
	String  path =screen.getScreenshotAs(OutputType.BASE64);
	if("Home".equals("HMe")) {
			listIMPPagesTest.test.log(Status.PASS,"contact created  successfull");
		}
		else {
			listIMPPagesTest.test.addScreenCaptureFromBase64String(path, "Failed");
		listIMPPagesTest.test.log(Status.FAIL," failed to create A Contact");	}
	}
}
