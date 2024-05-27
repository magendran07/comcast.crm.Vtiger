package com.comcast.crm.objectepositoryuitlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginAndVerificationpage {
	
	WebDriver driver;
	public loginAndVerificationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Home') and @class='hdrLink']")
	WebElement headerLink;


public boolean  headerText(){
	boolean flag=headerLink.isDisplayed();
	return flag;
}
public String headerVerification() {
	String name =headerLink.getText();
	return name;
}
}
