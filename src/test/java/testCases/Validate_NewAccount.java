package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.CreateFreeAccount_Action;
import appModules.Endpoint_Action;
import appModules.Navigation_Action;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import utility.Constant;
import utility.Helper;

public class Validate_NewAccount {
	public WebDriver driver;
	//Test Method to start browser session
		@BeforeTest
	    public void setUp() {
	    	ChromeDriverManager.getInstance().setup();
	    	driver = new ChromeDriver(); 
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	Navigation_Action.Navigate_To_HomePage(driver,Constant.URL+"/en/endpoint.html");
	    	}
@Test(priority=0)
public void SetServer()
{
	Endpoint_Action.SetServer(driver,Constant.server,Constant.appId);
}
 @Test(priority=1)
 public void NewClientRegistration()
 { 
	Helper helperutility = new Helper();//get current ticks
	String sEmail = "autobinary"+helperutility.Get_CurrentTicks();//appened with current ticks
	CreateFreeAccount_Action.CreateFreeAccount(driver,sEmail+"@mailinator.com");
    String token = helperutility.Get_VerificationToken(driver, sEmail);
    //System.out.println(helperutility.Get_VerificationToken(driver,sEmail));
	//country code should be passed e.g for Pkaistan ,pk
    CreateFreeAccount_Action.VerifyNewAccount(driver, token,Constant.Password,Constant.Password,"pk");
 }
}
