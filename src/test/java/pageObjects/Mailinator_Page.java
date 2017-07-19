package pageObjects;
/*Developed by: Ehtesham
  Description: To get webelements of mailinator mailbox
  Development start: July 18, 2017
  Development end: 
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.CommonFunctions;

public class Mailinator_Page {
	private static WebElement element = null;
	
	//Method to find withdrawal email in mailinator mailbox
    public static WebElement withdrawal_email(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("/html/body/div/div/div[1]/div/div/div/div[2]/div[3]/div/div/div[2]/div[5]"));
		return element;                                                         
    }
	
    
    //Method to find withdrawal token in email
    public static WebElement withdrawal_token(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='token']"));
		return element;
    }
	
}
