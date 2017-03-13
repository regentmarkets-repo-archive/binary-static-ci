package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.MainAccount_Menu;
public class Logout_Action {
	//Method to perform logout action
	public static void Execute(WebDriver driver) {
		MainAccount_Menu.link_MainAccount(driver).click();
		MainAccount_Menu.link_Logout(driver).click();
	}
}
