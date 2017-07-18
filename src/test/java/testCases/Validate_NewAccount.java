package testCases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Date;

import appModules.CreateFreeAccount_Action;
import appModules.Endpoint_Action;
//import appModules.Endpoint_Action;
import appModules.Navigation_Action;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import junit.framework.Assert;
import pageObjects.NewAccount_Page;
import utility.Constant;
import utility.Helper;
public class Validate_NewAccount {
	public WebDriver driver;
	Helper helperutility;
	//Test Method to start browser session
		@BeforeTest
	    public void setUp() {
			if(Constant.testExeEnv.equals("Local"))
	    	{
	    		ChromeDriverManager.getInstance().setup();
	    		driver = new ChromeDriver();
	    	}
	    	else
	    	{
	    		Constant.BsTesName = "NewAccountOnBlueServer";
	    		driver = Helper.BrowserStackConfigurations();
	    	}
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	Navigation_Action.Navigate_To_HomePage(driver,Constant.URL+"/en/endpoint.html");
	    	helperutility = new Helper();//get current ticks
	    	}
//point to server
@Test(priority=0)
public void SetServer()
{
	Endpoint_Action.SetServer(driver,Constant.Server,Constant.AppID);
}
//create new account with valid data
 @Test(priority=1)
 public void NewClientRegistration()
 { 
	String sEmail = "auto"+helperutility.Get_CurrentTicks();//appened with current ticks
	String withMailInator =sEmail+"@mailinator.com";
	CreateFreeAccount_Action.CreateFreeAccount(driver,withMailInator);
    String token = helperutility.Get_VerificationToken(driver, sEmail);
	//country code should be passed e.g for Pakistan ,pk
    CreateFreeAccount_Action.VerifyNewAccount(driver, token,Constant.Password,Constant.Password,Constant.countryCode);
    //Logout newly created user
    Navigation_Action.Navigate_To_LogoutPage(driver);
 }
 //create account with invalid email(blank or wrong format)
 @Test(priority=2)
 public void Validate_EmailField()
 {
	 Navigation_Action.Go_Home_Page(driver);//navigate to home page
	 CreateFreeAccount_Action.CreateFreeAccount(driver,"");//create account with blank email
	 //assert error message
	 NewAccount_Page.Err_Message(driver,"This field is required.","Email field required error message do not displayed");
	 CreateFreeAccount_Action.CreateFreeAccount(driver,"testmailinator.com");//create account with invalid email
	 //assert error message
	 NewAccount_Page.Err_Message(driver,"Invalid email address","Email field required error message do not displayed");
 }
 //create account with invalid verification token/password
 @Test(priority=3)
 public void Validate_VerificationInfo()
 {
	 CreateFreeAccount_Action.Refresh_Page(driver);
	 String sEmail = "autobinary"+helperutility.Get_CurrentTicks();//appended with current ticks to make eail unique
	 String withMailInator =sEmail+"@mailinator.com";
	 CreateFreeAccount_Action.CreateFreeAccount(driver,withMailInator);//create account
	 String token = helperutility.Get_VerificationToken(driver, sEmail);
	 //enter invalid token
	 CreateFreeAccount_Action.VerifyAccountValidation(driver, "7hg56fds",Constant.Password,Constant.Password,Constant.countryCode);
	 driver.get(Constant.URL+"/en/new_account/virtualws.html");
	 CreateFreeAccount_Action.Refresh_Page(driver);
	 //enter wrong password less than 6 char 
	 CreateFreeAccount_Action.VerifyAccountValidation(driver, token,"1234",Constant.Password,Constant.countryCode);
	 //assert error message
	 NewAccount_Page.Err_Message(driver,"You should enter 6-25 characters.","password length issue");
	 driver.get(Constant.URL+"/en/new_account/virtualws.html");
	 CreateFreeAccount_Action.VerifyAccountValidation(driver, token,"123456",Constant.Password,Constant.countryCode);
	 NewAccount_Page.Err_Message(driver,"Password should have lower and uppercase letters with numbers.","password format issue");
	 driver.get(Constant.URL+"/en/new_account/virtualws.html");
	 CreateFreeAccount_Action.VerifyAccountValidation(driver, token,Constant.Password,"123456",Constant.countryCode);
	 NewAccount_Page.Err_Message(driver,"The two passwords that you entered do not match.","password mismatch issue");
	 driver.get(Constant.URL+"/en/new_account/virtualws.html");
	 CreateFreeAccount_Action.VerifyAccountValidation(driver, token,Constant.Password,Constant.Password,Constant.countryCode);
	 Navigation_Action.Navigate_To_LogoutPage(driver);
 }
 @AfterTest
 public void endSession() {
	  driver.quit();  
 }
}
