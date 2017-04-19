package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.APIToken_Page;
import pageObjects.AuthorisedApplications_page;
import pageObjects.CashierPassword_Page;
import pageObjects.ChangePassword_Page;
import pageObjects.Home_Page;
import pageObjects.Login_History;
import pageObjects.MainAccount_Menu;
import pageObjects.Profile_Page;
import pageObjects.Security_Page;

public class Navigation_Action {
		
	public static void Navigate_To_HomePage(WebDriver driver,String URL){
		driver.get(URL); 
	}
	public static void Navigate_To_LoginPage(WebDriver driver){ 
		Home_Page.btn_Login(driver).click();
	}
	public static void Navigate_To_MainPage(WebDriver driver,String Email,String Password){
		Login_Action.Execute(driver,Email,Password);
	}
	public static void Navigate_To_ProfilePage(WebDriver driver){
		MainAccount_Menu.link_MainAccount(driver).click();
		MainAccount_Menu.link_Profile(driver).click();
	}
	public static void Navigate_To_SecurityPage(WebDriver driver){
		MainAccount_Menu.link_MainAccount(driver).click();
		MainAccount_Menu.link_Security(driver).click();
	}
	public static void Navigate_To_FinancialAssessmentPage(WebDriver driver){
		Profile_Page.link_FinancialAssessment(driver).click();
	}
	public static void Navigate_To_PersonalDetailsPage(WebDriver driver){
		Profile_Page.link_PersonalDetails(driver).click();
	}
	public static void Navigate_To_AccountPasswordPage(WebDriver driver){
	    Security_Page.link_AccountPassword(driver).click();
	    Assert.assertTrue(ChangePassword_Page.PageTitle(driver).isDisplayed());
		System.out.println("The title of the page is : "+ChangePassword_Page.PageTitle(driver).getText());
		Assert.assertEquals(ChangePassword_Page.PageTitle(driver).getText(), "Change Password");
	}
	public static void Navigate_To_LogoutPage(WebDriver driver){
		Logout_Action.Execute(driver);
		Assert.assertTrue(Home_Page.btn_Login(driver).isDisplayed());
	}
	public static void Navigate_To_APITokenPage(WebDriver driver){
	    Security_Page.link_APITokenPage(driver).click();
        Assert.assertTrue(APIToken_Page.title_page(driver).isDisplayed());
        APIToken_Action.checkTitle(driver);
    }
    public static void Navigate_To_LoginHistoryPage(WebDriver driver){
        Security_Page.link_LoginHistoryPage(driver).click();
        Assert.assertTrue(Login_History.title_page(driver).isDisplayed());
        LoginHistory_Action.Execute(driver);
    }
    public static void Navigate_To_CashierPasswordPage(WebDriver driver){
        Security_Page.link_CashierPassword(driver).click();
        Assert.assertTrue(CashierPassword_Page.title_page(driver).isDisplayed());
        Assert.assertTrue(CashierPassword_Page.title_form(driver).isDisplayed());
        CashierPassword_Action.checkTitle(driver);
	}
	public static void Navigate_To_AuthenticationPage(WebDriver driver){
		driver.get("https://staging.binary.com/en/user/authenticate.html");
	}
	public static void Navigate_To_LimitsPage(WebDriver driver){
		Security_Page.link_Limits(driver).click();
	}
	public static void Navigate_To_SelfExclusionPage(WebDriver driver){
		Security_Page.link_SelfExclusion(driver).click();
	}
    public static void Navigate_To_AuthorisedApplicationsPage(WebDriver driver){
        Security_Page.link_AuthorisedApplication(driver).click();
        Assert.assertTrue(AuthorisedApplications_page.title_page(driver).isDisplayed());
        Assert.assertTrue(AuthorisedApplications_page.sub_title(driver).isDisplayed());
    }
    public static void Navigate_To_ChangeAPIEndpointPage(WebDriver driver,String URL){
    	driver.get(URL);
    }
}
