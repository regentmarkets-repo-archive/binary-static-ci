package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Portfolio_Page {
	
	private static WebElement element = null;
	//Method to find page title
	public static WebElement txt_Header(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='portfolio']/h1")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find no contract positions text
	public static WebElement txt_NoContractPosition(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='portfolio-no-contract']/p")));
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
	//Method to find portfolio balance
	public static WebElement txt_PortfolioBalance(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='portfolio-balance']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	

}
