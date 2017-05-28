package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.CreateFreeAccount_Action;
import appModules.Endpoint_Action;
import appModules.Navigation_Action;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import utility.Constant;
import utility.Helper;

public class Validate_NewAccountOnQaServer {
	public WebDriver driver;
	Helper helperutility;
	//Test Method to start browser session
		@BeforeTest
	    public void setUp() {
	    	ChromeDriverManager.getInstance().setup();
	    	driver = new ChromeDriver(); 
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
			String sEmail = "autobinary"+helperutility.Get_CurrentTicks();//appened with current ticks
			CreateFreeAccount_Action.CreateFreeAccount(driver,sEmail+"@mailinator.com");
			//get token from Dev Qa server
		    String token = helperutility.GetTokenFromQaServer();
			//country code should be passed e.g for Pakistan ,pk
		    CreateFreeAccount_Action.VerifyNewAccount(driver, token,Constant.Password,Constant.Password,"pk");
		    //Logout newly created user
		    Navigation_Action.Navigate_To_LogoutPage(driver);
		 }
		@AfterTest
		  public void endSession() {
			  driver.quit();  
		  }
}
