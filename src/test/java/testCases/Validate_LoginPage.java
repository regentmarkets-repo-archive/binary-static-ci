//TestCase to Login to the site and then Logout with valid user credentials
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.Login_Page;
import utility.Constant;
import appModules.Navigation_Action;

public class Validate_LoginPage {
	
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
	  Navigation_Action.Navigate_To_HomePage(driver,Constant.URL);
  }
  //Test Method to login to the site with valid credentials
  @Test
  public void B_Login() {
	  Navigation_Action.Navigate_To_LoginPage(driver);
	  Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,Constant.Password);
  }
  //Test Method to logout from the site and validate login button is present
  @Test
  public void C_Logout() {
	  Navigation_Action.Navigate_To_LogoutPage(driver);
  }
  //Test Method to login with incorrect password
  @Test
  public void D_Login_IncorrectPassword() {
	  
	  	String inv_password = "Pass1234";
		 Navigation_Action.Navigate_To_LoginPage(driver);
		 Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,inv_password);
	  	Assert.assertTrue(Login_Page.err_Login(driver).isDisplayed());
		  if(Login_Page.err_Login(driver).isDisplayed()){
			  System.out.println(Login_Page.err_Login(driver).getText());
			  Assert.assertEquals("Incorrect email or password.",Login_Page.err_Login(driver).getText());
  }}
	
  //Test Method to close the browser session
  @AfterTest
  public void endSession() {
	  driver.quit();  
  }
}
