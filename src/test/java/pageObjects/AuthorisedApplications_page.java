package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class AuthorisedApplications_page {
    private static WebElement element = null;
    //Method to find title element  
    public static WebElement title_page(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='applications-title']/h1"));
		return element;
    }
    //Method to find sub title element 
    public static WebElement sub_title(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='description']"));
		return element;
    }
    //Method to calculate number of records in login history 
    public static int count_rows(WebDriver driver){
        int element= driver.findElements(By.xpath("//*[@id='applications-table']/tbody/tr[*]")).size();
        return element;
    }
    
    //Method to find authorize application name element 
    public static WebElement App_Name(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='applications-table']/tbody/tr[*]/td[1]"));
		return element;
    }
    //Method to find revoke button  element 
    public static WebElement revoke_button(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='applications-table']/tbody/tr[contains(.,'Binary-Staging')]/td[4]/button "));
		return element;
    }
    //Method to find error message please login to view the page 
    public static WebElement err_msg(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='content']/div[2]/p"));
		return element;
    }
    //Method check oauth Authorize review page  element  
    public static WebElement review_title(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='wrapper']/div[2]/h1"));
		return element;
    }
    //Method check scope list  element  
    public static WebElement scope_list(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='wrapper']/div[2]/div[2]/ul"));
		return element;
    }
    //Method check grant button element  
    public static WebElement grant_btn(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='wrapper']/div[2]/form/div/button[1]"));
		return element;
    }
    //Method check cancel button element  
    public static WebElement cancel_btn(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='wrapper']/div[2]/form/div/button[2]"));
		return element;
    }
}
