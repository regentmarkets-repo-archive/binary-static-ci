package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Login_History;

public class LoginHistory_Action {
	//Method to check title page 
	public static void Execute(WebDriver driver) {
	 String j= Login_History.title_page(driver).getText(); 
	 Assert.assertEquals("Login History",j);
	 
	}
	
	public static void ExecuteCount(WebDriver driver){
	
     System.out.println("Total Rows Count : " + Login_History.count_rows(driver));
		
		
	}
}