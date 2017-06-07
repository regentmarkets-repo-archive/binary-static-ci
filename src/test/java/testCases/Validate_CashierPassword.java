//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import org.testng.annotations.Test;
import utility.Constant;
import utility.Helper;
import appModules.CashierPassword_Action;
import appModules.Endpoint_Action;
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

    	if(CashierPassword_Page.submitButtom(driver).getText().equals("Unlock Cashier"))
    		UnlockCashier();
        CashierPassword_Action.Execute(driver, Constant.emptyString, Constant.emptyString);
        //Check the error message 
        Assert.assertEquals(CashierPassword_Page.errMsg_1(driver).getText(),"This field is required.");
        Assert.assertEquals(CashierPassword_Page.errMsg_2(driver).getText(),"This field is required.");

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
    @Test(priority=8,description="Check deposit/withdraw cashier lock")
    public void check_depositLock() {
        CashierPassword_Action.depositPage(driver);
    }
    @Test(priority=9,description="Check deposit/withdraw cashier lock")
    public void check_withdrawlock() {
        CashierPassword_Action.withdrawPage(driver);
    }

  //unlock cashier password
    @Test(priority=10)
    //Update cashier password
    public void unlock() {
        CashierPassword_Action.unlockCashier(driver, Constant.cashierPass);
        if(CashierPassword_Page.success_msg(driver).isDisplayed()){
            Assert.assertTrue(CashierPassword_Page.success_msg(driver).isDisplayed());
            System.out.println("Cashier Page Unlocked");
        }
    }
    private void UnlockCashier()
    {
    	CashierPassword_Action.unlockCashier(driver, Constant.cashierPass);
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

    @Test(priority=10,description="Update cashier password")
    public void unlock() {
        CashierPassword_Action.unlockCashier(driver, Constant.cashierPass);

    }
}