package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utility.CommonFunctions;

public class Login_Page {
	private static WebElement element = null;
	//Method to find email text field
	public static WebElement txt_Email(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("txtEmail"));
		return element;
	}
	//Method to find password text field
	public static WebElement txt_Password(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("txtPass"));
		return element;
	}
	//Method to find login button
	public static WebElement btn_Login(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.name("login"));
		return element;
	}
	//Method to find error message on the login page
	public static WebElement err_Login(WebDriver driver)
	{

		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wrapper']/p[2]")));
		Assert.assertTrue(element.isDisplayed());

		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//p[contains(text(),'Incorrect email or password.')]"));

		return element;
	}
}
