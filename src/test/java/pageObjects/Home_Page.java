package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	
private static WebElement element = null;
	//Method to find login button on the home page
	public static WebElement btn_Login(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_login")));
		return element;
	}
}
