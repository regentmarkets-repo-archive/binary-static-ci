package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class LostPassword_Page {
	private static WebElement element = null;
	
	// Method to find the email text field
	public static WebElement txt_Email(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
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
	
	// Method to find error message for empty email
	public static WebElement errorEmail(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-msg")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
}
