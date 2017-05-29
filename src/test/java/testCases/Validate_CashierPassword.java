//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import pageObjects.CashierPassword_Page;
import pageObjects.Cashier_Page;
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
        CashierPassword_Action.Execute(driver, Constant.emptyString, Constant.emptyString);
        //Check the error message 
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"This field is required.");
        Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"This field is required.");
    }
    @Test(priority=3,description="Check validation for minimum cashier password")
    public void check_minpass() {
        CashierPassword_Action.Execute(driver, Constant.minPassword, Constant.minPassword);
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"You should enter 6-25 characters.");  
    } 
    @Test(priority=4,description="Check validation for invalid cashier password")
    public void check_invPass() {
        CashierPassword_Action.Execute(driver, Constant.weakPassword, Constant.weakPassword);
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"Password should have lower and uppercase letters with numbers.");  
    }
    @Test(priority=5,description="Check validation for different cashier password")
    public void check_diffPass() {
        CashierPassword_Action.Execute(driver, Constant.inv_cashierPass, Constant.cashierPass);   
        Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"The two passwords that you entered do not match.");  
    }

    @Test(priority=6,description="Check validation for same cashier page and password")
    public void check_samePass() {
        CashierPassword_Action.Execute(driver, Constant.Password, Constant.Password);   
        Assert.assertEquals(CashierPassword_Page.errMsg_3(driver).getText(),"Please use a different password than your login password.");  
    }
    @Test(priority=7,description="Update cashier password")
    public void update_cshrPass() {
        CashierPassword_Action.Execute(driver, Constant.cashierPass, Constant.cashierPass);
        Assert.assertTrue(CashierPassword_Page.success_msg(driver).isDisplayed());
        System.out.println("Cashier Page Locked");
    }
    @Test(enabled=false,description="Check deposit/withdraw cashier lock")
    public void check_depositLock() {
        CashierPassword_Action.depositPage(driver);
        if(Cashier_Page.lock_msg(driver).isDisplayed()){
            Assert.assertEquals(Cashier_Page.lock_msg(driver).getText(),"Your cashier is locked as per your request - to unlock it, please click here.");  
            System.out.println("Deposit Page is Locked");
        }
    }
    @Test(priority=9,description="Check deposit/withdraw cashier lock")
    public void check_withdrawlock() {
        CashierPassword_Action.withdrawPage(driver);
        if(Cashier_Page.lock_msg(driver).isDisplayed()){
            Assert.assertEquals(Cashier_Page.lock_msg(driver).getText(),"Your cashier is locked as per your request - to unlock it, please click here.");  
            System.out.println("Withdraw Page is Locked");
        }
        Cashier_Page.unlock_link(driver).click();
    }

    @Test(priority=10,description="Update cashier password")
    public void unlock() {
        CashierPassword_Action.unlockCashier(driver, Constant.cashierPass);
        if(CashierPassword_Page.success_msg(driver).isDisplayed()){
            Assert.assertTrue(CashierPassword_Page.success_msg(driver).isDisplayed());
            System.out.println("Cashier Page Unlocked");
        }
    }
}