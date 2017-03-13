package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.Home_Page;
import pageObjects.Login_Page;

public class Login_Action {
	//Method to perform login action
	public static void Execute(WebDriver driver, String sEmail, String sPassword) {
		Home_Page.btn_Login(driver).click();
		Login_Page.txt_Email(driver).clear();
		Login_Page.txt_Email(driver).sendKeys(sEmail);
		Login_Page.txt_Password(driver).clear();
		Login_Page.txt_Password(driver).sendKeys(sPassword);
		Login_Page.btn_Login(driver).click();
	}
}
