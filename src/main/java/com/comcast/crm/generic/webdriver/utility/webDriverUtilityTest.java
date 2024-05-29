package com.comcast.crm.generic.webdriver.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.jdbc.Driver;

public class webDriverUtilityTest {

	public static void clickOnElement(WebDriver driver,WebElement element) {
	element.click();
	}
	public static String pageVerification(WebElement fetchText) {
		String data = fetchText.getText();
		return data;
	}
	public static void enterInput(WebDriver driver,WebElement element,String Text) {
		element.sendKeys(Text);
	
	}
	
	public static void handleAlert(WebDriver driver) {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void selectByText(WebElement ele,String Text) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(Text);
	}
	public void selectByID(WebElement ele,int id) {
		Select sel=new Select(ele);
		sel.selectByIndex(id);
	}
	public void selectByValue(WebElement ele,String Text) {
		Select sel=new Select(ele);
		sel.selectByValue(Text);
	}
	public void implicitywait(int time,WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions acts=new Actions(driver);
		acts.contextClick(ele).perform();
	}
	public void dragandDrop(WebDriver driver,WebElement sources,WebElement Destiation) {
		Actions acts=new Actions(driver);
		acts.dragAndDrop(sources, Destiation).perform();
	}
	public void clickAndHold(WebDriver driver,WebElement Ele) {
		Actions acts=new Actions(driver);
		acts.clickAndHold(Ele).perform();
	}
	public void switchByIndex(int index,WebDriver driver) {
		driver.switchTo().frame(index);
	}
	public void SwitchByName(String name,WebDriver driver) {
		driver.switchTo().frame(name);
	}
	public void switchByElement(WebElement ele,WebDriver driver) {
		driver.switchTo().frame(ele);
		
	}
	public void switchChildWindow(WebDriver driver) {
		String name=driver.getWindowHandle();
		driver.switchTo().window(name);
	}
	public void switchParentWindow(WebDriver driver) {
	
		driver.switchTo().defaultContent();
	}
	public void explicitWait(WebDriver driver,Duration sec) {
		WebDriverWait sdriver=new WebDriverWait(driver, sec);	
	}
	public void keyBoardAction() {
	Keys pageDown = Keys.PAGE_DOWN;
	}
	public void handleAlerts(WebDriver driver) {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	

}
