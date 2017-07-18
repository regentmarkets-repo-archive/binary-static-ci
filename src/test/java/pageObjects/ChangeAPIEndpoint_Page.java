package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class ChangeAPIEndpoint_Page {
	
    private static WebElement element = null;
    //Method to find Server Url text field
    public static WebElement txt_Server(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='server_url']"));
		return element;
    }
    //Method to find App Id textfield
    public static WebElement txt_AppId(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='app_id']"));
		return element;
    }
    //Method to find Submit button
    public static WebElement btn_Submit(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='new_endpoint']"));
		return element;
    }
    //Method to find Reset to original settings button
    public static WebElement btn_ResetToOriginal(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='reset_endpoint']"));
		return element;
    }

}
