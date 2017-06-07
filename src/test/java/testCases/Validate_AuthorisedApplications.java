package testCases;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import pageObjects.AuthorisedApplications_page;
import utility.Constant;
import utility.Helper;
import appModules.AuthorisedApplications_Action;
import appModules.Endpoint_Action;
import appModules.Login_Action;
import appModules.Navigation_Action;



public class Validate_AuthorisedApplications extends BaseClass {

    @Test(priority=0,description="Test method to login")
    public void Login() {
        Navigation_Action.Navigate_To_LoginPage(driver);
        Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
    } 
    //
    @Test(priority=1,description="Test Method to navigate to Authorised Application page")
    public void NavigateToAuthorisedAppsPage() {
    	if(AuthorisedApplications_page.BtnGrant(driver))
    		AuthorisedApplications_Action.grant(driver);
        Navigation_Action.Navigate_To_SecurityPage(driver);
        Navigation_Action.NavigateToAuthorisedApplicationsPage(driver);
    }
    @Test(priority=2,description="Test method to check API Token Page is loaded")
    public void CheckPageLoad() {
        AuthorisedApplications_Action.checkTitle(driver);
    } 
    @Test(priority=3,description="Test method to revoke authorized application")
    public void revoke_authapps() {
        AuthorisedApplications_Action.revoke(driver);
        driver.switchTo().alert().accept();
        driver.navigate().refresh();
    }
    @Test(priority=4,description="Test method to check login")
    public void login() {
        Navigation_Action.Navigate_To_LoginPage(driver);
        Login_Action.Execute(driver,Constant.Email,Constant.Password);
    }
    @Test(priority=5,description="Test method to check review permission page")
    public void checkReviewPage() {
        AuthorisedApplications_Action.reviewPage(driver);
        assertTrue(AuthorisedApplications_page.scope_list(driver).isDisplayed());
    }
    @Test(priority=6,description="Test method to check reject permission page")
    public void reject() {
        AuthorisedApplications_Action.cancelPermission(driver);
        Navigation_Action.Navigate_To_LoginPage(driver);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Login_Action.Execute(driver,Constant.Email,Constant.Password);
    }  
    @Test(priority=7,description="Test method to check grant permission page")
    public void grant() {
        AuthorisedApplications_Action.grantPermission(driver);
    }


    //Test Method to start browser session and launch binary site
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
