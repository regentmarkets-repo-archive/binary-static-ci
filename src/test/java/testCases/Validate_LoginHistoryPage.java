//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.Login_History;
import pageObjects.MainAccount_Menu;
import pageObjects.Security_Page;
import utility.Constant;
import appModules.LoginHistory_Action;
import appModules.Login_Action;

public class Validate_LoginHistoryPage {
	public WebDriver driver;
	  //Test Method to login into the site
	  @Test(priority=0)
	  public void Login() {
		  	Login_Action.Execute(driver,Constant.Email,Constant.Password);
	  } 
	  //Test Method to navigate to Login HIstory page
	  @Test(priority=1)
	  public void NavigateToLoginHistoryPage() {
		  	MainAccount_Menu.link_MainAccount(driver).click();
			MainAccount_Menu.link_Security(driver).click();
			Security_Page.link_LoginHistoryPage(driver).click();
	  }
	  //Check Login history page is load properly 
	  @Test(priority=2)
	  public void CheckPageLoad() {
		  AssertJUnit.assertTrue(Login_History.title_page(driver).isDisplayed());
		  LoginHistory_Action.Execute(driver);
	  }
	  @Test(priority=3)
	  public void CheckTotalRows() {
		  AssertJUnit.assertTrue(Login_History.title_page(driver).isDisplayed());
		  LoginHistory_Action.ExecuteCount(driver);
		 
	  }
		
	  //Test Method to start browser session and launch site
	  @BeforeTest
	  public void launchApplication() {
		  	ChromeDriverManager.getInstance().setup();
	    	driver = new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(Constant.URL);
	  }
	  //Test Method to close browser session
	  @AfterTest
	  public void endSession() {
		  driver.quit();
	  }
}