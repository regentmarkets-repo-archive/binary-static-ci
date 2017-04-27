package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NewAccount_Page {
	private static WebElement element = null;
	//Method to find verification token field
	public static WebElement txt_VerificationToken(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("verification_code")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find choose password field
	public static WebElement txt_ChoosePassword(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("client_password")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find re-enter password field
		public static WebElement txt_ReEnterPassword(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("repeat_password")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
	//Method to find country dropdown list
		public static Select dd_Country(WebDriver driver)
		{
			Select residence=null;
			WebDriverWait wait = new WebDriverWait(driver,30);
			residence =new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("residence"))));
			////residence.selectByValue(arg0);
			return residence;
		}
	//method to find create account button on verification page
		public static WebElement btn_CreateAccount(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='formlayout']/button")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
	//check assertion is user landed on tarde
		public static WebElement IsClientOnTrade(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topMenuTrading")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		
}
