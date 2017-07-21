package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.AuthorisedApplications_page;
import pageObjects.Home_Page;
import pageObjects.Login_Page;
import pageObjects.MainAccount_Menu;

public class Login_Action {
    //Method to perform login action
    public static void Execute(WebDriver driver, String sEmail, String sPassword) {
        Login_Page.txt_Email(driver).clear();
        Login_Page.txt_Email(driver).sendKeys(sEmail);
        Login_Page.txt_Password(driver).clear();
        Login_Page.txt_Password(driver).sendKeys(sPassword);
        Login_Page.btn_Login(driver).click();
        int num = AuthorisedApplications_page.authorize_title(driver);
        if(num >0){
        	AuthorisedApplications_page.grant_btn(driver).click();
        }
    }
    public static void SwitchToVirtualAccount(WebDriver driver) {
        MainAccount_Menu.link_MainAccount(driver).click();
        MainAccount_Menu.link_VirtualAccount(driver).click();
    }
    //Method to continue accept trading when login using accounts that required Reality Check
    public static void continueTrading(WebDriver driver) {
        Home_Page.acceptRealityCheck(driver).click();
    }
    public static void SwitchToMLTAccount(WebDriver driver) {
        MainAccount_Menu.link_MainAccount(driver).click();
        MainAccount_Menu.link_MLTAccount(driver).click();
    }
    
    
}
