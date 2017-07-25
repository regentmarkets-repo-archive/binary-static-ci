//Test case to test the lost password feature
package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import utility.Constant;
import pageObjects.LostPassword_Page;
import pageObjects.ResetPassword_Page;
import appModules.LostPassword_Action;
import appModules.Navigation_Action;

public class Validate_LostPassword extends BaseClass{
	
	@Test(priority=0,description="Test Method to navigate to reset passsword page")
	public void A_navigateToLostPassword() {
		  Navigation_Action.Navigate_To_HomePage(driver, Constant.URL);
		  Navigation_Action.Navigate_To_LostPasswordPage(driver);
	  }
	@Test(enabled=false,description="Test method to check if the email field is empty")
	public void testEmailEmpty(){	
		// Clear the field
		LostPassword_Page.txt_Email(driver).clear();
		// Submit the form
		LostPassword_Page.btn_Reset(driver).click();
		// Check error message displayed for the field
		//Assert.assertEquals(LostPassword_Page.errorEmail(driver).getText(), "This field is required.");
		System.out.println("Error message displayed (No email)");
	}
	@Test(priority=2,description="Test method to validate invalid emails")
	public void testEmailInvalid(){
		// Clear the field
		LostPassword_Page.txt_Email(driver).clear();
		LostPassword_Page.txt_Email(driver).sendKeys("!@!#$@#$@gmail.com");
		// Submit the form
		LostPassword_Page.btn_Reset(driver).click();
		// Check error message displayed for the field
		Assert.assertEquals(LostPassword_Page.errorEmail(driver).getText(), "Invalid email address");
		System.out.println("Error message displayed (Invalid)");
		//LostPassword_Action.Execute(driver);
	}
	@Test(priority=3,description="Use dummy email to send")
	public void setEmail(){
		LostPassword_Action.executeEmail(driver, "tazeek123@binary.com");
	}
	@Test(priority=4,description="Test method to check if all fields are empty")
	public void testEmptyFields(){
		// Click 'Reset Password'
		ResetPassword_Page.btn_Reset(driver).click();
		// Check error message displayed for the field
		Assert.assertEquals(ResetPassword_Page.errorReset(driver).getText(), "This field is required.");
		System.out.println("All fields are empty");
	}
	@Test(priority=5,description="Check for length validity of password")
	public void testValidPasswordLength(){
		// Must be 6-25 characters
		LostPassword_Action.invalidPasswordLength(driver, "abcde");
		// Check error message displayed for the field
		if(ResetPassword_Page.errorNewPassword(driver).isDisplayed()){
			System.out.println("New password is short");
		}
	}
	@Test(priority=6,description="Check for overall validity of password")
	public void testValidPasswordOverall(){
		// Must contain an uppercase, lowercase, number and 6-25 characters
		LostPassword_Action.invalidPasswordLength(driver, "abcdeAbcde");
		// Check error message displayed for the field
		if(ResetPassword_Page.errorNewPassword(driver).isDisplayed()){
			System.out.println("New password requirements not met");
		}
	}
	@Test(priority=7,description="Check if passwords match")
	public void testPasswordMatch(){
		// Use password and new password (Constant)
		LostPassword_Action.passwordMatchTest(driver, Constant.Password, Constant.NewPassword);
		// Check if error message displayed for the field
		if(ResetPassword_Page.errorMatchPassword(driver).isDisplayed()){
			System.out.println("Passwords do not match");
		}
	}
	@Test(priority=8,description="Set the fields for Date of birth")
	public void setDOB(){
		// Click 'real account' checkbox
		ResetPassword_Page.checkbox_RealAccount(driver).click();
		// Set values
		LostPassword_Action.executeDOB(driver, "1995", "5");
		System.out.println("DOB set");
	}
	@Test(priority=9,description="Test using valid input")
	public void resetPassword(){	
		// Token input
		LostPassword_Action.shortToken(driver, "Abcd1234");
		// Password input
		LostPassword_Action.passwordMatchTest(driver, Constant.NewPassword, Constant.NewPassword);
		// Click 'Reset Password'
		ResetPassword_Page.btn_Reset(driver).click();
	}
	@Test(priority=10,description="Test if went to different page")
	public void linkRetry(){
		// Link to retry will be displayed
		if(ResetPassword_Page.link_retry(driver).isDisplayed()){
			System.out.println("Please retry");
		}
	}
	@Test(priority=11,description="Test to see if went back to 'send token by email' page")
	public void resetEmailPage(){	
		// Click link 
		ResetPassword_Page.link_retry(driver).click();
		// Verify if in correct page or not
		testEmailEmpty();
	}
}

