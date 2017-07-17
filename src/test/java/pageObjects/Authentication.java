package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class Authentication {
	private static WebElement element = null;
	//Method to find Authenticated Message 
	public static WebElement txt_AuthedMsg(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='fully_authenticated']"));
		return element;
	}
	//Method to find non-Authenticated Message 
	public static WebElement txt_nonAuthedMsg(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='not_authenticated']"));
		return element;
	}
}
