package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Self_Exclusion {
	private static WebElement element = null;
	//Method to find Maximum account cash balance select field in 
	public static WebElement txt_MaxAccCashBal(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_balance")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find maximum number of open positions field
	public static WebElement txt_MaxOpenPos(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_open_bets")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find the message field
	public static WebElement msg_confirmMsg(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("msg_form")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find update button
	public static WebElement btn_Submit(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_submit")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Exclude Until Datepicker
	public static WebElement txt_ExcludeUntil(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='exclude_until']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find error message for MaxAccBal
    public static WebElement err_MaxAccBal(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_self_exclusion']/fieldset/div[1]/div[2]/div[2]")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
  //Method to find error message for MaxOpenPos
    public static WebElement err_MaxOpenPos(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_self_exclusion']/fieldset/div[8]/div[2]/div")));
        Assert.assertTrue(element.isDisplayed());
        return element;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 8a88575010d98ecbef45740764a2b6c85131aad4
