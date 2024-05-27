package com.comcast.crm.ExtentReport;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.listnerUtility.listIMPPages;

import baseUtitlity.BaseClass;
@Listeners(com.comcast.crm.listnerUtility.listIMPPages.class)
public class LoginTOApplicationReport extends BaseClass {

	@Test(groups = "RegressionTest")
	public void  loginExtentReport() throws IOException {
	
		if("Hme".equals("Home")) {
			listIMPPages.test.log(Status.PASS,"Login is successfull");
		}
		else {
			listIMPPages.test.log(Status.FAIL,"Login is Not Failed");
		}
		
	}
//	@Test(groups = "SmokeTest")
//	public void createContact() {
//		listIMPPages.test.log(Status.INFO, "login to app");
//		listIMPPages.test.log(Status.PASS, "Navigate to ContactPage");
//		TakesScreenshot screen=(TakesScreenshot)driver;
//		String  path =screen.getScreenshotAs(OutputType.BASE64);
//		if("Home".equals("HMe")) {
//			listIMPPages.test.log(Status.PASS,"contact created  successfull");
//		}
//		else {
//			listIMPPages.test.addScreenCaptureFromBase64String(path, "Failed");
//			listIMPPages.test.log(Status.FAIL," failed to create A Contact");
//		}
	}

