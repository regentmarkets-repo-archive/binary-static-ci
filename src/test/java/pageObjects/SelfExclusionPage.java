package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utility.GetUtil;

public class SelfExclusionPage {
	private static WebElement element = null;
	
	public static WebElement input_MaxBalance(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_balance")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement input_MaxTurnover(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_turnover")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement input_MaxLosses(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_losses")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement input_Max7DaysTurnover(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_7day_turnover")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement input_Max7DaysLosses(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_7day_losses")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement input_Max30DaysTurnover(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_30day_turnover")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}

	public static WebElement input_Max30DaysLosses(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_30day_losses")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement input_MaxOpenBets(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("max_open_bets")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement input_SessionDurationLimit(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("session_duration_limit")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement date_TimeOutUntilDate(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timeout_until_date")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement date_ExcludeUntil(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exclude_until")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}

	public static WebElement time_TimeOutUntilTime(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timeout_until_time")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	public static WebElement btn_Submit(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_submit")));
		Assert.assertTrue(element.isDisplayed());
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
	
	public static WebElement error_ExcludeUntil(WebDriver driver)
	{
		element = GetUtil.getParent(date_ExcludeUntil(driver)).findElement(By.className("error-msg"));
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
