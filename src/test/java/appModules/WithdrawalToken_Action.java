package appModules;
/*Developed by: Ehtesham
Description: To perform actions in mailinator mailbox
Development start: July 18, 2017
Development end: 
*/

import org.openqa.selenium.WebDriver;
import pageObjects.Mailinator_Page;

public class WithdrawalToken_Action {
	
	
	//Method to check withdrawal email in inbox
    public static String checkEmail(WebDriver driver) {
        String j= Mailinator_Page.withdrawal_email(driver).getText();
        System.out.println("Result : "+ j);
        return j;
        //Assert.assertEquals("API Token",j); 
        //System.out.println("Email found: " + APIToken_Page.count_rows(driver));
    }
    
    //Method to open withdrawal email in inbox
    public static void openEmail(WebDriver driver) {
    	//JavascriptExecutor jse = (JavascriptExecutor)driver;
    	//jse.executeScript("window.scrollBy(-568,-14)", "");
        Mailinator_Page.withdrawal_email(driver).click();
    	
    
    }
    
  //Method to read withdrawal token in email
    public static String readToken(WebDriver driver) {
        String token = Mailinator_Page.withdrawal_token(driver).getText();
        System.out.println("Withdraw token : "+ token);
        return token;
    }
    
  //Method to delete notification from inbox
    public static void deleteNotification(WebDriver driver){
    	Mailinator_Page.deleteMail(driver).click();
    }

}
