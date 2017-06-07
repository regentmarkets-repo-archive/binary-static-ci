//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import pageObjects.Login_History;
import utility.Constant;
import utility.Helper;
import appModules.Endpoint_Action;
import appModules.LoginHistory_Action;
import appModules.Navigation_Action;

public class Validate_LoginHistoryPage extends BaseClass {
    
    @Test(priority=0,description="Test method to  login  page")
    public void reset_Login() {
        Navigation_Action.Navigate_To_LoginPage(driver);
        Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,Constant.Password);
    } 
    @Test(priority=1,description="Test method to logout")
    public void logout() {
        Navigation_Action.Navigate_To_LogoutPage(driver);
    }
    @Test(priority=2,description="Test Method to login into the site") 
    public void A_Login_IncorrectPassword() {
        String password = RandomStringUtils.randomAlphanumeric(6);
        Navigation_Action.Navigate_To_LoginPage(driver);
        Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,password);
    } 
    @Test(priority=3)
    public void Login() {
        Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,Constant.Password);
    } 
    @Test(priority=4,description="Test Method to navigate to Login History page")
    public void NavigateToLoginHistoryPage() {
        Navigation_Action.Navigate_To_SecurityPage(driver);
        Navigation_Action.Navigate_To_LoginHistoryPage(driver);
    }
    @Test(priority=5,description="Check new entries")
    public void Check_NewEntries() {
        Assert.assertTrue(Login_History.first_row(driver).isDisplayed());
        Assert.assertTrue(Login_History.second_row(driver).isDisplayed());
        LoginHistory_Action.ExecuteCheckLatest(driver);
    }
    @Test(priority=6,description="Check number of records")
    public void CheckTotalRows() {
        Assert.assertTrue(Login_History.title_page(driver).isDisplayed());
        LoginHistory_Action.ExecuteCount(driver); 
    }

    //Test Method to start browser session and launch site
    @BeforeTest
    public void launchApplication() {
    	if(Constant.testExeEnv.equals("Local"))
    	{
    		ChromeDriverManager.getInstance().setup();
    		driver = new ChromeDriver();
    	}
    	else
    	{
    		driver = Helper.BrowserStackConfigurations();
    	}
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //driver.get(Constant.URL);
            Helper helperutility = new Helper();//get current ticks
          	helperutility.AddCookieOfQaServer(driver);
          	Navigation_Action.Navigate_To_HomePage(driver,Constant.URL+"/en/endpoint.html");
          	Endpoint_Action.SetServer(driver,Constant.targetserver,Constant.appId);
            driver.get(Constant.URL+"/en/endpoint.html");
    }
    //Test Method to close browser session
    @AfterTest
    public void endSession() {
        driver.quit();
    }

}