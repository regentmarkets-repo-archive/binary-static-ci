package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.CashierPassword_Page;


public class CashierPassword_Action {
    //Method to perform login action
    public static void Execute(WebDriver driver, String sPass, String sconfirmPass) {
        CashierPassword_Page.cashierPassword(driver).sendKeys(sPass);;
        CashierPassword_Page.confirmPassword(driver).sendKeys(sconfirmPass);
        CashierPassword_Page.updateButton(driver).click();
    }
    //Method to check title page 
    public static void checkTitle(WebDriver driver) {
        String j= CashierPassword_Page.title_page(driver).getText();
        System.out.println("Result : "+ j);
        Assert.assertEquals("Cashier Password",j); 
    }
}
