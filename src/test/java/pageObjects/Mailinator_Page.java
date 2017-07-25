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
    	
       	//element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("/html/body/div/div/div[1]/div/div/div/div[2]/div[3]/div/div[1]/div[2]/div[5]/div"));//commenting out this line as javascriptexecutor is causing the page to scroll up un necessarily
     	element = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/div[2]/div[3]/div/div[1]/div[2]/div[5]/div"));
       	return element;                                                         
    }
	
    
    //Method to locate withdrawal token
    public static WebElement withdrawal_token(WebDriver driver) {
    	//Switching frame as token is in another frame
    	driver.switchTo().frame("publicshowmaildivcontent");
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("/html/body/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/p[3]"));
		return element;
    }
	
    //Method to locate delete element
    public static WebElement deleteMail(WebDriver driver){
    	//switching back from iframe
    	driver.switchTo().defaultContent(); 
    	element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("public_delete_button"));
    	return element;
    }
}
