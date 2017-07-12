package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class Self_Exclusion {
	private static WebElement element = null;
	//Method to find Maximum account cash balance select field in 
	public static WebElement txt_MaxAccCashBal(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_balance"));
		return element;
	}
	//Method to find maximum number of open positions field
	public static WebElement txt_MaxOpenPos(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_open_bets"));
		return element;
	}
	//Method to find the message field
	public static WebElement msg_confirmMsg(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("msg_form"));
		return element;
	}
	//Method to find update button
	public static WebElement btn_Submit(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("btn_submit"));
		return element;
	}
	//Method to find Exclude Until Datepicker
	public static WebElement txt_ExcludeUntil(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='exclude_until']"));
		return element;
	}
	//Method to find error message for MaxAccBal
    public static WebElement err_MaxAccBal(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_self_exclusion']/fieldset/div[1]/div[2]/div[2]"));
		return element;
    }
  //Method to find error message for MaxOpenPos
    public static WebElement err_MaxOpenPos(WebDriver driver)
    {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_self_exclusion']/fieldset/div[8]/div[2]/div"));
		return element;
    }
}
