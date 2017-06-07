//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.Constant;
import appModules.Navigation_Action;
import appModules.Resources_Action;
import appModules.Trading_Action;

public class Validate_ResourcesPage {
    public WebDriver driver;
    //Test Method to login into the site
    @Test(priority=0)
    public void Login() {
        //Navigation_Action.Navigate_To_PlatformPage(driver);
        //Navigation_Action.Navigate_To_TradePage(driver);
        driver.navigate().to(Constant.tradeURL);
        Trading_Action.CheckMarketOptions(driver);
        Navigation_Action.Navigate_To_ResourcesPage(driver);
    } 
    //Test Method to navigate to cashier password page
    @Test(priority=1)
    public void checkTitle() {
        Resources_Action.checkTitle(driver);
    }
    //Check empty field validation
    @Test(priority=2)
    public void check_AssetIndex() {
        Resources_Action.link_AssetIndex(driver);
        Resources_Action.checkMarketType(driver);
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