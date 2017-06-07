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
    //Method to reject permission 
    public static  void cancelPermission(WebDriver driver) {
        AuthorisedApplications_page.cancel_btn(driver).click();
    }
    //Method to grant permission
    public static  void grantPermission(WebDriver driver) {
        AuthorisedApplications_page.grant_btn(driver).click();
        Assert.assertEquals(AuthorisedApplications_page.sub_title(driver).getText(),"Applications");
        
    }
  //Method to grant permission from login
    public static  void grantPermissionlogin(WebDriver driver) {
        AuthorisedApplications_page.grant_btn(driver).click();
    }
    //mehotd to check is Grantbutton present
    public static void grant(WebDriver driver)
    {
    	AuthorisedApplications_page.grant_btn(driver).click();
    }
}
