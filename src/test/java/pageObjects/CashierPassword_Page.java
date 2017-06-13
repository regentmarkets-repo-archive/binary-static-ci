package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CashierPassword_Page {
    private static WebElement element = null;
    //Method to find title of cashier password page
    public static WebElement title_page(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[2]/h1")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find lock cashier form title 
    public static WebElement title_form(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_cashier_password']/fieldset/legend")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find cashier password text box
    public static WebElement cashierPassword(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cashier_password")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    ///Method to find confirm cashier password text box
    public static WebElement confirmPassword(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("repeat_cashier_password")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    ///Method to find update button
    public static WebElement updateButton(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='btn_submit']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    ///Method to find error message of cashier password 
    public static WebElement errMsg_1(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_cashier_password']/fieldset/div[2]/div[2]/div[2]")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    ///Method to find error message of confirm cashier password 
    public static WebElement errMsg_2(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_cashier_password']/fieldset/div[3]/div[2]/div")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    ///Method to find error message of same password as login password
    public static WebElement errMsg_3(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='form_error']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find successful message 
    public static WebElement success_msg(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='form_message']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Check find unlock title
    public static WebElement unlock_title(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div[2]/h1")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Check find lock info
    public static WebElement lock_info(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='lockInfo']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
  
}
