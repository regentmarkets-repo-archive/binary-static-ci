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

import pageObjects.MainAccount_Menu;

import pageObjects.Security_Page;
import utility.Constant;
import appModules.CashierPassword_Action;

import appModules.Login_Action;

public class Validate_CashierPassword {
    public WebDriver driver;
    //Test Method to login into the site
    @Test(priority=0)
    public void Login() {
        Login_Action.Execute(driver,Constant.Email,Constant.Password);
    } 
    //Test Method to navigate to cashier password page
    @Test(priority=1)
    public void NavigateToCashierPasswordPage() {
        MainAccount_Menu.link_MainAccount(driver).click();
        MainAccount_Menu.link_Security(driver).click();
        Security_Page.cashierPassword_link(driver).click();
    }
    //Check cashier password page is load properly 
    @Test(priority=2)
    public void CheckPageLoad() {
        Assert.assertTrue(CashierPassword_Page.title_page(driver).isDisplayed());
        Assert.assertTrue(CashierPassword_Page.title_form(driver).isDisplayed());
        CashierPassword_Action.checkTitle(driver);
    }
    //Check empty field validation
    @Test(priority=3)
    public void check_emptyField() {
        CashierPassword_Page.cashierPassword(driver).clear();
        CashierPassword_Page.cashierPassword(driver).sendKeys("");
        CashierPassword_Page.confirmPassword(driver).clear();
        CashierPassword_Page.confirmPassword(driver).sendKeys("");
        CashierPassword_Page.updateButton(driver).click();
        //Check the error message 
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"This field is required.");
        Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"This field is required.");
    }
    //Check validation for minimum cashier password
    @Test(priority=4)
    public void check_minpass() {
        CashierPassword_Page.cashierPassword(driver).clear();
        CashierPassword_Page.cashierPassword(driver).sendKeys("a");
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"You should enter 6-25 characters.");  
    }
   //Check validation for invalid cashier password 
    @Test(priority=5)
    public void check_invPass() {
        CashierPassword_Page.cashierPassword(driver).clear();
        CashierPassword_Page.cashierPassword(driver).sendKeys("sssssssss");
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"Password should have lower and uppercase letters with numbers.");  
    }
    //Check validation for different cashier password
    @Test(priority=6)
    public void check_diffPass() {
        CashierPassword_Page.cashierPassword(driver).clear();
        CashierPassword_Page.cashierPassword(driver).sendKeys("Abcd1234");
        CashierPassword_Page.confirmPassword(driver).clear();
        CashierPassword_Page.confirmPassword(driver).sendKeys("Abcd1235");
        Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"The two passwords that you entered do not match.");  
    }
    
    @Test(priority=7)
    //Check validation for same cashier page and password
    public void check_samePass() {
        CashierPassword_Page.cashierPassword(driver).clear();
        CashierPassword_Page.cashierPassword(driver).sendKeys(Constant.Password);
        CashierPassword_Page.confirmPassword(driver).clear();
        CashierPassword_Page.confirmPassword(driver).sendKeys(Constant.Password);
        CashierPassword_Page.updateButton(driver).click();
        Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"Please use a different password than your login password.");  
    }
    @Test(priority=8)
    //Update cashier password
    public void update_cshrPass() {
        CashierPassword_Action.Execute(driver, Constant.cashierPass, Constant.cashierPass);
       if(CashierPassword_Page.success_msg(driver).isDisplayed()){
           System.out.println(CashierPassword_Page.success_msg(driver).getText());
       }
    }
    //Test Method to start browser session and launch site
    @BeforeTest
    public void launchApplication() {
        ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(Constant.URL);
    }
    //Test Method to close browser session
    @AfterTest
    public void endSession() {
        driver.quit();
    }
}