package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class ProfitTable_Page {
	
	private static WebElement element = null;
	//Method to find page title
	public static WebElement txt_Header(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='profit-table-title']/h1"));
		return element;
	}
	//Method to find view button
	public static WebElement btn_View(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//button[contains(text(),'View')])[1]"));
		return element;
	}

}
