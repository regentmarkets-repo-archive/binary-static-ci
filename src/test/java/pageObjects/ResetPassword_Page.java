package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.CommonFunctions;

public class ResetPassword_Page {
	private static WebElement element = null;
	
	// Method to select the 'Verification Token' field
	public static WebElement txt_Verification(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.id("verification_code")));
		return element;
	}
	
	// Method to find the 'New Password' field
	public static WebElement txt_NewPassword(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.id("new_password")));
		return element;
	}
	
	// Method to find the 'Repeat Password' Field
	public static WebElement txt_RepeatPassword(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.id("repeat_password")));
		return element;
	}
	
	// Method to find the 'Real Account' field
	public static WebElement checkbox_RealAccount(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.id("have_real_account")));
		return element;
	}
	
	// Method to click 'Reset Password' button
	public static WebElement btn_Reset(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.xpath("//*[text() = 'Reset Password']")));
		return element;
	}
	
	// Method to find 'Date of Birth' field
	public static WebElement field_DateOfBirth(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.id("date_of_birth")));
		return element;
	}
	
	// Method to select the year in the dropdown list
	public static WebElement select_dobYear(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.className("ui-datepicker-year")));
		return element;
	}
	
	// Method to select the month in the dropdown list
	public static WebElement select_dobMonth(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.className("ui-datepicker-month")));
		return element;
	}
	
	// Method to select the day in the dropdown list
	public static WebElement select_dobDay(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[text() = '21']"));
		return element;
	}
	
	// Method to click for retry
	public static WebElement link_retry(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[text() = 'Click here to retry']"));
		return element;
	}
	
	// Method to find error message
	public static WebElement errorReset(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.className("error-msg"));
		return element;
	}
	
	// Method to validate new password
	public static WebElement errorNewPassword(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_reset_password']/fieldset/div[2]/div[2]/div"));
		return element;
	}
	
	// Method to check for error message for unmatched password
	public static WebElement errorMatchPassword(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_reset_password']/fieldset[1]/div[3]/div[2]/div"));
		return element;
	}
	
	// Method to check for error message for short token
	public static WebElement errorShortToken(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_reset_password']/fieldset/div[1]/div[2]/div[2]"));
		return element;
	}
}

