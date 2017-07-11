package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class LostPassword_Page {
	private static WebElement element = null;
	
	// Method to find the email text field
	public static WebElement txt_Email(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("email"));
		return element;
	}
	// Method to click 'Reset Password' button
	public static WebElement btn_Reset(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("btn_submit"));
		return element;
	}
	// Method to find error message for empty email box
	public static WebElement errorEmail(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.className("error-msg"));
		return element;
	}
}

