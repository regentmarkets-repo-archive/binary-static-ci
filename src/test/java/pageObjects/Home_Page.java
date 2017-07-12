package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Home_Page {
	
private static WebElement element = null;
	//Method to find login button on the home page
	public static WebElement btn_Login(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_login")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to go find logo 
		public static WebElement logo(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,60);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("logo")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Email text box on home page
		public static WebElement txt_Email(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,60);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find create free account button on home page
		public static WebElement btn_CreateFreeAccount(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,60);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_verify_email")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find upgrade to a real account link on home page
			public static WebElement link_UpgradeToRealAccount(WebDriver driver){
				WebDriverWait wait = new WebDriverWait(driver,60);
				element = wait.until(ExpectedConditions.elementToBeClickable(By.id("topbar-msg")));
				Assert.assertTrue(element.isDisplayed());
				WebElement link = element.findElement(By.linkText("Upgrade to a Real Account"));
				return link;
			}
}
