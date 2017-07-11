package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Login_Page;
import pageObjects.MainAccount_Menu;

public class Login_Action {
	//Method to perform login action
	public static void Execute(WebDriver driver, String sEmail, String sPassword) {
		//Clear the text field for Email
		Login_Page.txt_Email(driver).clear();
		//Enter value in the Email text field
		Login_Page.txt_Email(driver).sendKeys(sEmail);
		//Clear the text field for Password
		Login_Page.txt_Password(driver).clear();
		//Enter value in the Password text field
		Login_Page.txt_Password(driver).sendKeys(sPassword);
		//Click on the Login button in login page
		Login_Page.btn_Login(driver).click();
	}
	public static void SwitchToVirtualAccount(WebDriver driver) {
		MainAccount_Menu.link_MainAccount(driver).click();
		MainAccount_Menu.link_VirtualAccount(driver).click();
	}
}
