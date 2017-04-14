//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.Login_History;
import utility.Constant;
import appModules.LoginHistory_Action;
import appModules.Navigation_Action;

public class Validate_LoginHistoryPage {
    public WebDriver driver;
    //Test Method to login into the site
    @Test(priority=0) 
    public void A_Login_IncorrectPassword() {
        String password = RandomStringUtils.randomAlphanumeric(6);
		 Navigation_Action.Navigate_To_LoginPage(driver);
		 Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,password);
    } 
    @Test(priority=1)
    public void Login() {
    	  Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,Constant.Password);
    } 
    //Test Method to navigate to Login HIstory page
    @Test(priority=2)
    public void NavigateToLoginHistoryPage() {
    	Navigation_Action.Navigate_To_SecurityPage(driver);
    	Navigation_Action.Navigate_To_LoginHistoryPage(driver);
    }
    //Check new entries
    @Test(priority=3)
    public void Check_NewEntries() {
        Assert.assertTrue(Login_History.first_row(driver).isDisplayed());
        Assert.assertTrue(Login_History.second_row(driver).isDisplayed());
        LoginHistory_Action.ExecuteCheckLatest(driver);
    }
    //Check number of records 
    @Test(priority=4)
    public void CheckTotalRows() {
        Assert.assertTrue(Login_History.title_page(driver).isDisplayed());
        LoginHistory_Action.ExecuteCount(driver); 
    }
    //Test Method to start browser session and launch site
    @BeforeTest
    public void launchApplication() {
        ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Navigation_Action.Navigate_To_HomePage(driver, Constant.URL);
    }
    //Test Method to close browser session
    @AfterTest
    public void endSession() {
        driver.quit();
    }
}