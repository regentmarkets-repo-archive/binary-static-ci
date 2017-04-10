package testCases;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.APIToken_Page;
import pageObjects.MainAccount_Menu;
import pageObjects.Security_Page;
import utility.Constant;
import appModules.APIToken_Action;
import appModules.Login_Action;



public class Validate_APITokenPage {
    public WebDriver driver;
    //Test method to login 
    @Test(priority=0)
    public void Login() {
        Login_Action.Execute(driver,Constant.Email,Constant.Password);
    } 
    //Test Method to navigate to API Token page
    @Test(priority=1)
    public void NavigateToAPITokenPage() {
        MainAccount_Menu.link_MainAccount(driver).click();
        MainAccount_Menu.link_Security(driver).click();
        Security_Page.link_APITokenPage(driver).click();
    }
    //Test method to check API Token Page is loaded 
    @Test(priority=2)
    public void CheckPageLoad() {
        Assert.assertTrue(APIToken_Page.title_page(driver).isDisplayed());
        APIToken_Action.checkTitle(driver);
    }
    //Test method to check form validation for minimum token name
    @Test (dependsOnMethods = { "CheckScopeValidation"})
    public void CheckMinChar() {
        APIToken_Action.Validation(driver, Constant.inv_tokenName);
        if(APIToken_Page.error_field(driver).isDisplayed()){
            System.out.println("Field validation for minimum character is working");
        }
        Assert.assertEquals(APIToken_Page.error_field(driver).getText(), "You should enter 2-32 characters.");
    }
    //Test method to check form validation for invalid token name
    @Test (dependsOnMethods = { "CheckMinChar","CheckScopeValidation","AddNewToken","DeleteToken"})
    public void CheckInvalidName() {
        APIToken_Action.Validation(driver, Constant.inv_tokenName2);
        if(APIToken_Page.error_field(driver).isDisplayed()){
            System.out.println("Field validation for invalid token name is working");
        }
        Assert.assertEquals(APIToken_Page.error_field(driver).getText(), "Only letters, numbers, space, _ are allowed.");

    }
    //Test method to check duplicate Token name
    @Test (dependsOnMethods = { "CheckMinChar","CheckScopeValidation"})
    public void DuplicateName() {
        APIToken_Action.ExecuteDuplicate(driver, Constant.DuplicateName);
        if(APIToken_Page.nameerror_msg(driver).isDisplayed()){
            System.out.println("Field validation for invalid token name is working");
        }
        Assert.assertEquals(APIToken_Page.nameerror_msg(driver).getText(), "The name is taken.");
    }
    //Test method to check scope validation 
    @Test(priority=3)
    public void CheckScopeValidation() {
        APIToken_Action.ScopeValidation(driver);
        if(APIToken_Page.scoperror_field(driver).isDisplayed()){
            System.out.println("Scope validation is working ");
        }
        Assert.assertEquals(APIToken_Page.scoperror_field(driver).getText(), "Please select at least one scope");
    }
    //Test method to Add New Token
    @Test (dependsOnMethods = { "CheckMinChar","CheckScopeValidation","DuplicateName"})
    public void AddNewToken() {
        APIToken_Action.ExecuteAddToken(driver, Constant.v_tokenName);
        if(APIToken_Page.succes_msg(driver).isDisplayed()){
            System.out.println(APIToken_Page.succes_msg(driver).getText());
        }
        Assert.assertEquals(APIToken_Page.succes_msg(driver).getText(), "New token created.");
        System.out.println("Total Records After Add New Token : " + APIToken_Page.count_rows(driver));
    }
    //Test method to delete newly created Token
    @Test (dependsOnMethods = { "CheckMinChar","CheckScopeValidation","DuplicateName"
            ,"AddNewToken"})
    public void DeleteToken() {
        APIToken_Action.deleteToken(driver);
        driver.switchTo().alert().accept();
    } 

    //Test method to check total records after the test
    @Test (dependsOnMethods = { "CheckMinChar","CheckScopeValidation","DuplicateName"
            ,"AddNewToken","DeleteToken","CheckInvalidName"})
    public void RowCount() {
        APIToken_Action.ExecuteCount(driver);
    }  
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
