package appModules;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import pageObjects.AuthorisedApplications_page;
//Method to check title name and records
public class AuthorisedApplications_Action {
    public static void checkTitle(WebDriver driver) {
        String j= AuthorisedApplications_page.title_page(driver).getText();
        System.out.println("Result : "+ j);
        Assert.assertEquals(j,"Applications"); 
        System.out.println("Total Record Before Revoke: " + AuthorisedApplications_page.count_rows(driver));
        System.out.println("Total Column: " + AuthorisedApplications_page.count_column(driver));

    }
    //Method to revoke token
    public static  void revoke(WebDriver driver) {
        AuthorisedApplications_page.revoke_button(driver).click();

    }
    //Method to check review page is loaded
    public static  void reviewPage(WebDriver driver) {
        Assert.assertTrue(AuthorisedApplications_page.review_title(driver).isDisplayed());
        Assert.assertTrue(AuthorisedApplications_page.scope_list(driver).isDisplayed());
    }
    public static  void cancelPermission(WebDriver driver) {
        AuthorisedApplications_page.cancel_btn(driver).click();
    }
    public static  void grantPermission(WebDriver driver) {
        AuthorisedApplications_page.grant_btn(driver).click();
        Assert.assertEquals(AuthorisedApplications_page.sub_title(driver).getText(),"Keep track of your authorised applications.");
        
    }
}