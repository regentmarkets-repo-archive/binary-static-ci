package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.APIToken_Page;


public class APIToken_Action {
    //Method to check total token records
    public static void checkTitle(WebDriver driver) {
        String j= APIToken_Page.title_page(driver).getText();
        System.out.println("Result : "+ j);
        Assert.assertEquals("API Token",j); 
        System.out.println("Total Record Before Add New Token: " + APIToken_Page.count_rows(driver));
    }
    public static void ExecuteAddToken(WebDriver driver, String sv_Name) {
        //Method to add New token 
        APIToken_Page.token_name(driver).clear();
        APIToken_Page.token_name(driver).sendKeys(sv_Name);
        APIToken_Page.read_scope(driver).click();
        APIToken_Page.trade_scope(driver).click();
        APIToken_Page.payments_scope(driver).click();
        APIToken_Page.admin_scope(driver).click();
        APIToken_Page.admin_scope(driver).submit();
    } 
    public static void ExecuteDuplicate(WebDriver driver, String sv_Name) {
        //Method to submit duplicate token Name
        APIToken_Page.token_name(driver).clear();
        APIToken_Page.token_name(driver).sendKeys(sv_Name);
        APIToken_Page.read_scope(driver).click();
        APIToken_Page.admin_scope(driver).submit();
    }
    //Method to submit a token name
    public static void Validation(WebDriver driver, String sv_Name){
        APIToken_Page.token_name(driver).sendKeys(sv_Name);
    }
    //Method to delete a token
    public static void deleteToken(WebDriver driver) {
        APIToken_Page.delete_btn(driver).click();
        driver.switchTo().alert().accept();
    }
    //Method to check scope validation
    public static void ScopeValidation(WebDriver driver){
        String checkstatus;
        if(APIToken_Page.read_scope(driver).getAttribute("checked")!="checked") {
            APIToken_Page.read_scope(driver).click(); 
        }
        else
        {
            System.out.println("Checked the checkbox");
        }
    }
    //Method to calculate total token after the test
    public static void ExecuteCount(WebDriver driver){
        driver.navigate().refresh();
        System.out.println("Total Records After Test : " + APIToken_Page.count_rows(driver));
    }

}
