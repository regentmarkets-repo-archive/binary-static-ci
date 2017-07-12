package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class PersonalDetails_Page {
	
	private static WebElement element = null;
	//Method to find email address value
	public static WebElement value_emailaddress(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='lbl_email']"));
		return element;
	}
	//Method to find place of birth select dropdown
	public static WebElement select_PlaceOfBirth(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='place_of_birth']"));
		return element;
	}
	//Method to find Tax Residence select dropdown
	public static WebElement select_TaxResidence(WebDriver driver)
	{
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='tax_residence']"));
		return element;
	}
		//Method to find Tax Residence textbox
		public static WebElement txt_TaxResidence(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frmPersonalDetails']/fieldset[2]/div[1]/div[2]/span/span[1]/span/ul/li/input"));
			return element;
		}
		//Method to find Tax Identification Number textbox
		public static WebElement txt_TaxIdNumber(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='tax_identification_number']"));
			return element;
		}	
		//Method to find Address Line1 textbox
		public static WebElement txt_AddressLine1(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='address_line_1']"));
			return element;
		}
		//Method to find Address Line2 textbox
		public static WebElement txt_AddressLine2(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='address_line_2']"));
			return element;
		}
		//Method to find Address City textbox
		public static WebElement txt_AddressCity(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='address_city']"));
			return element;
		}
		//Method to find Address State select dropdown
		public static WebElement select_AddressState(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='address_state']"));
			return element;
		}
		//Method to find Address ZipCode textbox
		public static WebElement txt_AddressZipCode(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='address_postcode']"));
			return element;
		}
		//Method to find Address Telephone textbox
		public static WebElement txt_Phone(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='phone']"));
			return element;
		}
		//Method to find Success message
		public static WebElement msg_Success(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='formMessage']"));
			return element;
		}	
		//Method to find Update button
		public static WebElement btn_Update(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='btn_update']"));
			return element;
		}
		//Method to find error message for Tax Residence
		public static WebElement error_TaxResidence(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frmPersonalDetails']/fieldset[2]/div[1]/div[2]/div"));
			return element;
		}
		//Method to find error message for Tax Identification Number
		public static WebElement error_TaxId(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frmPersonalDetails']/fieldset[2]/div[2]/div[2]/div"));
			return element;
		}
		//Method to find error message for Address Line1
		public static WebElement error_AddressLine1(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frmPersonalDetails']/fieldset[3]/div[1]/div[2]/div"));
			return element;
		}
		//Method to find error message for Address City
		public static WebElement error_AddressCity(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frmPersonalDetails']/fieldset[3]/div[3]/div[2]/div"));
			return element;
		}
		public static WebElement error_AddressZipCode(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frmPersonalDetails']/fieldset[3]/div[5]/div[2]/div"));
			return element;
		}
		//Method to find error message for Telephone Number
		public static WebElement error_TelephoneNumber(WebDriver driver)
		{
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frmPersonalDetails']/fieldset[3]/div[6]/div[2]/div"));
			return element;
		}
		

}
