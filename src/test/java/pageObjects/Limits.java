package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Limits {
	private static WebElement element = null;
	//Method to find Maximum account cash balance select field in 
	public static WebElement select_MaxAccCashBal(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div[2]/div[1]/div[1]/div[1]/table/tbody/tr[1]/td[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find maximum number of open positions field
	public static WebElement select_MaxOpenPos(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div[2]/div[1]/div[1]/div[1]/table/tbody/tr[2]/td[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
}
