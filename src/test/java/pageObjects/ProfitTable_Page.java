package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfitTable_Page {
	
	private static WebElement element = null;
	//Method to find page title
	public static WebElement txt_Header(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='profit-table-title']/h1")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find view button
	public static WebElement btn_View(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//button[contains(text(),'View')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}

}
