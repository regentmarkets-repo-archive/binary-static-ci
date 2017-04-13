//Test case to test the lost password feature
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Constant;

import pageObjects.Home_Page;
import pageObjects.Login_Page;
import appModules.LossPassword_Action;

public class Validate_LostPassword {
	public WebDriver driver;
	
	//Test Method to start browser session and launch site
	@BeforeTest
	public void setUp() {
    	ChromeDriverManager.getInstance().setup();
    	driver = new ChromeDriver(); 
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
	
	// Launch site
	@Test
	public void A_Launch(){
		  driver.get(Constant.URL_Binary); 
		  System.out.println("Page title is: " + driver.getTitle());
	}
	
	//Test to click 'lost password' in the Login page
	@Test
	public void B_Lost_Password() {
		  LossPassword_Action.Execute(driver);
	}
	
	//Test Method to close browser session
    @AfterTest
    public void endSession() {
        driver.quit();
    }
	
}
