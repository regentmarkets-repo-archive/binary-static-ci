package testCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.AuthorisedApplications_Action;
import appModules.CreateFreeAccount_Action;
import appModules.Endpoint_Action;
import appModules.Login_Action;
import appModules.Navigation_Action;
import appModules.UpgradeRealAccount_Action;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageObjects.Login_Page;
import utility.Constant;
import utility.Helper;

public class Validate_NewAccountOnQaServer {
	public WebDriver driver;
	private String sEmail="";
	Helper helperutility;
	//Test Method to start browser session
		@BeforeTest
	    public void setUp() {
	    	ChromeDriverManager.getInstance().setup();
	    	driver = new ChromeDriver(); 
			//driver = Helper.BrowserStackConfigurations();
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.manage().window().maximize();
	    	helperutility = new Helper();//get current ticks
	    	helperutility.AddCookieOfQaServer(driver);
	    	Navigation_Action.Navigate_To_HomePage(driver,Constant.URL+"/en/endpoint.html");
	    	Endpoint_Action.SetServer(driver,Constant.targetserver,Constant.appId);
	    	}
		@Test(priority=0)
		 public void NewClientRegistrationOnQaServer()
		 {
			sEmail = "autobinary"+helperutility.Get_CurrentTicks();//appened with current ticks
			sEmail = sEmail +"@binary.com";
			CreateFreeAccount_Action.CreateFreeAccount(driver,sEmail);
			//get token from Dev Qa server
		    String token = helperutility.GetTokenFromQaServer(driver);
			//country code should be passed e.g for Pakistan ,pk
		    CreateFreeAccount_Action.VerifyNewAccount(driver, token,Constant.Password,Constant.Password,Constant.countryCode);
		    //Logout newly created user
		    Navigation_Action.Navigate_To_LogoutPage(driver);
		    Constant.Email = sEmail;
		    System.out.println(Constant.Email);
		 }
		@Test(priority=1)
		public void UpgradeToRealAccount()
		{
			//navigate to login page
			Navigation_Action.Navigate_To_LoginPage(driver);
			//Login again newly created user
		    Login_Action.Execute(driver, sEmail,Constant.Password);
		    //Grant permissions to newly logged-in user
		    AuthorisedApplications_Action.grantPermissionlogin(driver);
		    //Navigate to upgrade real account pages
		    Navigation_Action.Navigate_To_UpgradeAccount(driver);
		    String FirstName = helperutility.RandomName(4);
		    String FamilyName = helperutility.RandomName(5);
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    //Enter data to real account page random first and Family names
		    UpgradeRealAccount_Action.UpgradeAccount_Action(driver,Constant.UpgradeTitle,FirstName,FamilyName,Constant.firstLineAddress,Constant.secondLineAddress,Constant.city,Constant.state,Constant.zipCode,Constant.phone,Constant.securityQ,Constant.securityAns);
		  //Logout newly created user
		    Navigation_Action.Navigate_To_LogoutPage(driver);
		}
		@Test(priority=2)
		public void GrantUpgradedUserPermissons()
		{
			//navigate to login page
			Navigation_Action.Navigate_To_LoginPage(driver);
			//Login again newly created user
		    Login_Action.Execute(driver, sEmail,Constant.Password);
		    //Grant permissions to newly logged-in user
		    AuthorisedApplications_Action.grantPermissionlogin(driver);
		  //Logout newly created user
		    Navigation_Action.Navigate_To_LogoutPage(driver);
		}
		
		@AfterTest
		  public void endSession() {
			  driver.quit();  
		  }
}
