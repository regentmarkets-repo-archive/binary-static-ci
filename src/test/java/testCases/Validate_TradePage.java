package testCases;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Home_Page;
import utility.Constant;
import appModules.Logout_Action;
import appModules.Navigation_Action;
import appModules.Trading_Action;

public class Validate_TradePage {
	
	public WebDriver driver;
	//Test Method to Login to binary site
	@Test(priority=0)
	public void Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
	}
	//Test Method to navigate to financial assessment page
	@Test(priority=1)
	  public void NavigateToTradePage() {
		Navigation_Action.Navigate_To_TradingPage(driver);
	  }
	//Test Method to check all Markets options
	@Test(priority=2)
	public void CheckMarketOptions() {
		Trading_Action.CheckMarketOptions(driver);
	}
	//Test Method to check all underlying assets for selected market
	@Test(priority=3)
	public void CheckUnderlyingAssets() {
		Trading_Action.CheckForexAssets(driver);
		Trading_Action.CheckIndicesAssets(driver);
		Trading_Action.CheckOTCStocksAssets(driver);
		Trading_Action.CheckCommoditiesAssets(driver);
		Trading_Action.CheckVolatilityIndicesAssets(driver);
	}
	//Test Method to check error validation for all ticks duration fields
	@Test(priority=4)
	public void CheckErrorValidationForDurationTicks() {
		Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateDurationFields(driver,"t");
		Trading_Action.NavigateToDigitsMatchesDiffers(driver, "Volatility Indices", "Volatility 10 Index");
		Trading_Action.ValidateDurationFields(driver, "t");
		Trading_Action.NavigateToDigitsOverUnder(driver, "Volatility Indices", "Volatility 25 Index");
		Trading_Action.ValidateDurationFields(driver, "t");
		Trading_Action.NavigateToDigitsEvenOdd(driver, "Volatility Indices", "Volatility 50 Index");
		Trading_Action.ValidateDurationFields(driver, "t");
	}
	//Test Method to check error validation for all seconds duration fields
	@Test(priority=5)
	public void CheckErrorValidationForDurationSeconds() {
		Trading_Action.NavigateToUpDownRiseFall(driver, "Volatility Indices", "Volatility 100 Index");
		Trading_Action.ValidateDurationFields(driver, "s");
		Trading_Action.NavigateToUpDownHigherLower(driver, "Volatility Indices", "Volatility 10 Index");
		Trading_Action.ValidateDurationFields(driver, "s");
	}
	//Test Method to check error validation for all minutes duration fields
	@Test(priority=6)
	public void CheckErrorValidationForDurationMins() {
		Trading_Action.NavigateToUpDownHigherLower(driver, "Forex", "USD/CAD");
		Trading_Action.ValidateDurationFields(driver,"m");
		Trading_Action.NavigateToUpDownHigherLower(driver, "Volatility Indices", "Volatility 10 Index");
		Trading_Action.ValidateDurationFields(driver,"m");
		Trading_Action.NavigateToTouchNoTouch(driver, "Volatility Indices", "Volatility 50 Index");
		Trading_Action.ValidateDurationFields(driver,"m");
		Trading_Action.NavigateToInOutEndsInOut(driver, "Volatility Indices", "Volatility 75 Index");
		Trading_Action.ValidateDurationFields(driver,"m");
	}
	//Test Method to check error validation for all hours duration fields
	@Test(priority=7)
	public void CheckErrorValidationForDurationHours() {
		Trading_Action.NavigateToUpDownHigherLower(driver, "Forex", "USD/CAD");
		Trading_Action.ValidateDurationFields(driver,"h");
		Trading_Action.NavigateToUpDownHigherLower(driver, "Volatility Indices", "Volatility 10 Index");
		Trading_Action.ValidateDurationFields(driver,"h");
		Trading_Action.NavigateToInOutStaysInGoesOut(driver, "Volatility Indices", "Volatility 25 Index");
		Trading_Action.ValidateDurationFields(driver,"h");
	}
	//Test Method to check error validation for all day duration fields
	@Test(priority=8)
	public void CheckErrorValidationForDurationDays() {
		Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "USD/CAD");
		Trading_Action.ValidateDurationFields(driver,"d");
		Trading_Action.NavigateToUpDownRiseFall(driver, "Volatility Indices", "Volatility 10 Index");
		Trading_Action.ValidateDurationFields(driver,"d");
		Trading_Action.NavigateToUpDownRiseFall(driver, "Volatility Indices", "Volatility 25 Index");
		Trading_Action.ValidateDurationFields(driver,"d");
	}
	//Test Method to check error validation for barrier offset fields
	@Test(priority=9)
	public void CheckErrorValidationForBarrierOffset() {
		Trading_Action.NavigateToUpDownHigherLower(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateBarrierField(driver,"HigherLower","Payout");
		Trading_Action.NavigateToUpDownHigherLower(driver, "Volatility Indices", "Volatility 50 Index");
		Trading_Action.ValidateBarrierField(driver,"HigherLower","Payout");		
	}
	//Test Method to check error validation for payout amount fields
	@Test(priority=10)
	public void CheckErrorValidationForPayout() {	
		Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateAmountField(driver, "Forex","Payout");
		Trading_Action.NavigateToUpDownRiseFall(driver, "Commodities", "Gold/USD");
		Trading_Action.ValidateAmountField(driver,"Commodities","Payout");
		Trading_Action.NavigateToUpDownRiseFall(driver, "Volatility Indices", "Volatility 100 Index");
		Trading_Action.ValidateAmountField(driver, "Volatility Indices","Payout");
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
