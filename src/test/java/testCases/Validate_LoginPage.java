//TestCase to Login to the site and then Logout with valid user credentials
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import utility.Constant;
import appModules.Login_Action;
import appModules.Navigation_Action;

public class Validate_LoginPage extends BaseClass{

  @Test(priority=0,description="Test Method to login to the site with valid credentials")
  public void Login() {
	  Navigation_Action.Navigate_To_LoginPage(driver);
	  //Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,Constant.Password);
	  Login_Action.checkAuthorizedPageAndLogin(driver, Constant.Email, Constant.Password);
	  
  }
  @Test(priority=1,description="Test Method to logout from the site and validate login button is present")
  public void Logout() {
	  Navigation_Action.Navigate_To_LogoutPage(driver);
  }
  @Test(priority=2,description="Test Method to login with incorrect password")
  public void Login_IncorrectPassword() {
	     String inv_password = "Pass1234";
		 Navigation_Action.Navigate_To_LoginPage(driver);
		 Navigation_Action.Navigate_To_MainPage(driver,Constant.Email,inv_password);
	  	 Assert.assertTrue(Login_Page.err_Login(driver).isDisplayed());
		  if(Login_Page.err_Login(driver).isDisplayed()){
			  System.out.println(Login_Page.err_Login(driver).getText());
			  Assert.assertEquals("Incorrect email or password.",Login_Page.err_Login(driver).getText());
  }}
}
