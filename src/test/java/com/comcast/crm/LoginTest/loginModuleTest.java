package com.comcast.crm.LoginTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.fileutility;
import com.comcast.crm.objectepositoryuitlity.loginPage;

public class loginModuleTest {

	@Test(groups = "RegressionTest")
	public void loginINTOCRM() throws IOException{
		fileutility file=new fileutility();
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
		loginPage lp=new loginPage(driver);
	
	String userid=	file.getDataFormPropertyFile("username");
	String passkey=	file.getDataFormPropertyFile("password");
		lp.loginTOCRm(userid, passkey);
		driver.close();
	}
		
		
	}

