package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Authentication {
	private static WebElement element = null;
	//Method to find Authenticated Message 
	public static WebElement txt_AuthedMsg(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='fully_authenticated']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find non-Authenticated Message 
	public static WebElement txt_nonAuthedMsg(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='not_authenticated']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
}
