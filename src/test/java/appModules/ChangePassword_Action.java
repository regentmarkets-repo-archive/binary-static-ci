package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.ChangePassword_Page;

public class ChangePassword_Action {
	
		//Method to perform change password action
		public static void Execute(WebDriver driver, String oldPassword, String newPassword,String repeatPassword) {
			ChangePassword_Page.txt_oldPassword(driver).clear();
			ChangePassword_Page.txt_oldPassword(driver).sendKeys(oldPassword);
			ChangePassword_Page.txt_newPassword(driver).clear();
			ChangePassword_Page.txt_newPassword(driver).sendKeys(newPassword);
			ChangePassword_Page.txt_repeatPassword(driver).clear();
			ChangePassword_Page.txt_repeatPassword(driver).sendKeys(newPassword);
			ChangePassword_Page.btn_ChangePassword(driver).click();	
		}
		
}
