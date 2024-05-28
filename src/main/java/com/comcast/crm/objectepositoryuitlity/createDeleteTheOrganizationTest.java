package com.comcast.crm.objectepositoryuitlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class createDeleteTheOrganizationTest {
	  WebDriver driver;
	  public createDeleteTheOrganizationTest(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	  
	  @FindBy(xpath="//td[@class='tabUnSelected']/../..//a[text()='Organizations']")
		WebElement organization;
		
	  
		@FindBy(xpath="//a[@class='hdrLink']")
		WebElement hedearText;
		
		@FindBy(xpath="//td[@class='tabUnSelected']/../..//a[text()='Leads']")
		WebElement leads;
		
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
		public void navigateToOrganization() {
			organization.click();
			}

}
