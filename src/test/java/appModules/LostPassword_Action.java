package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.LostPassword_Page;
import pageObjects.ResetPassword_Page;

public class LostPassword_Action {
	
	public static void executeEmail(WebDriver driver, String email){
		// Clear the text field for Email
		LostPassword_Page.txt_Email(driver).clear();
		// Input own email
		LostPassword_Page.txt_Email(driver).sendKeys(email);
		// Click 'Reset Password'
		LostPassword_Page.btn_Reset(driver).click();
	}
	public static void invalidPasswordLength(WebDriver driver, String password){
		// Clear the text field for New Password
		ResetPassword_Page.txt_NewPassword(driver).clear();
		// Input own password
		ResetPassword_Page.txt_NewPassword(driver).sendKeys(password);
	}
	public static void executeDOB(WebDriver driver, String year, String month){
		// Select the 'Date of Birth'
		ResetPassword_Page.field_DateOfBirth(driver).click();		
		// Select Year 
		Select date_of_birth_year = new Select(ResetPassword_Page.select_dobYear(driver));
		date_of_birth_year.selectByValue(year);
		// Select Month (Possible values: 0-11)
		Select date_of_birth_month = new Select(ResetPassword_Page.select_dobMonth(driver));
		date_of_birth_month.selectByValue(month);
		// Select date '21'
		ResetPassword_Page.select_dobDay(driver).click();
	}
	public static void passwordMatchTest(WebDriver driver, String new_password, String confirm_password){
		// Clear the text field for New Password
		ResetPassword_Page.txt_NewPassword(driver).clear();
		// Input own password
		ResetPassword_Page.txt_NewPassword(driver).sendKeys(new_password);
		// Clear the text field for Confirm Password
		ResetPassword_Page.txt_RepeatPassword(driver).clear();
		// Input password again
		ResetPassword_Page.txt_RepeatPassword(driver).sendKeys(confirm_password);
	}
	public static void shortToken(WebDriver driver, String token){	
		// Clear Verification Field
		ResetPassword_Page.txt_Verification(driver).clear();
		// Insert Random (8 characters)
		ResetPassword_Page.txt_Verification(driver).sendKeys(token);
	}
	public static void Execute(WebDriver driver){	
		// Click for retry if token is invalid or expired
		ResetPassword_Page.link_retry(driver).click();
	}
}

