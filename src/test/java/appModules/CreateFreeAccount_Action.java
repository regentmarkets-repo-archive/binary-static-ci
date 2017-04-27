package appModules;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageObjects.ChangePassword_Page;
import pageObjects.Home_Page;
import pageObjects.NewAccount_Page;
import utility.Constant;
public class CreateFreeAccount_Action {
	private static String verification_page_url="";
	//Method to perform create free account action
	public static void CreateFreeAccount(WebDriver driver, String sEmail)
	{
		//clear the text field for email
		Home_Page.txt_Email(driver).clear();
		//Enter the value in Email text field
		Home_Page.txt_Email(driver).sendKeys(sEmail);
		//Click on CreateFreeAccount button
		Home_Page.btn_CreateFreeAccount(driver).click();
		//get verification page url as to pass token
		verification_page_url=driver.getCurrentUrl();
	}
	public static void VerifyNewAccount(WebDriver driver,String token,String pwd,String cPwd,String c)
	{
		//redirect to verification page from mailbox to create account
		Navigation_Action.Navigate_To_HomePage(driver,Constant.URL+"/en/new_account/virtualws.html");
		//enter verification token
		NewAccount_Page.txt_VerificationToken(driver).sendKeys(token);
		//enter password
		NewAccount_Page.txt_ChoosePassword(driver).sendKeys(pwd);
		//Re-enter password
		NewAccount_Page.txt_ReEnterPassword(driver).sendKeys(cPwd);
		//select country
		Select country = NewAccount_Page.dd_Country(driver);
		country.selectByValue(c);
		//submit
		NewAccount_Page.btn_CreateAccount(driver).click();
		//check client landed on trade
		Assert.assertEquals(NewAccount_Page.IsClientOnTrade(driver).getText(),"Trade");
	}
}
