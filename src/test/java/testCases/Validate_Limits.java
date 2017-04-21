package testCases;

import java.util.concurrent.TimeUnit;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.Limits_Action;
import appModules.Login_Action;
import appModules.Navigation_Action;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageObjects.Authentication;
import pageObjects.ChangePassword_Page;
import pageObjects.Limits;
import pageObjects.MainAccount_Menu;
import pageObjects.PersonalDetails_Page;
import pageObjects.Profile_Page;
import pageObjects.Security_Page;
import pageObjects.Self_Exclusion;
import utility.Constant;
import utility.CommonFunctions;

public class Validate_Limits {
	public WebDriver driver;
	int getMaxPos, getAccBal;
	
	//Test Method to login into the site
	@Test(priority=0)
	public void Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Login_Action.Execute(driver,Constant.Email,Constant.Password);
	}
	
	//Test Method to navigate to self exclusion page
	@Test(priority=1)
	public void NavigateToPersonalDetailsPage() {
		Navigation_Action.Navigate_To_SecurityPage(driver);
		Navigation_Action.Navigate_To_SelfExclusionPage(driver);
	}
	
	//Test Method to test error message when the new amount exceed the current amount
	@Test(priority=2)
	public void Test_Exceed_MaxAccountBalance() {
		Limits_Action.checkExMaxAccBal(driver);
	}
	
	//Test Method to test whether the update is saved when the new amount less than the current amount
	@Test(priority=3)
	public void Test_Lower_MaxAccountBalance() {
		getAccBal = Limits_Action.checkLowMaxAccBal(driver);
	}
	
	//Test Method to test error message when the new number exceed the current number
	@Test(priority=4)
	public void Test_Exceed_MaxOpenPos() {
		Limits_Action.checkExMaxOpPo(driver);
	}
	
	//Test Method to test whether the update is saved when the new number less than the current number
	@Test(priority=5)
	public void Test_Lower_MaxOpenPos() {
		getMaxPos = Limits_Action.checkLowMaxOpPo(driver);
	}
	
	//Test Method to check is it authenticated and navigate to limits page
	@Test(priority=6)
	public void NavigateToLimitsPage() {
		Navigation_Action.Navigate_To_AuthenticationPage(driver);
		Limits_Action.checkAuth(driver);
		
		Navigation_Action.Navigate_To_SecurityPage(driver);
		Navigation_Action.Navigate_To_LimitsPage(driver);
	}
	
	//Test Method to check whether the amount displayed correctly
	@Test(priority=7)
	public void Test_Limits_MaxAccountBalance() {	
		Limits_Action.limit_accbal(driver, getAccBal);
	}
	
	//Test Method to check whether the number displayed correctly
	@Test(priority=8)
	public void Test_Limits_MaxOpenPosition() {
		Limits_Action.limit_openpo(driver, getMaxPos);
	}
	
	//Test Method to check whether the limits message displayed correctly
	@Test(priority=9)
	public void Test_Limits_Message() {
		Limits_Action.test_msg(driver);
	} 
	
	//Test Method to start browser session and launch site
	@BeforeTest
	public void launchApplication() {
	 	ChromeDriverManager.getInstance().setup();
	   	driver = new ChromeDriver();
	   	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constant.URL);
	}
	
	//Method to close browser session
	@AfterTest
	public void logout() {
		CommonFunctions.endSession(driver);
	}
}
