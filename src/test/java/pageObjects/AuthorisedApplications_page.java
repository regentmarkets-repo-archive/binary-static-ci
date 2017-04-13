package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AuthorisedApplications_page {
    private static WebElement element = null;
    //Method to find title element  
    public static WebElement title_page(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='applications-title']/h1")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find sub title element 
    public static WebElement sub_title(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='description']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to calculate number of records in login history 
    public static int count_rows(WebDriver driver){
        int element= driver.findElements(By.xpath("//*[@id='applications-table']/tbody/tr[*]")).size();
        return element;
    }
    //Method to calculate number of records in login history 
    public static int count_column(WebDriver driver){
        int element= driver.findElements(By.xpath("//*[@id='applications-table']/tbody/tr[1]/td[*]")).size();
        return element;
    }
    
    //Method to find authorize application name element 
    public static WebElement App_Name(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='applications-table']/tbody/tr[*]/td[1]")));
        //Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find revoke button  element 
    public static WebElement revoke_button(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='applications-table']/tbody/tr[contains(.,'Binary-Staging')]/td[4]/button ")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find error message please login to view the page 
    public static WebElement err_msg(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[2]/p")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method check oauth Authorize review page  element  
    public static WebElement review_title(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wrapper']/div[2]/h1")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method check scope list  element  
    public static WebElement scope_list(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wrapper']/div[2]/div[2]/ul")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method check grant button   element  
    public static WebElement grant_btn(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='wrapper']/div[2]/form/div/button[1]")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method check grant button   element  
    public static WebElement cancel_btn(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='wrapper']/div[2]/form/div/button[2]")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
}
