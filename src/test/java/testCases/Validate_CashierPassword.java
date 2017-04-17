//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjects.CashierPassword_Page;
import pageObjects.Cashier_Page;
import utility.Constant;
import appModules.CashierPassword_Action;
import appModules.ChangeAPIEndpoint_Action;
import appModules.Navigation_Action;

public class Validate_CashierPassword {
    public WebDriver driver;
    //Test Method to login into the site
    @Test(priority=0)
    public void Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
    } 
    //Test Method to navigate to cashier password page
    @Test(priority=1)
    public void NavigateToCashierPasswordPage() {
    	Navigation_Action.Navigate_To_SecurityPage(driver);
    	Navigation_Action.Navigate_To_CashierPasswordPage(driver);
    }
    //Check empty field validation
    @Test(priority=2)
    public void check_emptyField() {
        CashierPassword_Action.Execute(driver, Constant.emptyString, Constant.emptyString);
        //Check the error message 
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"This field is required.");
        Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"This field is required.");
    }
    //Check validation for minimum cashier password
    @Test(priority=3)
    public void check_minpass() {
        CashierPassword_Action.Execute(driver, Constant.minPassword, Constant.minPassword);
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"You should enter 6-25 characters.");  
    }
    //Check validation for invalid cashier password 
    @Test(priority=4)
    public void check_invPass() {
        CashierPassword_Action.Execute(driver, Constant.weakPassword, Constant.weakPassword);
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"Password should have lower and uppercase letters with numbers.");  
    }
    //Check validation for different cashier password
    @Test(priority=5)
    public void check_diffPass() {
        CashierPassword_Action.Execute(driver, Constant.inv_cashierPass, Constant.cashierPass);   
        Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"The two passwords that you entered do not match.");  
    }

    @Test(priority=6)
    //Check validation for same cashier page and password
    public void check_samePass() {
        CashierPassword_Action.Execute(driver, Constant.Password, Constant.Password);   
        Assert.assertEquals(CashierPassword_Page.errMsg_3(driver).getText(),"Please use a different password than your login password.");  
    }
    @Test(priority=7)
    //Update cashier password
    public void update_cshrPass() {
        CashierPassword_Action.Execute(driver, Constant.cashierPass, Constant.cashierPass);
        Assert.assertTrue(CashierPassword_Page.success_msg(driver).isDisplayed());
        System.out.println("Cashier Page Locked");
    }
    @Test(priority=8)
    //Check deposit/withdraw cashier lock ]
    public void check_depositLock() {
        CashierPassword_Action.depositPage(driver);
        if(Cashier_Page.lock_msg(driver).isDisplayed()){
            Assert.assertEquals(Cashier_Page.lock_msg(driver).getText(),"Your cashier is locked as per your request - to unlock it, please click here.");  
            System.out.println("Deposit Page is Locked");
        }
    }
    @Test(priority=9)
    //Check deposit/withdraw cashier lock ]
    public void check_withdrawlock() {
        CashierPassword_Action.withdrawPage(driver);
        if(Cashier_Page.lock_msg(driver).isDisplayed()){
            Assert.assertEquals(Cashier_Page.lock_msg(driver).getText(),"Your cashier is locked as per your request - to unlock it, please click here.");  
            System.out.println("Withdraw Page is Locked");
        }
        Cashier_Page.unlock_link(driver).click();
    }

    @Test(priority=10)
    //Update cashier password
    public void unlock() {
        CashierPassword_Action.unlockCashier(driver, Constant.cashierPass);
        if(CashierPassword_Page.success_msg(driver).isDisplayed()){
            Assert.assertTrue(CashierPassword_Page.success_msg(driver).isDisplayed());
            System.out.println("Cashier Page Unlocked");
        }
    }
    //Test Method to start browser session and launch site
    @BeforeTest
    public void launchApplication() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Navigation_Action.Navigate_To_ChangeAPIEndpointPage(driver,Constant.Endpoint_url);
		ChangeAPIEndpoint_Action.Execute(driver, Constant.AppID, Constant.Server);
    }
    //Test Method to close browser session
    @AfterTest
    public void endSession() {
        driver.quit();
    }
}