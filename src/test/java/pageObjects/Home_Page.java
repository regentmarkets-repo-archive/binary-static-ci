package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class Home_Page {
    private static WebElement element = null;
    //Method to find login button on the home page
    public static WebElement btn_Login(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("btn_login"));
		return element;
    }
    public static WebElement platformLink(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='main-navigation-trading']/a"));
		return element;
    }
    public static WebElement tradeNowLink(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='trading-platforms']/div[1]/div[1]/div[2]/p[2]"));
		return element;
    }
    public static WebElement acceptRealityCheck(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='reality_check_nav']/button"));
		return element;
    }
}
