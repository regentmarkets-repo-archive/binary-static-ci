package testCases;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.MainAccount_Menu;
import pageObjects.Security_Page;
import utility.Constant;
import appModules.SetSelfExclusionPage_Action;
import appModules.Login_Action;
import appModules.Navigation_Action;

public class Validate_SelfExclusionPage {
	public WebDriver driver;
	
    //Test Method to login into the site
    @Test(priority=0) 
    public void Login() {
    	Navigation_Action.Navigate_To_LoginPage(driver);
        Login_Action.Execute(driver, Constant.Email, Constant.Password);
        driver.navigate().to(Constant.URL);
    } 
	
    //Test Method to navigate to Self Exclusion page
    @Test(priority=1)
    public void NavigateToSelfExclusionPage() {
    	Navigation_Action.Navigate_To_SelfExclusionPage_ValidateInput(driver);
    }
    
    @Test(priority=2)
    public void TestValidNumber(){
        SetSelfExclusionPage_Action.testValidNumber(driver);
    }
    
    @Test(priority=3)
    public void TestRequiredFieldDate(){
    	SetSelfExclusionPage_Action.testRequiredFieldDate(driver);
    }
    
    @Test(priority=4)
    public void TestValidDate(){
    	SetSelfExclusionPage_Action.testValidDate(driver);
    }
    
    @Test(priority=5)
    public void TestTimeOutSixWeekAfter_TimeOut(){
    	SetSelfExclusionPage_Action.testTimeOutSixWeekAfter_TimeOut(driver);
    }
    
    @Test(priority=6)
    public void TestSixMonthLesser_Exclusion(){
    	SetSelfExclusionPage_Action.testSixMonthLesser_Exclusion(driver);
    }
    
    @Test(priority=7)
    public void TestFiveYearLater_Exclusion(){
    	SetSelfExclusionPage_Action.testFiveYearLater_Exclusion(driver);
    }
    
    @Test(priority=8)
    public void TestYesterdayDate_Timeout(){
    	SetSelfExclusionPage_Action.testYesterdayDate_Timeout(driver);
    }
    
    @Test(priority=9)
    public void TestFiveMinuteAgo_Timeout(){
    	SetSelfExclusionPage_Action.testFiveMinuteAgo_Timeout(driver);
    }
    
    @Test(priority=10)
    public void Refresh(){
    	driver.navigate().refresh();
    }
    
    @Test(priority=10)
    public void TestNotMoreThanPrevious(){
    	SetSelfExclusionPage_Action.testNotMoreThanPrevious(driver);
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();
	  }
	}
