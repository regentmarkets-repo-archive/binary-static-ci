package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChangeAPIEndpoint_Page {
	
    private static WebElement element = null;
    //Method to find Server Url text field
    public static WebElement txt_Server(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='server_url']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find App Id textfield
    public static WebElement txt_AppId(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='app_id']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find Submit button
    public static WebElement btn_Submit(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='new_endpoint']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
    //Method to find Reset to original settings button
    public static WebElement btn_ResetToOriginal(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='reset_endpoint']")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }

}
