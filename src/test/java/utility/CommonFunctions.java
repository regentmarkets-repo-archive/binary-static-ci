package utility;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonFunctions {	
	
	private static WebElement element = null;
 
	  public static void ExtractJSLogs(WebDriver driver) {
		
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
	        for (LogEntry entry : logEntries) {
	        	if(entry.getLevel().toString()=="SEVERE"){
	        	System.out.println(driver.getCurrentUrl());
	            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
	        }
	     }
	}
	  public static WebElement FindElementWithExplicitWait(WebDriver driver,By locator) {
	        WebDriverWait wait = new WebDriverWait(driver,30);
	        element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        Assert.assertTrue(element.isDisplayed());
	        return element;
	  }
}

