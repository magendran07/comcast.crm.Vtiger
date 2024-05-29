package com.comcast.crm.LoginTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import com.comcast.crm.generic.fileutility.fileutilityTest;
import com.comcast.crm.objectepositoryuitlity.loginPageTest;

public class loginModuleTest {

	@Test(groups = "RegressionTest")
	public void loginINTOCRM() throws IOException{
		fileutilityTest file=new fileutilityTest();
	String Browser=file.getDataFormPropertyFile("Browser");
	String url=file.getDataFormPropertyFile("url");
		WebDriver driver=null;	
		if(Browser.equals("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		} 
		else if(Browser.equals("fireFox")){
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		loginPageTest lp=new loginPageTest(driver);
	
	String userid=	file.getDataFormPropertyFile("username");
	String passkey=	file.getDataFormPropertyFile("password");
		lp.loginTOCRm(userid, passkey);
		driver.close();
	}
		
		
	}

