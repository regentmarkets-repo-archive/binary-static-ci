//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import org.testng.annotations.Test;
import utility.Constant;
import appModules.CashierPassword_Action;
import appModules.Navigation_Action;

public class Validate_CashierPassword extends BaseClass {

    @Test(priority=0,description="Test Method to login into the site")
    public void Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
    } 
    @Test(priority=1,description="Test Method to navigate to cashier password page")
    public void NavigateToCashierPasswordPage() {
    	Navigation_Action.Navigate_To_SecurityPage(driver);
    	Navigation_Action.Navigate_To_CashierPasswordPage(driver);
    }
    @Test(priority=2,description="Check empty field validation")
    public void check_emptyField() {
         CashierPassword_Action.checkErrorEmptyFields(driver);
    }
    @Test(priority=3,description="Check validation for minimum cashier password")
    public void check_minpass() {
          CashierPassword_Action.checkErrorMinChr(driver);
    } 
    @Test(priority=4,description="Check validation for invalid cashier password")
    public void check_invPass() {
    	  CashierPassword_Action.checkErrorWeakPwd(driver);
    }
    @Test(priority=5,description="Check validation for different cashier password")
    public void check_diffPass() {
    	CashierPassword_Action.checkErrorDiffPwd(driver);
    }
    @Test(priority=6,description="Check validation for same cashier page and password")
    public void check_samePass() {
    	CashierPassword_Action.checkErrorSamePwd(driver);
    }
    @Test(priority=7,description="Update cashier password")
    public void update_cshrPass() {
    	CashierPassword_Action.updateCashierPwd(driver);
    }
    @Test(enabled=false,description="Check deposit cashier lock")
    public void check_depositLock() {
        CashierPassword_Action.depositPage(driver);
    }
    @Test(enabled=false,description="Check withdraw cashier lock")
    public void check_withdrawlock() {
        CashierPassword_Action.withdrawPage(driver);
    }
    @Test(priority=10,description="Update cashier password")
    public void unlock() {
    	Navigation_Action.Navigate_To_SecurityPage(driver);
    	Navigation_Action.Navigate_To_CashierPasswordPage(driver);
        CashierPassword_Action.unlockCashier(driver, Constant.cashierPass);
    }
}