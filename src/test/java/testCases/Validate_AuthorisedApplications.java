package testCases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjects.AuthorisedApplications_page;
import utility.Constant;
import appModules.AuthorisedApplications_Action;
import appModules.ChangeAPIEndpoint_Action;
import appModules.Login_Action;
import appModules.Navigation_Action;



public class Validate_AuthorisedApplications {
    public WebDriver driver;
    //Test method to login 
    @Test(priority=0)
    public void Login() {
        Navigation_Action.Navigate_To_LoginPage(driver);
        Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
    } 
    //Test Method to navigate to Authorised Application  page
    @Test(priority=1)
    public void NavigateToAuthorisedAppsPage() {
        Navigation_Action.Navigate_To_SecurityPage(driver);
        Navigation_Action.Navigate_To_AuthorisedApplicationsPage(driver);
    }
    //Test method to check API Token Page is loaded 
    @Test(priority=2)
    public void CheckPageLoad() {
        AuthorisedApplications_Action.checkTitle(driver);
    }
    //Test method to revoke authorized application 
    @Test(priority=3)
    public void revoke_authapps() {
        AuthorisedApplications_Action.revoke(driver);
        driver.switchTo().alert().accept();
        driver.navigate().refresh();
    }

    //Test method to check login
    @Test(priority=4)
    public void login() {
        Navigation_Action.Navigate_To_LoginPage(driver);
        Login_Action.Execute(driver,Constant.Email,Constant.Password);

    }
    //Test method to check review permission page
    @Test(priority=5)
    public void checkReviewPage() {
        AuthorisedApplications_Action.reviewPage(driver);
        assertTrue(AuthorisedApplications_page.scope_list(driver).isDisplayed());
    }
    //Test method to check reject permission page
    @Test(priority=6)
    public void reject() {
        AuthorisedApplications_Action.cancelPermission(driver);
        Navigation_Action.Navigate_To_LoginPage(driver);
        Login_Action.Execute(driver,Constant.Email,Constant.Password);
    }   
    //Test method to check grant permission page
    @Test(priority=7)
    public void grant() {
        AuthorisedApplications_Action.grantPermission(driver);
    }

    //Test Method to start browser session and launch binary site
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
