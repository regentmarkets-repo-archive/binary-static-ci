package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class Home_Page {
	
private static WebElement element = null;
	//Method to find login button on the home page
	public static WebElement btn_Login(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("btn_login"));
		return element;
	}
	
}
