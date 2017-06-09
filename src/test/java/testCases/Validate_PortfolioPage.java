package testCases;

import org.testng.annotations.Test;

import utility.Constant;
import appModules.Login_Action;
import appModules.Navigation_Action;
import appModules.Portfolio_Action;
import appModules.Trading_Action;

public class Validate_PortfolioPage extends BaseClass {
	
	 String referenceNumber;
	
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
	public void TestContractPurchase(){
		Trading_Action.NavigateToUpDownRiseFall(driver,"Volatility Indices", "Volatility 50 Index");
		Trading_Action.ValidateContractTopPurchase(driver,"Volatility 50 Index","1","h","10");
		Trading_Action.CloseViewPopup(driver);
	}
	@Test(priority=3,description="Test Method to navigate to portfolio page")
	  public void NavigateToPortfolioPage() {
		Navigation_Action.Navigate_To_PortfolioPage(driver);
	  }
	@Test(priority=5,description="Test Method to validate sell contract")
	  public void ValidateSellContractPortfolio() {
		Portfolio_Action.ValidatePortfolioSellContract(driver,"Volatility 50 Index","1","h","10");
	  }
}
