package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainMenu_Tab {

    private static WebElement element = null;

    //Check to find cashier page menu 
    public static WebElement click_cashiermenu(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='topMenuCashier']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    // check to find trading menu
    public static WebElement link_TradeMenu(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMenuTrading']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }

    //check to find resources menu
    public static WebElement link_ResourcesMenu(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='topMenuResources']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }

    public static WebElement link_Portfolio(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMenuPortfolio']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static WebElement link_ProfitTable(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMenuProfitTable']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static WebElement link_Statement(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMenuStatement']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }


}
