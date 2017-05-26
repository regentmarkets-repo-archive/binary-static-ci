package testCases;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constant;
import appModules.Login_Action;
import appModules.Navigation_Action;
import appModules.Trading_Action;

public class Validate_BuySellTrades {
	public WebDriver driver;
	//Test Method to Login to binary site
	@Test(priority=0)
	public void Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
	  	Login_Action.SwitchToVirtualAccount(driver);
	  	
	}
	//Test Method to navigate to trading page
	@Test(priority=1)
	  public void NavigateToTradePage() {
		Navigation_Action.Navigate_To_TradingPage(driver);
	  }
	//Test Method to validate contract purchase for Volatility Indices
	@Test(priority=2)
	public void validateContractPurchaseForVolatilityIndices(){
		Trading_Action.NavigateToUpDownRiseFall(driver,"Forex", "AUD/JPY");
		Trading_Action.ValidateContractTopPurchase(driver,"AUD/JPY","15","m","10");
	}
	 //Test Method to start browser session and launch binary site
	 @BeforeTest
	  public void launchApplication() {
		ChromeDriverManager.getInstance().setup();
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constant.URL);
	  }
	 //Test Method to close the browser session
	 @AfterTest
	 public void endSession() {
		 driver.quit();
	 }

}
