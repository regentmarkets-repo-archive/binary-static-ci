package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_History {
    private static WebElement element = null;
    //Method to find element of Login History
    public static WebElement title_page(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_history-title")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to calculate number of records in login history 
    public static int count_rows(WebDriver driver){
        int element= driver.findElements(By.xpath("//*[@id='login-history-table']/tbody/tr[*]")).size();
        return element;
    }
	
    public static WebElement first_row(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-history-table']/tbody/tr[1]/td[5]")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find second rows of the records 
    public static WebElement second_row(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-history-table']/tbody/tr[2]/td[5]")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
}
