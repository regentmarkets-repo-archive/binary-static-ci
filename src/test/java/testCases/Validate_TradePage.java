package testCases;

import org.testng.annotations.Test;

import utility.Constant;
import appModules.Navigation_Action;
import appModules.Trading_Action;

public class Validate_TradePage extends BaseClass {	
	@Test(priority=0,description="Test Method to Login to binary site")
	public void Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
	}
	@Test(priority=1,description="Test Method to navigate to financial assessment page")
	  public void NavigateToTradePage() {
		Navigation_Action.Navigate_To_TradingPage(driver);
	  }
	@Test(priority=2,description="Test Method to check all Markets options")
	public void CheckMarketOptions() {
		Trading_Action.CheckMarketOptions(driver);
	}
	@Test(priority=3,description="Test Method to check all underlying assets for selected market")
	public void CheckUnderlyingAssets() {
		Trading_Action.CheckForexAssets(driver);
		Trading_Action.CheckIndicesAssets(driver);
		Trading_Action.CheckOTCStocksAssets(driver);
		Trading_Action.CheckCommoditiesAssets(driver);
		Trading_Action.CheckVolatilityIndicesAssets(driver);
	}
	@Test(priority=4,description="Test Method to check error validation for all ticks duration fields")
	public void CheckErrorValidationForDurationTicks()  {
		Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateDurationFields(driver,"t");
	}
	@Test(priority=5,description="Test Method to check error validation for all seconds duration fields")
	public void CheckErrorValidationForDurationSeconds()  {
		Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateDurationFields(driver, "s");
	}
	@Test(priority=6,description="Test Method to check error validation for all minutes duration fields")
	public void CheckErrorValidationForDurationMins() {
		Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateDurationFields(driver,"m");
	}
	@Test(priority=7,description="Test Method to check error validation for all hours duration fields")
	public void CheckErrorValidationForDurationHours() {
		Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateDurationFields(driver,"h");
	}
	@Test(priority=8,description="Test Method to check error validation for all day duration fields")
	public void CheckErrorValidationForDurationDays()  {
		Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateDurationFields(driver,"d");
	}
	@Test(priority=9,description="Test Method to check error validation for barrier offset fields")
	public void CheckErrorValidationForBarrierOffset() {
		Trading_Action.NavigateToUpDownHigherLower(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateBarrierField(driver,"HigherLower","Payout");	
	}
	@Test(priority=10,description="Test Method to check error validation for payout amount fields")
	public void CheckErrorValidationForPayout()  {	
		Trading_Action.NavigateToUpDownRiseFall(driver, "Forex", "AUD/JPY");
		Trading_Action.ValidateAmountField(driver, "Forex","Payout");
	}
}
