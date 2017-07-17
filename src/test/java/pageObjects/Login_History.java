package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.CommonFunctions;

public class Login_History {

    private static WebElement element = null;
    //Method to find element of Login History
    public static WebElement title_page(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("login_history-title"));
		return element;
    }
    //Method to calculate number of records in login history 
    public static int count_rows(WebDriver driver){
        int element= driver.findElements(By.xpath("//*[@id='login-history-table']/tbody/tr[*]")).size();
        return element;
    }
	
    public static WebElement first_row(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='login-history-table']/tbody/tr[1]/td[5]"));
		return element;
    }
    //Method to find second rows of the records 
    public static WebElement second_row(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='login-history-table']/tbody/tr[2]/td[5]"));
		return element;
    }
}
