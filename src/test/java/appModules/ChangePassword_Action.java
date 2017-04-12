package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.ChangePassword_Page;

public class ChangePassword_Action {
	
		//Method to perform change password action
		public static void Execute(WebDriver driver, String oldPassword, String newPassword,String repeatPassword) {
			//Clear current password field
			ChangePassword_Page.txt_oldPassword(driver).clear();
			//Enter value in current password field
			ChangePassword_Page.txt_oldPassword(driver).sendKeys(oldPassword);
			//Clear new password field
			ChangePassword_Page.txt_newPassword(driver).clear();
			//Enter value in new password field
			ChangePassword_Page.txt_newPassword(driver).sendKeys(newPassword);
			//Clear repeat password field
			ChangePassword_Page.txt_repeatPassword(driver).clear();
			//Enter value in repeat password field
			ChangePassword_Page.txt_repeatPassword(driver).sendKeys(newPassword);
			//Click change password button
			ChangePassword_Page.btn_ChangePassword(driver).click();	
		}
		
}
