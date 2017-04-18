//Test case to test the lost password feature
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Constant;

import pageObjects.Home_Page;
import pageObjects.Login_Page;
import pageObjects.LostPassword_Page;
import pageObjects.ResetPassword_Page;

import appModules.Navigation_Action;
import appModules.LossPassword_Action;

public class Validate_LostPassword {
	public WebDriver driver;
	
	//Test Method to start browser session and launch site
	@BeforeTest
	public void setUp() {
    	ChromeDriverManager.getInstance().setup();
    	driver = new ChromeDriver(); 
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	Navigation_Action.Navigate_To_HomePage(driver, Constant.URL_Binary);
    }
	
	//Test to navigate to lost password page
	@Test(priority=0)
	public void navigateToLostPasswordPage() {
		
		//Click on the login button in home page
		Navigation_Action.Navigate_To_LoginPage(driver);
		
		// Click on 'Lost Password?'
		Navigation_Action.Navigate_To_LostPassword(driver);
	}
	
	// Test method to check if the email field is empty
	@Test(priority=1)
	public void testEmailEmpty(){
		
		// Clear the field
		LostPassword_Page.txt_Email(driver).clear();
		LostPassword_Page.txt_Email(driver).sendKeys("");
		
		// Submit the form
		LostPassword_Page.btn_Reset(driver).click();
		
		// Check error message displayed for the field
		Assert.assertEquals(LostPassword_Page.errorEmail(driver).getText(), "This field is required.");
		System.out.println("Error message displayed (No email)");
	}
	
	// Test method to validate invalid emails
	@Test(priority=2)
	public void testEmailInvalid(){
		
		// Clear the field
		LostPassword_Page.txt_Email(driver).clear();
		LostPassword_Page.txt_Email(driver).sendKeys("!@!#$@#$@gmail.com");
		
		// Submit the form
		LostPassword_Page.btn_Reset(driver).click();
		
		// Check error message displayed for the field
		Assert.assertEquals(LostPassword_Page.errorEmail(driver).getText(), "Invalid email address");
		System.out.println("Error message displayed (Invalid)");
		
		//LossPassword_Action.Execute(driver);
	}
	
	// Use dummy email to send
	@Test(priority=3)
	public void setEmail(){
		LossPassword_Action.executeEmail(driver, "tazeek123@binary.com");
		
	}
	
	// Test method to check if all fields are empty
	@Test(priority=4)
	public void testEmptyFields(){
		
		// Click 'Reset Password'
		ResetPassword_Page.btn_Reset(driver).click();
		
		// Check error message displayed for the field
		Assert.assertEquals(ResetPassword_Page.errorReset(driver).getText(), "This field is required.");
		System.out.println("All fields are empty");
	}
	
	// Check for length validity of password
	@Test(priority=5)
	public void testValidPasswordLength(){
		
		// Must be 6-25 characters
		LossPassword_Action.invalidPasswordLength(driver, "abcde");
		
		// Check error message displayed for the field
		if(ResetPassword_Page.errorNewPassword(driver).isDisplayed()){
			System.out.println("New password is short");
		}
	}
	
	// Check for overall validity of password
	@Test(priority=6)
	public void testValidPasswordOverall(){
		
		// Must contain an uppercase, lowercase, number and 6-25 characters
		LossPassword_Action.invalidPasswordLength(driver, "abcdeAbcde");
		
		// Check error message displayed for the field
		if(ResetPassword_Page.errorNewPassword(driver).isDisplayed()){
			System.out.println("New password requirements not met");
		}
	}
	
	// Check if passwords match
	@Test(priority=7)
	public void testPasswordMatch(){
		
		// Use password and new password (Constant)
		LossPassword_Action.passwordMatchTest(driver, Constant.Password, Constant.NewPassword);

		// Check if error message displayed for the field
		if(ResetPassword_Page.errorMatchPassword(driver).isDisplayed()){
			System.out.println("Passwords do not match");
		}
	}
	
	// Set the fields for Date of birth
	@Test(priority=8)
	public void setDOB(){
		
		// Click 'real account' checkbox
		ResetPassword_Page.checkbox_RealAccount(driver).click();
		
		// Set values
		LossPassword_Action.executeDOB(driver, "1995", "5");
		System.out.println("DOB set");
	}
	
	// Test for Verification Token field
	@Test(priority=9)
	public void errorVerification(){
		
		LossPassword_Action.shortToken(driver, "HelloW");
		
		if(ResetPassword_Page.errorShortToken(driver).isDisplayed()){
			System.out.println("Invalid Token");
		}
	}
	
	// Test using valid input
	@Test(priority=10)
	public void resetPassword(){
		
		// Token input
		LossPassword_Action.shortToken(driver, "Abcd1234");
		
		// Password input
		LossPassword_Action.passwordMatchTest(driver, Constant.NewPassword, Constant.NewPassword);
		
		// Click 'Reset Password'
		ResetPassword_Page.btn_Reset(driver).click();
	}
	
	// Test if went to different page
	@Test(priority=11)
	public void linkRetry(){
	
		// Link to retry will be displayed
		if(ResetPassword_Page.link_retry(driver).isDisplayed()){
			System.out.println("Please retry");
		}
	}
	
	// Test to see if went back to 'send token by email' page
	@Test(priority=12)
	public void resetEmailPage(){
		
		// Click link 
		ResetPassword_Page.link_retry(driver).click();
		
		// Verify if in correct page or not
		testEmailEmpty();
	}
	
	
	//Test Method to close browser session
    @AfterTest
    public void endSession() {
        driver.quit();
    }
	
}
