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
	public void validateContractPurchase(){
		Trading_Action.NavigateToUpDownRiseFall(driver,"Volatility Indices", "Volatility 50 Index");
		Trading_Action.ValidateContractTopPurchase(driver,"Volatility 50 Index","15","m","10");
		Trading_Action.CloseViewPopup(driver);
	}
	@Test(priority=3,description="Test Method to validate contract sell for Volatility Indices")
		public void validateContractSell(){
			Trading_Action.NavigateToUpDownRiseFall(driver,"Volatility Indices", "Volatility 100 Index");
			Trading_Action.ValidateContractTopPurchase(driver,"Volatility 100 Index","1","h","10");
			Trading_Action.ValidateContractSell(driver);
			Trading_Action.CloseViewPopup(driver);
	}
	@Test(priority=4,description="Test Method to validate contract purchase for Volatility Indices Asians")
	public void validateAsianContractsPurchase(){
		Trading_Action.NavigateToAsians(driver, "Volatility Indices", "Volatility 25 Index");
		Trading_Action.ValidateAsianContracts(driver,"Volatility 25 Index","5","t","10");
	}
	@Test(priority=5,description="Test Method to validate contract purchase for Volatility Indices Digits")
	public void validateDigitsContractsPurchase(){
		Trading_Action.NavigateToDigitsMatchesDiffers(driver, "Volatility Indices", "Volatility 10 Index");
		Trading_Action.ValidateDigitsContracts(driver,"Volatility 10 Index","5","t","10","2");
	}
}
