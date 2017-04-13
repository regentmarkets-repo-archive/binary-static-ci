package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ResetPassword_Page {
	private static WebElement element = null;
	
	// Method to select the 'Verification Token' field
	public static WebElement txt_Verification(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("verification_code")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	// Method to find the 'New Password' field
	public static WebElement txt_NewPassword(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("new_password")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	// Method to find the 'Repeat Password' Field
	public static WebElement txt_RepeatPassword(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("repeat_password")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	// Method to find the 'Real Account' field
	public static WebElement checkbox_RealAccount(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("have_real_account")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	// Method to click 'Reset Password' button
	public static WebElement btn_Reset(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text() = 'Reset Password']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	// Method to find 'Date of Birth' field
	public static WebElement field_DateOfBirth(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("date_of_birth")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	// Method to select the year in the dropdown list
	public static WebElement select_dobYear(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-datepicker-year")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	// Method to select the month in the dropdown list
	public static WebElement select_dobMonth(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-datepicker-month")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	// Method to select the day in the dropdown list
	public static WebElement select_dobDay(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text() = '21']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	// Method to click for retry
	public static WebElement link_retry(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text() = 'Click here to retry']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
}
