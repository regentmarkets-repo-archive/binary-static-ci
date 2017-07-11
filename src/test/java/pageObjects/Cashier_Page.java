package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class Cashier_Page {
    private static WebElement element = null;
    
    //Method to find cashier page title   
    public static WebElement page_title(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='content']/div[2]/h1"));
		return element;
    }
    //Method to find cashier page sub title   
    public static WebElement sub_title(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='content']/div[2]/div[3]/h3"));
		return element;
    }
    //Method  find deposit button
    public static WebElement deposit(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='content']/div[2]/div[3]/div/div[3]/div[1]/a"));
		return element;
    }
    //Method  find  withdraw button   
    public static WebElement withdraw(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='content']/div[2]/div[3]/div/div[3]/div[2]/a"));
		return element;
    }
    
    //method to find deposit/withdrawal page title 
    public static WebElement title(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='heading']"));
		return element;
    }

    //method to find cashier lock message 
    public static WebElement lock_msg(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='cashier_locked_message']"));
		return element;
    }
    //method to find link open cashier unlock 
    public static WebElement unlock_link(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(" //*[@id='cashier_locked_message']/a"));
		return element;
    }
 
    
}
