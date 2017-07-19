package testCases;
/*Developed by: Ehtesham
Description: To Test withdrawal token notification
Development start: July 18, 2017
Development end: 
*/

import org.testng.annotations.Test;

import utility.Constant;
import appModules.Cashier_Action;
import appModules.Navigation_Action;
import appModules.WithdrawalToken_Action;


public class Validate_WithdrawalToken extends BaseClass {
	
  @Test(description = "Validate withdrawal token")
  public void A_TestWithdrawal() throws InterruptedException {
	  
	  Navigation_Action.Navigate_To_LoginPage(driver);
	  Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,Constant.Password);
	  Navigation_Action.Navigate_To_Cashier(driver);
	  Cashier_Action.clickWithdraw(driver);
	  //Thread.sleep(3000);
	  Navigation_Action.Navigate_To_Mailinator(driver);
	  Thread.sleep(5000);
	  WithdrawalToken_Action.checkEmail(driver);
	  WithdrawalToken_Action.openEmail(driver);
	  //WithdrawalToken_Action.readToken(driver);
	  
  }

}
