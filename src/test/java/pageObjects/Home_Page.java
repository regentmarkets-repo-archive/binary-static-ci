package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class Home_Page {
  private static WebElement element = null;
    //Method to find login button on the home page
    public static WebElement btn_Login(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,60);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_login")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static WebElement platformLink(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,60);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main-navigation-trading']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static WebElement tradeNowLink(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,60);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='trading-platforms']/div[1]/div[1]/div[2]/p[2]")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static WebElement acceptRealityCheck(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,60);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='reality_check_nav']/button")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
}
