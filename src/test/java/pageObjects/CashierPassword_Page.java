package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.CommonFunctions;

public class CashierPassword_Page {
    private static WebElement element = null;
    //Method to find title of cashier password page
    public static WebElement title_page(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='content']/div[2]/h1"));
		return element;
    }
    //Method to find lock cashier form title 
    public static WebElement title_form(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_cashier_password']/fieldset/legend"));
		return element;
    }
    //Method to find cashier password text box
    public static WebElement cashierPassword(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("cashier_password"));
		return element;
    }
    ///Method to find confirm cashier password text box
    public static WebElement confirmPassword(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("repeat_cashier_password"));
		return element;
    }
    ///Method to find update button
    public static WebElement updateButton(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='btn_submit']"));
		return element;
    }
    ///Method to find error message of cashier password 
    public static WebElement errMsg_1(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_cashier_password']/fieldset/div[2]/div[2]/div[2]"));
		return element;
    }
    ///Method to find error message of confirm cashier password 
    public static WebElement errMsg_2(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_cashier_password']/fieldset/div[3]/div[2]/div"));
		return element;
    }
    ///Method to find error message of same password as login password
    public static WebElement errMsg_3(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='form_error']"));
		return element;
    }
    //Method to find successful message 
    public static WebElement success_msg(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='form_message']"));
		return element;
    }
    //Check find unlock title
    public static WebElement unlock_title(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='content']/div[2]/h1"));
		return element;
    }
    //Check find lock info
    public static WebElement lock_info(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='lockInfo']"));
		return element;
    }
  
}
