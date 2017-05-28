package testCases;


import org.testng.annotations.Test;
import utility.Constant;
import appModules.Login_Action;
import appModules.Navigation_Action;
import appModules.Trading_Action;

public class Validate_BuySellTrades extends BaseClass {
	
	@Test(priority=0,description="Test Method to Login to binary site")
	public void Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
	  	Login_Action.SwitchToVirtualAccount(driver);
	}
	@Test(priority=1,description="Test Method to navigate to trading page")
	  public void NavigateToTradePage() {
		Navigation_Action.Navigate_To_TradingPage(driver);
	  }
	@Test(priority=2,description="Test Method to validate contract purchase for Volatility Indices")
	public void validateContractPurchaseForVolatilityIndices(){
		Trading_Action.NavigateToUpDownRiseFall(driver,"Forex", "AUD/JPY");
		Trading_Action.ValidateContractTopPurchase(driver,"AUD/JPY","15","m","10");
	}

}
