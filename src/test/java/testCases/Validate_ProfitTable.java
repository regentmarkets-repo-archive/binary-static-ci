package testCases;

import org.testng.annotations.Test;

import utility.Constant;
import appModules.Login_Action;
import appModules.Navigation_Action;
import appModules.ProfitTable_Action;
import appModules.Trading_Action;

public class Validate_ProfitTable extends BaseClass{
	
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
		Trading_Action.ValidateContractTopPurchase(driver,"AUD/JPY","1","h","10");
		Trading_Action.ValidateContractSell(driver);
		Trading_Action.CloseViewPopup(driver);
	}
	@Test(priority=3,description="Test Method to navigate to profit table page")
	  public void NavigateToProfitTablePage() {
		Navigation_Action.Navigate_To_ProfitTablePage(driver);
	  }
	@Test(priority=4,description="Test Method to validate Contract Purchase View")
	  public void ValidateContractPurchaseView() {
		ProfitTable_Action.ValidateViewContract(driver);
		Trading_Action.CloseViewPopup(driver);
	  }
	@Test(priority=5,description="Test Method to count number of rows in Profit Table")
	  public void ValidateProfitTableRows() {
		ProfitTable_Action.ValidateProfitTableEntry(driver);
	  }
}
