package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utility.CommonFunctions;
import utility.GetUtil;

public class SelfExclusionPage {
	private static WebElement element = null;
	
	public static WebElement input_MaxBalance(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_balance"));
		return element;
	}
	
	public static WebElement input_MaxTurnover(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_turnover"));
		return element;
	}
	
	public static WebElement input_MaxLosses(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_losses"));
		return element;
	}
	
	public static WebElement input_Max7DaysTurnover(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_7day_turnover"));
		return element;
	}
	
	public static WebElement input_Max7DaysLosses(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_7day_losses"));
		return element;
	}
	
	public static WebElement input_Max30DaysTurnover(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_30day_turnover"));
		return element;
	}

	public static WebElement input_Max30DaysLosses(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_30day_losses"));
		return element;
	}
	
	public static WebElement input_MaxOpenBets(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("max_open_bets"));
		return element;
	}
	
	public static WebElement input_SessionDurationLimit(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("session_duration_limit"));
		return element;
	}
	
	public static WebElement date_TimeOutUntilDate(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("timeout_until_date"));
		return element;
	}
	
	public static WebElement date_FindTodayDateViaPicker(WebDriver driver)
	{
		element = driver.findElement(By.className("ui-datepicker-today"));
		element = element.findElement(By.className("ui-state-default"));
		return element;
	}
	
	public static WebElement date_ExcludeUntil(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("exclude_until"));
		return element;
	}

	public static WebElement time_TimeOutUntilTime(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("timeout_until_time"));
		return element;
	}
	
	public static WebElement btn_Submit(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("btn_submit"));
		return element;
	}
	
	public static WebElement error_MaxBalance(WebDriver driver)
	{
		element = GetUtil.getParent(input_MaxBalance(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement error_MaxTurnover(WebDriver driver)
	{
		element = GetUtil.getParent(input_MaxTurnover(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement error_MaxLosses(WebDriver driver)
	{
		element = GetUtil.getParent(input_MaxLosses(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement error_Max7DaysTurnover(WebDriver driver)
	{
		element = GetUtil.getParent(input_Max7DaysTurnover(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement error_Max7DaysLosses(WebDriver driver)
	{
		element = GetUtil.getParent(input_Max7DaysLosses(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement error_Max30DaysTurnover(WebDriver driver)
	{
		element = GetUtil.getParent(input_Max30DaysTurnover(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}

	public static WebElement error_Max30DaysLosses(WebDriver driver)
	{
		element = GetUtil.getParent(input_Max30DaysLosses(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement error_MaxOpenBets(WebDriver driver)
	{
		element = GetUtil.getParent(input_MaxOpenBets(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement error_SessionDurationLimit(WebDriver driver)
	{
		element = GetUtil.getParent(input_SessionDurationLimit(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement error_TimeOutUntilDate(WebDriver driver)
	{
		element = GetUtil.getParent(date_TimeOutUntilDate(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement error_TimeOutUntilTime(WebDriver driver)
	{
		element = GetUtil.getParent(time_TimeOutUntilTime(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	
	public static WebElement error_Submit(WebDriver driver)
	{
		element = GetUtil.getParent(btn_Submit(driver)).findElement(By.className("error-msg"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
}
