package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ChangePassword_Page;
import utility.Constant;
import appModules.ChangePassword_Action;
import appModules.Navigation_Action;

public class Validate_ChangePasswordPage extends BaseClass {
	
 @Test(priority=0,description="Test Method to login into the site")
 public void Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
 }
 @Test(priority=1,description="Test Method to navigate to the Change Password page")
 public void NavigateToChangePasswordPage() {
	Navigation_Action.Navigate_To_SecurityPage(driver);
	Navigation_Action.Navigate_To_AccountPasswordPage(driver);
 }
 @Test(priority=2,description="Test Method to check error message when no values are entered in the fields")
 public void Test_RequiredFields_Validation() {
	 ChangePassword_Action.Execute(driver, "", "","");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_CurrentPassword(driver).getText(),"This field is required.");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_NewPassword(driver).getText(),"This field is required.");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_RepeatPassword(driver).getText(),"This field is required.");
 }
 @Test(priority=3,description="Test Method to check error message when less than 6 characters are entered")
 public void Test_MinChars_Validation() {
	 ChangePassword_Action.Execute(driver, Constant.minPassword,Constant.minPassword,Constant.minPassword);
	 Assert.assertEquals(ChangePassword_Page.msg_Error_CurrentPassword(driver).getText(),"You should enter 6-25 characters.");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_NewPassword(driver).getText(),"You should enter 6-25 characters.");
 }
 @Test(priority=4,description="Test Method to check hint message is displayed for new password field")
 public void Test_HintMessage_Validation() {
	 Assert.assertEquals(ChangePassword_Page.msg_Hint_NewPassword(driver).getText(), "Minimum of six lower and uppercase letters with numbers");
 }
 @Test(priority=5,description="Test Method to check error message when weak password is entered")
 public void Test_WeakPassword_Validation(){
	 ChangePassword_Action.Execute(driver, Constant.Password,Constant.weakPassword,Constant.weakPassword);
	 Assert.assertEquals(ChangePassword_Page.msg_Error_NewPassword(driver).getText(),"Password should have lower and uppercase letters with numbers.");
 }
@Test(priority=6,description="Test Method to check error message when new password doesn't match repeat password")
public void Test_DiffPasswords_Validation(){
	ChangePassword_Page.txt_oldPassword(driver).clear();
	ChangePassword_Page.txt_oldPassword(driver).sendKeys(Constant.Password);
	ChangePassword_Page.txt_newPassword(driver).clear();
	ChangePassword_Page.txt_newPassword(driver).sendKeys("New123");
	ChangePassword_Page.txt_repeatPassword(driver).clear();
	ChangePassword_Page.txt_repeatPassword(driver).sendKeys("Rep123");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_RepeatPassword(driver).getText(),"The two passwords that you entered do not match.");
}
@Test(priority=7,description="Test Method to check error message when incorrect old password is entered")
public void Test_IncorrectOldPassword_Validation(){
	 ChangePassword_Action.Execute(driver, "Old123","New123","New123");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_OldPassword(driver).getText(),"Old password is wrong.");
}
@Test(priority=8,description="Test Method to change the current password")
public void Test_ChangeCurrentPassword() throws InterruptedException{
	ChangePassword_Action.Execute(driver,Constant.Password, Constant.NewPassword,Constant.NewPassword);
	Assert.assertEquals(ChangePassword_Page.msg_Success(driver).getText(), "Your password has been changed. Please log in again.");
	System.out.println(ChangePassword_Page.msg_Success(driver).getText());
	Navigation_Action.Navigate_To_LogoutPage(driver);
}
@Test(priority=9,description="Test Method to change to original password")
public void Test_ChangeToOriginalPassword(){
	Navigation_Action.Navigate_To_LoginPage(driver);
  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.NewPassword);
	Navigation_Action.Navigate_To_SecurityPage(driver);
    Navigation_Action.Navigate_To_AccountPasswordPage(driver);
	ChangePassword_Action.Execute(driver,Constant.NewPassword, Constant.Password,Constant.Password);
	Assert.assertEquals(ChangePassword_Page.msg_Success(driver).getText(), "Your password has been changed. Please log in again.");
}

}
