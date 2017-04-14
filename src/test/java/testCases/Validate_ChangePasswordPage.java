package testCases;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ChangePassword_Page;
import pageObjects.MainAccount_Menu;
import pageObjects.Security_Page;
import utility.Constant;
import appModules.ChangePassword_Action;
import appModules.Login_Action;
import appModules.Logout_Action;

public class Validate_ChangePasswordPage {
	
 public WebDriver driver;
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
 //Test Method to login into the site
 @Test(priority=0)
 public void Login() {
	  	Login_Action.Execute(driver,Constant.Email,Constant.Password);
 }
 //Test Method to navigate to the Change Password page
 @Test(priority=1)
 public void NavigateToChangePasswordPage() {
	  MainAccount_Menu.link_MainAccount(driver).click();
      MainAccount_Menu.link_Security(driver).click();
      Security_Page.link_AccountPassword(driver).click();
 }
 //Test Method to validate title of the page
 @Test(priority=2)
 public void Check_PageLoad() {
	 Assert.assertTrue(ChangePassword_Page.PageTitle(driver).isDisplayed());
	 System.out.println("The title of the page is : "+ChangePassword_Page.PageTitle(driver).getText());
	 Assert.assertEquals(ChangePassword_Page.PageTitle(driver).getText(), "Change Password");
 }
 
 //Test Method to check error message when no values are entered in the fields
 @Test(priority=3)
 public void Test_RequiredFields_Validation() {
	 ChangePassword_Action.Execute(driver, "", "","");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_CurrentPassword(driver).getText(),"This field is required.");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_NewPassword(driver).getText(),"This field is required.");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_RepeatPassword(driver).getText(),"This field is required.");
 }
 //Test Method to check error message when less than 6 characters are entered
 @Test(priority=4)
 public void Test_MinChars_Validation() {
	 String minPassword=RandomStringUtils.randomNumeric(5);
	 ChangePassword_Action.Execute(driver, minPassword,minPassword,minPassword);
	 Assert.assertEquals(ChangePassword_Page.msg_Error_CurrentPassword(driver).getText(),"You should enter 6-25 characters.");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_NewPassword(driver).getText(),"You should enter 6-25 characters.");
 }
 //Test Method to check hint message is displayed for new password field
 @Test(priority=5)
 public void Test_HintMessage_Validation() {
	 Assert.assertEquals(ChangePassword_Page.msg_Hint_NewPassword(driver).getText(), "Minimum of six lower and uppercase letters with numbers");
 }
 //Test Method to check error message when weak password is entered
 @Test(priority=6)
 public void Test_WeakPassword_Validation(){
	 String weakPassword=RandomStringUtils.randomAlphabetic(6);
	 ChangePassword_Action.Execute(driver, Constant.Password,weakPassword,weakPassword);
	 Assert.assertEquals(ChangePassword_Page.msg_Error_NewPassword(driver).getText(),"Password should have lower and uppercase letters with numbers.");
 }
//Test Method to check error message when new password doesn't match repeat password
@Test(priority=7)
public void Test_DiffPasswords_Validation(){
	ChangePassword_Page.txt_oldPassword(driver).clear();
	ChangePassword_Page.txt_oldPassword(driver).sendKeys(Constant.Password);
	ChangePassword_Page.txt_newPassword(driver).clear();
	ChangePassword_Page.txt_newPassword(driver).sendKeys("New123");
	ChangePassword_Page.txt_repeatPassword(driver).clear();
	ChangePassword_Page.txt_repeatPassword(driver).sendKeys("Rep123");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_RepeatPassword(driver).getText(),"The two passwords that you entered do not match.");
}
//Test Method to check error message when incorrect old password is entered
@Test(priority=8)
public void Test_IncorrectOldPassword_Validation(){
	 ChangePassword_Action.Execute(driver, "Old123","New123","New123");
	 Assert.assertEquals(ChangePassword_Page.msg_Error_OldPassword(driver).getText(),"Old password is wrong.");
}

//Test Method to change the current password
@Test(priority=9)
public void Test_ChangeCurrentPassword() throws InterruptedException{
	ChangePassword_Action.Execute(driver,Constant.Password, Constant.NewPassword,Constant.NewPassword);
	Assert.assertEquals(ChangePassword_Page.msg_Success(driver).getText(), "Your password has been changed. Please log in again.");
	System.out.println(ChangePassword_Page.msg_Success(driver).getText());
	Logout_Action.Execute(driver);
}
//Test Method to change to original password
@Test(priority=10)
public void Test_ChangeToOriginalPassword(){
	Login_Action.Execute(driver,Constant.Email,Constant.NewPassword);
	MainAccount_Menu.link_MainAccount(driver).click();
    MainAccount_Menu.link_Security(driver).click();
    Security_Page.link_AccountPassword(driver).click();
	ChangePassword_Action.Execute(driver,Constant.NewPassword, Constant.Password,Constant.Password);
	Assert.assertEquals(ChangePassword_Page.msg_Success(driver).getText(), "Your password has been changed. Please log in again.");
}

}
