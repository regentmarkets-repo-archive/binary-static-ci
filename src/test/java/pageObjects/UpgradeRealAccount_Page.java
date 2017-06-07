package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UpgradeRealAccount_Page {
	private static WebElement element = null;
	//method to find Title element
		public static Select dd_Title(WebDriver driver)
		{
			Select title=null;
			WebDriverWait wait = new WebDriverWait(driver,30);
			title =new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("salutation"))));
			return title;
		}
	//method to find firstName element
	public static WebElement txt_FirstName(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find familyName element
	public static WebElement txt_FamilyName(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last_name")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find DOB element
	public static WebElement txt_DOB(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("date_of_birth")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to get 12th day from calendar
	public static WebElement DateValue(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[3]/a")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find FirstLineAddress element
	public static WebElement txt_FirstLineAddress(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address_line_1")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find SecondLineAddress element
	public static WebElement txt_SecondLineAddress(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address_line_2")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find Town/City element
	public static WebElement txt_TownCity(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address_city")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find State/Province element
	public static Select dd_StateProvince(WebDriver driver)
	{
		Select stateProvince=null;
		WebDriverWait wait = new WebDriverWait(driver,30);
		stateProvince =new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address_state"))));
		return stateProvince;
	}
	//method to find ZipCode element
	public static WebElement txt_PostCode(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address_postcode")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find Telephone element
	public static WebElement txt_Telephone(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find SecretQuestion element
	public static Select dd_SecretQuestion(WebDriver driver)
	{
		Select secretQuestion=null;
		WebDriverWait wait = new WebDriverWait(driver,30);
		secretQuestion = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("secret_question"))));
		return secretQuestion;
	}
	//method to find AnswerSecretQuestion element
	public static WebElement txt_AnsSecretQuestion(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("secret_answer")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find PEP checkbox
	public static WebElement chk_NotPEP(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("not_pep")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find Terms and Condition checkbox
	public static WebElement chk_TnC(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tnc")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//method to find open account button
		public static WebElement btn_OpenAccount(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='frm_real']/div/button")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
}
