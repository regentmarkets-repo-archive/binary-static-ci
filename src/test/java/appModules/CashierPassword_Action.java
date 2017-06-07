package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.CashierPassword_Page;
import pageObjects.Cashier_Page;
import pageObjects.MainMenu_Tab;



public class CashierPassword_Action {
    //Method to perform set cashier password action
    public static void Execute(WebDriver driver, String sPass, String sconfirmPass) {
    	driver.navigate().refresh();
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        CashierPassword_Page.cashierPassword(driver).clear();
        CashierPassword_Page.cashierPassword(driver).sendKeys(sPass);
        CashierPassword_Page.confirmPassword(driver).clear();
        CashierPassword_Page.confirmPassword(driver).sendKeys(sconfirmPass);
        CashierPassword_Page.updateButton(driver).click();
    }
    //Method to check title page 
    public static void checkTitle(WebDriver driver) {
        String j= CashierPassword_Page.title_page(driver).getText();
        System.out.println("Result : "+ j);
        Assert.assertEquals("Cashier Password",j); 
    }
    //Method to unlock cashier password 
    public static void unlockCashier(WebDriver driver, String sPass) {
        Assert.assertEquals(CashierPassword_Page.unlock_title(driver).getText(),"Unlock Cashier");
        CashierPassword_Page.cashierPassword(driver).clear();
        CashierPassword_Page.cashierPassword(driver).sendKeys(sPass);
        CashierPassword_Page.updateButton(driver).click(); 
    }
    //Method to check deposit page while cashier is locked
    public static void depositPage(WebDriver driver) {
        MainMenu_Tab.click_cashiermenu(driver).click();
        System.out.println("cashier menu done");
        Assert.assertTrue(Cashier_Page.page_title(driver).isEnabled());
        System.out.println("cashier title done");
        Assert.assertTrue(Cashier_Page.sub_title(driver).isEnabled());
        System.out.println("cashier sub_title done");
        Cashier_Page.deposit(driver).click();
        System.out.println("Deposit page opened");
        Assert.assertEquals(Cashier_Page.title(driver).getText(),"Deposit"); 
        System.out.println("deposit assert done");
    } 
    //Method to check withdraw page while cashier is locked
    public static void withdrawPage(WebDriver driver) {
        MainMenu_Tab.click_cashiermenu(driver).click();
        Assert.assertTrue(Cashier_Page.page_title(driver).isEnabled());
        Assert.assertTrue(Cashier_Page.sub_title(driver).isEnabled());
        Cashier_Page.withdraw(driver).click();
        Assert.assertEquals(Cashier_Page.title(driver).getText(),"Withdraw"); 
    } 
}
