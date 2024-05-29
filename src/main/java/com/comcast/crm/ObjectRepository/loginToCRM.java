package com.comcast.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 @author Magendran
 THis class have the Element and Method of Login
**/
public class loginToCRM {
		
		WebDriver driver;
		public loginToCRM(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//input[@name='user_name']")
		WebElement username;
		
		@FindBy(xpath="//input[@name='user_password']")
		WebElement password;
		
		@FindBy(id="submitButton")
		WebElement submit;
		
		public void loginTOCRmApp(String userid,String passkey) {
		username.sendKeys(userid);
	password.sendKeys(passkey);
		submit.click();
		
		}

	}
