package com.comcast.crm.objectepositoryuitlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createOrgTest {
	WebDriver driver;
	public createOrgTest(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//td[@class='tabUnSelected']/../..//a[text()='Organizations']")
	WebElement organization;
	@FindBy(xpath="//img[contains(@title,'Create Organization')]")
	WebElement plusButton;
	@FindBy(xpath="//a[@class='hdrLink']")
	WebElement hedearText;
	
	@FindBy(xpath="//input[@name='accountname']")
	WebElement accountNumber;
	@FindBy(xpath="//input[@class='crmbutton small save']")
	WebElement saveButton;
	@FindBy(xpath="//a[text()='Organization Name']/../../..//a[text()='tyss']")
	WebElement createdOrganizationedText;
	@FindBy(xpath="//td[@class='tabUnSelected']/../..//a[text()='Leads']")
	WebElement leads;
	
	
	
	public void navigateToOrganization() {
	organization.click();
	}
	public void createOrganization() {
		plusButton.click();
	}
	public void organizationName(String name) {
		accountNumber.sendKeys(name);
	}
	public void saveButton() {
		saveButton.click();
	}
	public void gettextFromElement() {
		String fetchedName=hedearText.getText();
		System.out.println(fetchedName);
	}
	public void deleteButton(String dynamicValue) {
		driver.findElement(By.xpath("//a[text()='"+dynamicValue+"']/../../td[8]/a[text()='del']")).click();
		
	}
	public void leadspage() {
		leads.click();
	}
}