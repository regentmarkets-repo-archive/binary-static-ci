package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.ChangePassword_Page;
import pageObjects.Home_Page;
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
	
	
	

}
