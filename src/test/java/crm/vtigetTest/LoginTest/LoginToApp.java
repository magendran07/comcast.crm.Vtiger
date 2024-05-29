package crm.vtigetTest.LoginTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.ObjectRepository.loginToCRM;
/**
 * @author Magendran
 * This Scenario will Login with the 
 */
public class LoginToApp {
	@Test
	public void LoginWithPositiveCredentials() {
		WebDriver driver=new ChromeDriver();
		String url =System.getProperty("url");
		String Browser=System.getProperty("Browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginToCRM lop=new loginToCRM(driver);
		lop.loginTOCRmApp(username,password);
		driver.close();
	}

}
