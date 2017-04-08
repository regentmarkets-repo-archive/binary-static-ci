package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PersonalDetails_Page {
	
	private static WebElement element = null;
	//Method to find place of birth select dropdown
	public static WebElement select_PlaceOfBirth(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='place_of_birth']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Tax Residence select dropdown
	public static WebElement select_TaxResidence(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='tax_residence']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
		//Method to find Tax Residence textbox
		public static WebElement txt_TaxResidence(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frmPersonalDetails']/fieldset[2]/div[1]/div[2]/span/span[1]/span/ul/li/input")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Tax Residence country
		public static WebElement select_TaxResidence_Country(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("India")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		
		//Method to find Tax Identification Number textbox
		public static WebElement txt_TaxIdNumber(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='tax_identification_number']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}	
		//Method to find Address Line1 textbox
		public static WebElement txt_AddressLine1(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
		    element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='address_line_1']")));
			Assert.assertTrue(element.isDisplayed());
		    return element;
		}
		//Method to find Address Line2 textbox
		public static WebElement txt_AddressLine2(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='address_line_2']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Address City textbox
		public static WebElement txt_AddressCity(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='address_city']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Address State select dropdown
		public static WebElement select_AddressState(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='address_state']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Address ZipCode textbox
		public static WebElement txt_AddressZipCode(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='address_postcode']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Address Telephone textbox
		public static WebElement txt_Phone(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='phone']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Success message
		public static WebElement msg_Success(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='formMessage']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}	
		//Method to find Update button
		public static WebElement btn_Update(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btn_update']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find error message for Tax Identification Number
		public static WebElement error_TaxId(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frmPersonalDetails']/fieldset[2]/div[2]/div[2]/div")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find error message for Address Line1
		public static WebElement error_AddressLine1(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frmPersonalDetails']/fieldset[3]/div[1]/div[2]/div")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find error message for Address City
		public static WebElement error_AddressCity(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frmPersonalDetails']/fieldset[3]/div[3]/div[2]/div")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		public static WebElement error_AddressZipCode(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frmPersonalDetails']/fieldset[3]/div[5]/div[2]/div")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find error message for Telephone Number
		public static WebElement error_TelephoneNumber(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frmPersonalDetails']/fieldset[3]/div[6]/div[2]/div")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		

}
