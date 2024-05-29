package com.comcast.crm.listnerUtility;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.comcast.crm.generic.fileutility.fileutilityTest;
import baseUtitlity.BaseClassTest;
/**
 * Author Name: Magendran P
 * This Class contains the Listner class for both Suite and Script Level
 */
public class listIMPPagesTest implements ITestListener,ISuiteListener{
	public static ExtentReports reports;
	public static ExtentTest test;
	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		ISuiteListener.super.onStart(suite);
	fileutilityTest file=new fileutilityTest();
	String time=new Date().toString().replace(" ", "_").replace(":", "_");
			ExtentSparkReporter spark=new ExtentSparkReporter("./ExtentReport/Report"+time+".html");
			spark.config().setDocumentTitle("Login to Application");
			spark.config().setReportName("LoginPage");
			spark.config().setTheme(Theme.DARK);
			
			reports=new ExtentReports();
			reports.attachReporter(spark);
			reports.setSystemInfo("OS", "Window");
			try {
				reports.setSystemInfo("Browser",file.getDataFormPropertyFile("Browser"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		ISuiteListener.super.onFinish(suite);
		reports.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		test=reports.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO,result.getMethod().getMethodName()+"Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		test=reports.createTest(result.getMethod().getMethodName());
		test.log(Status.PASS,result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		
		String testcaseName=result.getMethod().getMethodName();
		
		String time=new Date().toString().replace(" ", "_").replace(":", "_");
		TakesScreenshot edriver=(TakesScreenshot) BaseClassTest.sdriver;
		String src= edriver.getScreenshotAs(OutputType.BASE64);
	test.addScreenCaptureFromBase64String(src, "./testdata/"+testcaseName+""+time+".png");
		
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test=reports.createTest(result.getMethod().getMethodName());
		test.log(Status.SKIP,result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	


}
