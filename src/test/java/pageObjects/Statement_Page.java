package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class Statement_Page {
	
	private static WebElement element = null;
	//Method to find page title
	public static WebElement txt_Header(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='statement-title']/h1"));
		return element;
	}
	//Method to find view button
	public static WebElement btn_View(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//button[contains(text(),'View')])[1]"));
		return element;
	}
	//Method to find Virtual Money text
	public static WebElement txt_VirtualMoney(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//tr/td[contains(text(), 'Virtual money credit to account')]"));
		return element;
	}

}
