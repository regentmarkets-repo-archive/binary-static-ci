package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Endpoint_Page {
	private static WebElement element = null;
	//Method to find server field
	public static WebElement txt_Server(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("server_url")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find app id field
	public static WebElement txt_AppID(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("app_id")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find submit button
	public static WebElement btn_Submit(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("new_endpoint")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
}
