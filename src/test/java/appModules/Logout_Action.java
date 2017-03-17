package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.MainAccount_Menu;
public class Logout_Action {
	//Method to perform logout action
	public static void Execute(WebDriver driver) {
		//Verify page title of the Main Account page
		Assert.assertTrue(driver.getTitle().matches("Trusted by traders.*"));
		//Click on the main account menu
		MainAccount_Menu.link_MainAccount(driver).click();
		//Click on the logout button in the main page
		MainAccount_Menu.link_Logout(driver).click();
	}
}
