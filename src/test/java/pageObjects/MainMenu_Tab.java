package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainMenu_Tab {
    //Check find cashier page menu 
    private static WebElement element = null;
    
    public static WebElement click_cashiermenu(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='topMenuCashier']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static WebElement link_TradeMenu(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='topMenuTrading']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
}
