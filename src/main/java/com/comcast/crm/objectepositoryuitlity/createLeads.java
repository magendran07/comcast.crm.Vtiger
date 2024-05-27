package com.comcast.crm.objectepositoryuitlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import com.comcast.crm.generic.webdriver.utility.webDriverUtility;

public class createLeads {
	
public	WebDriver driver;
	public createLeads(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[contains(@title,'Create Lead')]")
	WebElement plusButton;
	
	@FindBy(xpath="//a[text()='Leads']")
	WebElement leads;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//select[@name='leadsource']")
	WebElement leadSource;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	WebElement saveButton;
	
	public void companyName(String name) {
		company.sendKeys(name);
	}
	public void leadSources() {
		webDriverUtility utility=new webDriverUtility();
		utility.selectByID(leadSource, 2);
	}
	public void lastname(String name) {
		lastname.sendKeys(name);
	}
	public void lead() {
		leads.click();
	}
	public void saveButton() {
		saveButton.click();
	}
	public void createLead() {
		plusButton.click();
	}

}
