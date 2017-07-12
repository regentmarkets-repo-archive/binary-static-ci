package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import utility.CommonFunctions;

public class Portfolio_Page {
	
	private static WebElement element = null;
	//Method to find page title
	public static WebElement txt_Header(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='portfolio']/h1"));
		return element;
	}
	//Method to find no contract positions text
	public static WebElement txt_NoContractPosition(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='portfolio-no-contract']/p"));
		return element;
	}
	//Method to find view button
	public static WebElement btn_View(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//button[contains(text(),'View')])[1]"));
		return element;
	}
	//Method to find portfolio balance
	public static WebElement txt_PortfolioBalance(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='portfolio-balance']"));
		return element;
	}
}
