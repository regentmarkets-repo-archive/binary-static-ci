package appModules;
/*Developed by: Ehtesham
Description: To Perform cashier actions
Development start: July 18, 2017
Development end: 
*/

import org.openqa.selenium.WebDriver;
import pageObjects.Cashier_Page;

public class Cashier_Action {

	
	public static void clickWithdraw(WebDriver driver){

    	Cashier_Page.withdraw(driver).click();
    }
}
