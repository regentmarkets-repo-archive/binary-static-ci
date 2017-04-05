package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Security_Page {
	private static WebElement element = null;
	//Method to find Login History link
	public static WebElement link_LoginHistoryPage(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='settings_container']/div/div[5]/div[1]/a")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
}

