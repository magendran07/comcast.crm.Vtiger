package baseUtitlity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.generic.fileutility.fileutility;
import com.comcast.crm.objectepositoryuitlity.loginPage;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass{
	public WebDriver driver;
	public static WebDriver sdriver;
	public fileutility file=new fileutility();

	@BeforeClass(alwaysRun = true)
	public void configBC() throws Throwable {
		// Launch Browser
		
		String Browser=System.getProperty("Browser", file.getDataFormPropertyFile("Browser"));
		String url=System.getProperty("url",file.getDataFormPropertyFile("url"));
		System.out.println(Browser);
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
			sdriver=driver;
	}
	
	@BeforeMethod(alwaysRun = true)
	public void configSection() throws Throwable {
				//loginto Application
		String userid =  file.getDataFormPropertyFile("username");
		String passkey = file.getDataFormPropertyFile("password");
		System.out.println(userid);
		System.out.println(passkey);
		loginPage lp=new loginPage(driver);
		lp.loginTOCRm(userid, passkey);
	}

	
	@AfterClass(alwaysRun = true)
	public void configAC() {
		// Close Browser
	driver.quit();
	}
	
}
