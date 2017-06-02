package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.CashierPassword_Page;
import pageObjects.Cashier_Page;
import pageObjects.MainMenu_Tab;
import utility.Constant;

public class CashierPassword_Action {

    //Method to perform set cashier password action
    public static void Execute(WebDriver driver, String sPass, String sconfirmPass) {
        CashierPassword_Page.cashierPassword(driver).clear();
        CashierPassword_Page.cashierPassword(driver).sendKeys(sPass);
        CashierPassword_Page.confirmPassword(driver).clear();
        CashierPassword_Page.confirmPassword(driver).sendKeys(sconfirmPass);
        CashierPassword_Page.updateButton(driver).click();
    }
    //Method to check title page 
    public static void checkTitle(WebDriver driver) {
        String j= CashierPassword_Page.title_page(driver).getText();
        System.out.println("Result : "+ j);
        Assert.assertEquals("Cashier Password",j); 
    }
    //Method to unlock cashier password 
    public static void unlockCashier(WebDriver driver, String sPass) {
        CashierPassword_Page.cashierPassword(driver).clear();
        CashierPassword_Page.cashierPassword(driver).sendKeys(sPass);
        CashierPassword_Page.updateButton(driver).click(); 
        if(CashierPassword_Page.success_msg(driver).isDisplayed()){
            Assert.assertTrue(CashierPassword_Page.success_msg(driver).isDisplayed());
            System.out.println("Cashier Page Unlocked");
        }
    }
    //Method to check deposit page while cashier is locked
    public static void depositPage(WebDriver driver) {
        MainMenu_Tab.click_cashiermenu(driver).click();
        Assert.assertTrue(Cashier_Page.page_title(driver).isDisplayed());
        Assert.assertTrue(Cashier_Page.sub_title(driver).isDisplayed());
        Cashier_Page.deposit(driver).click();
        Assert.assertEquals(Cashier_Page.title(driver).getText(),"Deposit"); 
        if(Cashier_Page.lock_msg(driver).isDisplayed()){
            Assert.assertEquals(Cashier_Page.lock_msg(driver).getText(),"Your cashier is locked as per your request - to unlock it, please click here.");  
            System.out.println("Deposit Page is Locked");
        }
    } 
    //Method to check withdraw page while cashier is locked
    public static void withdrawPage(WebDriver driver) {
        MainMenu_Tab.click_cashiermenu(driver).click();
        Assert.assertTrue(Cashier_Page.page_title(driver).isDisplayed());
        Assert.assertTrue(Cashier_Page.sub_title(driver).isDisplayed());
        Cashier_Page.withdraw(driver).click();
        Assert.assertEquals(Cashier_Page.title(driver).getText(),"Withdraw"); 
        if(Cashier_Page.lock_msg(driver).isDisplayed()){
            Assert.assertEquals(Cashier_Page.lock_msg(driver).getText(),"Your cashier is locked as per your request - to unlock it, please click here.");  
            System.out.println("Withdraw Page is Locked");
        }
        Cashier_Page.unlock_link(driver).click();
    }
    //Method to check error for empty fields
    public static void checkErrorEmptyFields(WebDriver driver){
            CashierPassword_Action.Execute(driver, Constant.emptyString, Constant.emptyString); 
            Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"This field is required.");
            Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"This field is required.");
    }
    //Method to check error for minimum cashier password
    public static void checkErrorMinChr(WebDriver driver){
            CashierPassword_Action.Execute(driver, Constant.minPassword, Constant.minPassword);
            Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"You should enter 6-25 characters."); 
    }
    //Method to check error for weak password
    public static void checkErrorWeakPwd(WebDriver driver){
            CashierPassword_Action.Execute(driver, Constant.weakPassword, Constant.weakPassword);
            Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"Password should have lower and uppercase letters with numbers.");  
    }
    //Method to check error for different password
    public static void checkErrorDiffPwd(WebDriver driver){
            CashierPassword_Action.Execute(driver, Constant.inv_cashierPass, Constant.cashierPass);   
            Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"The two passwords that you entered do not match.");   
    	
    }
    //Method to check error for same password
    public static void checkErrorSamePwd(WebDriver driver){
            CashierPassword_Action.Execute(driver, Constant.Password, Constant.Password);   
            Assert.assertEquals(CashierPassword_Page.errMsg_3(driver).getText(),"Please use a different password than your login password.");   
    }
    //Method to update cashier password
    public static void updateCashierPwd(WebDriver driver){
            CashierPassword_Action.Execute(driver, Constant.cashierPass, Constant.cashierPass);
            Assert.assertTrue(CashierPassword_Page.success_msg(driver).isDisplayed());
            System.out.println("Cashier Page Locked");  
    }
}
