package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Login_Page {
	private static WebElement element = null;
	//Method to find email text field
	public static WebElement txt_Email(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtEmail")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find password text field
	public static WebElement txt_Password(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPass")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find login button
	public static WebElement btn_Login(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find error message on the login page
	public static WebElement err_Login(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//p[contains(text(),'Incorrect email or password.')]")));;
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
}
