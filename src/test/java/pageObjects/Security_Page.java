package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Security_Page {
    private static WebElement element = null;
    //Method to find Login History link
    public static WebElement link_LoginHistoryPage(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='settings_container']/div/div[5]/div[1]/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find Cashier Password Page
    public static WebElement link_CashierPassword(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='settings_container']/div/div[2]/div[1]/a/img")));
        return element;
    }
    public static WebElement link_APITokenPage(WebDriver driver)
    //Method to find API Token Page
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='settings_container']/div/div[6]/div[1]/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
  //Method to find Account Password link
    public static WebElement link_AccountPassword(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='change_password']/div[2]/h4/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find Self Exclusion link
    public static WebElement link_SelfExclusion(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='settings_container']/div/div[3]/div[1]/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find Limits link
    public static WebElement link_Limits(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='settings_container']/div/div[4]/div[1]/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find Authorized Application link
    public static WebElement link_AuthorisedApplication(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='settings_container']/div/div[7]/div[1]/a")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
}
	