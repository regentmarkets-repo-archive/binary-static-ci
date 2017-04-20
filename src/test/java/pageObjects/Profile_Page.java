package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Profile_Page {
	private static WebElement element = null;
	//Method to find personal details link
	public static WebElement link_PersonalDetails(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='settings_container']/div/div[1]/div[2]/h4/a")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Financial Assessment link
	public static WebElement link_FinancialAssessment(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='settings_container']/div/div[2]/div[2]/h4/a")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
}