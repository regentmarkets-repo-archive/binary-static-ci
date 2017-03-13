//TestCase to Login to the site and then Logout with valid user credentials
package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.Home_Page;
import utility.Constant;
import appModules.Login_Action;
import appModules.Logout_Action;

public class Validate_LoginAndLogout {
	
public WebDriver driver;
	//Test Method to start browser session
	@BeforeTest
    public void setUp() {
    	ChromeDriverManager.getInstance().setup();
    	driver = new ChromeDriver(); 
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	}
  //Test Method to launch site and print page title
  @Test
  public void A_Launch(){
	  driver.get(Constant.URL); 
	  System.out.println("Page title is: " + driver.getTitle());
  }
  //Test Method to login to the site with valid credentials
  @Test
  public void B_Login() {
	  	Login_Action.Execute(driver,Constant.Email,Constant.Password);
  }
  //Test Method to logout from the site and validate login button is present
  @Test
  public void C_Logout() {
		Logout_Action.Execute(driver);
		AssertJUnit.assertTrue(Home_Page.btn_Login(driver).isDisplayed());
  }
  //Test Method to close the browser session
  @AfterTest
  public void endSession() {
	  driver.quit();  
  }
}