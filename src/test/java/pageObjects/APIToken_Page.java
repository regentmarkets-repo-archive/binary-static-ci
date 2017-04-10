package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class APIToken_Page {
    private static WebElement element = null;
   
    //Method to find element of API Token Page
    public static WebElement title_page(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='api_token']/h1")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to calculate number of records in API Token 
    public static int count_rows(WebDriver driver){
        int element= driver.findElements(By.xpath("//*[@id='tokens_table']/tbody/tr[*]")).size();
        return element;
    }
    //Method to find token name field
    public static WebElement token_name(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_name")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find read scope options
    public static WebElement read_scope(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='chk_scopes_read']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find trade scope options
    public static WebElement trade_scope(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.id("chk_scopes_trade")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
  //Method to find payments scope options
    public static WebElement payments_scope(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.id("chk_scopes_payments")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
  //Method to find trade admin options
    public static WebElement admin_scope(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.id("chk_scopes_admin")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
  //Method to find newly added token 
    public static WebElement newly_addedToken(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("new")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
  //Method to find create button  
    public static WebElement create_token(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_submit")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find token name error message field
    public static WebElement error_field(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='token_form']/form/fieldset/div[1]/div[2]/div")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find scope error message 
    public static WebElement scoperror_field(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='token_form']/form/fieldset/div[2]/div[2]/div")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find success message field
    public static WebElement succes_msg(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='msg_form']/ul/li")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find delete button
    public static WebElement delete_btn(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='new']/td[*]/button")));
        Assert.assertTrue(element.isDisplayed());
        return element;    
    }
    //Method to find error message same token name
    public static WebElement nameerror_msg(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='token_message']/p")));
        Assert.assertTrue(element.isDisplayed());
        return element; 
    }
}
