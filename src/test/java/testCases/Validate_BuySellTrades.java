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
	@Test(priority=2,description="Test Method to validate contract purchase for Forex")
	public void validateContractPurchaseForForex(){
		Trading_Action.NavigateToUpDownRiseFall(driver,"Forex", "AUD/JPY");
		Trading_Action.ValidateContractTopPurchase(driver,"AUD/JPY","15","m","10");
		Trading_Action.CloseViewPopup(driver);
	}
	@Test(priority=3,description="Test Method to validate contract purchase for VolatilityIndices")
	public void validateContractPurchaseForVolatilityIndices(){
		Trading_Action.NavigateToUpDownRiseFall(driver,"Volatility Indices", "Volatility 50 Index");
		Trading_Action.ValidateContractTopPurchase(driver,"Volatility 50 Index","1","h","10");
		Trading_Action.CloseViewPopup(driver);
	}
	@Test(priority=4,description="Test Method to validate contract sell for Volatility Indices")
		public void validateContractSellForVolatilityIndices(){
			Trading_Action.NavigateToUpDownRiseFall(driver,"Volatility Indices", "Volatility 100 Index");
			Trading_Action.ValidateContractTopPurchase(driver,"Volatility 100 Index","1","h","10");
			Trading_Action.ValidateContractSell(driver);
			Trading_Action.CloseViewPopup(driver);
	}
	

}
