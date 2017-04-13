package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

import pageObjects.FinancialAssessment_Page;
import pageObjects.Home_Page;
import pageObjects.Login_Page;
import pageObjects.LostPassword_Page;
import pageObjects.ResetPassword_Page;

public class LossPassword_Action {
	
	public static void Execute(WebDriver driver){
		
		//Click on the login button in home page
		Home_Page.btn_Login(driver).click();
		
		// Click on 'Lost Password?'
		Login_Page.lost_password(driver).click();
		
		// Clear the text field for Email
		LostPassword_Page.txt_Email(driver).clear();
		
		// Input own email
		LostPassword_Page.txt_Email(driver).sendKeys("sgergs3r@binary.com");
		
		// Click 'Reset Password'
		LostPassword_Page.btn_Reset(driver).click();
		
		// Clear the text field for New Password
		ResetPassword_Page.txt_NewPassword(driver).clear();
		
		// Input own password
		ResetPassword_Page.txt_NewPassword(driver).sendKeys("HelloWorld123");
		
		// Clear the text field for Confirm Password
		ResetPassword_Page.txt_RepeatPassword(driver).clear();
		
		// Input password again
		ResetPassword_Page.txt_RepeatPassword(driver).sendKeys("HelloWorld123");
		
		// Click 'real account' checkbox
		ResetPassword_Page.checkbox_RealAccount(driver).click();
		
		// Select the 'Date of Birth'
		ResetPassword_Page.field_DateOfBirth(driver).click();
		
		// Select Year '1997'
		Select date_of_birth_year = new Select(ResetPassword_Page.select_dobYear(driver));
		date_of_birth_year.selectByValue("1997");
		
		// Select Month '8' (Possible values: 0-11)
		Select date_of_birth_month = new Select(ResetPassword_Page.select_dobMonth(driver));
		date_of_birth_month.selectByValue("7");
		
		// Select date '21'
		ResetPassword_Page.select_dobDay(driver).click();
		
		// Clear Verification Field
		ResetPassword_Page.txt_Verification(driver).clear();
		
		// Insert Random (8 characters)
		ResetPassword_Page.txt_Verification(driver).sendKeys("HelloWor");
		
		// Click 'Reset Password'
		ResetPassword_Page.btn_Reset(driver).click();
		
		// Click for retry if token is invalid or expired
		ResetPassword_Page.link_retry(driver).click();
	}
}
