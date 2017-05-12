package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Cashier_Page {
    private static WebElement element = null;
    
    //Method to find cashier page title   
    public static WebElement page_title(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div[2]/h1")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find cashier page sub title   
    public static WebElement sub_title(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div[2]/div[3]/h3")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method  find deposit button
    public static WebElement deposit(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div[3]/div[1]/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method  find  withdraw button   
    public static WebElement withdraw(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div[3]/div[2]/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    
    //method to find deposit/withdrawal page title 
    public static WebElement title(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='heading']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }

    //method to find cashier lock message 
    public static WebElement lock_msg(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cashier_locked_message']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //method to find link open cashier unlock 
    public static WebElement unlock_link(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id='cashier_locked_message']/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
 
    
}
