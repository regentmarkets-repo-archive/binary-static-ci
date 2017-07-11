package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class MainMenu_Tab {
    private static WebElement element = null;
    
    public static WebElement click_cashiermenu(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='topMenuCashier']/a"));
		return element;
    }
    public static WebElement link_TradeMenu(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='topMenuTrading']/a"));
		return element;
    }
    public static WebElement link_Portfolio(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='topMenuPortfolio']/a"));
		return element;
    }
    public static WebElement link_ProfitTable(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='topMenuProfitTable']/a"));
		return element;
    }
    public static WebElement link_Statement(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='topMenuStatement']/a"));
		return element;
    }
    public static WebElement link_ResourcesMenu(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='topMenuResources']/a"));
		return element;
    }
    
}
