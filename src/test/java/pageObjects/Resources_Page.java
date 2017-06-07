package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Resources_Page {

    private static WebElement element = null;
    //Method to find login button on the home page
    
    public static WebElement title_page(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[2]/h1")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static WebElement link_AssetIndex(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,60);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/div[2]/div/div[1]/div[2]/h4/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static WebElement link_TradingTimes(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,60);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/div[2]/div/div[2]/div[2]/h4/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static WebElement assetIndexPage(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,60);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[2]/div")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    public static List<WebElement> asset_list(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='asset-index']/ul/li"));
        return element;
    }
    public static WebElement assetIndexPageSelect(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,60);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='asset-index']/ul/")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
}
