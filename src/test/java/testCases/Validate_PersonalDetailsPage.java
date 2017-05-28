package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;
import pageObjects.PersonalDetails_Page;
import utility.Constant;
import appModules.Navigation_Action;
import appModules.SetPersonalDetails_Action;

public class Validate_PersonalDetailsPage extends BaseClass {

	@Test(priority=0,description="Test Method to Login to binary site")
	public void Login() {
		  Navigation_Action.Navigate_To_LoginPage(driver);
		  Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
	}
	@Test(priority=1,description="Test Method to navigate to personal details page")
	 public void NavigateToPersonalDetailsPage() {
		  Navigation_Action.Navigate_To_ProfilePage(driver);
		  Navigation_Action.Navigate_To_PersonalDetailsPage(driver);
	  }
	@Test(priority=2,description="Test Method to test error message when Tax Residence field is left empty")
	public void Test_TaxResidence_EmptyField() {
		//Clear & Enter value for Tax Residence
		PersonalDetails_Page.txt_TaxResidence(driver).clear();
		PersonalDetails_Page.txt_TaxResidence(driver).sendKeys("");
		//Submit the form
		PersonalDetails_Page.txt_Phone(driver).submit();
		if((PersonalDetails_Page.value_emailaddress(driver).getText().contains("mlt"))||(PersonalDetails_Page.value_emailaddress(driver).getText().contains("mf"))){
			//Check error message displayed for the field
			Assert.assertEquals(PersonalDetails_Page.error_TaxResidence(driver).getText(), "This field is required.");
		}
	}
		@Test(priority=3,description="Test Method to test error message when Tax Id field is left empty")
		public void Test_TaxId_EmptyField() {
			//Clear & Enter value for Tax Id
			PersonalDetails_Page.txt_TaxIdNumber(driver).clear();
			PersonalDetails_Page.txt_TaxIdNumber(driver).sendKeys("");
			//Submit the form
			PersonalDetails_Page.txt_Phone(driver).submit();
			if((PersonalDetails_Page.value_emailaddress(driver).getText().contains("mlt"))||(PersonalDetails_Page.value_emailaddress(driver).getText().contains("mf"))){
				//Check error message displayed for the field
				Assert.assertEquals(PersonalDetails_Page.error_TaxId(driver).getText(), "This field is required.");
			}
		}
	@Test(priority=4,description="Test Method to test error message when invalid chars are entered in Address Line1")
	public void Test_AddressLine1_InvalidChars() {
		//Clear & Enter value for Address Line1
		PersonalDetails_Page.txt_AddressLine1(driver).clear();
		PersonalDetails_Page.txt_AddressLine1(driver).sendKeys("!@#$%^");
		//Submit the form
		PersonalDetails_Page.txt_Phone(driver).submit();
		//Check error message displayed for the field
		Assert.assertEquals(PersonalDetails_Page.error_AddressLine1(driver).getText(), "Only letters, numbers, space, hyphen, period, and apostrophe are allowed.");
	}
	@Test(priority=5,description="Test Method to test error message when Address Line1 is left empty")
	public void Test_AddressLine1_EmptyField() {
		//Clear & Enter value for Address Line1
		PersonalDetails_Page.txt_AddressLine1(driver).clear();
		PersonalDetails_Page.txt_AddressLine1(driver).sendKeys("");
		//Submit the form
		PersonalDetails_Page.txt_Phone(driver).submit();
		//Check error message displayed for the field
		Assert.assertEquals(PersonalDetails_Page.error_AddressLine1(driver).getText(), "This field is required.");
	}
	@Test(priority=6,description="Test Method to test error message when invalid chars are entered in Address City")
	public void Test_AddressCity_InvalidChars() {
		//Clear & Enter value for Address City
		PersonalDetails_Page.txt_AddressCity(driver).clear();
		PersonalDetails_Page.txt_AddressCity(driver).sendKeys("!@#$%^");
		//Submit the form
		PersonalDetails_Page.txt_Phone(driver).submit();
		//Check error message displayed for the field
		Assert.assertEquals(PersonalDetails_Page.error_AddressCity(driver).getText(), "Only letters, space, hyphen, period, and apostrophe are allowed.");
	}
	@Test(priority=7,description="Test Method to test error message when Address City is left empty")
	public void Test_AddressCity_EmptyField() {
		//Clear & Enter value for Address City
		PersonalDetails_Page.txt_AddressCity(driver).clear();
		PersonalDetails_Page.txt_AddressCity(driver).sendKeys("");
		//Submit the form
		PersonalDetails_Page.txt_Phone(driver).submit();
		//Check error message displayed for the field
		Assert.assertEquals(PersonalDetails_Page.error_AddressCity(driver).getText(), "This field is required.");
	}
	@Test(priority=8,description="Test Method to test error message when invalid chars are entered in Zip Code")
	public void Test_ZipCode_InvalidChars() {
		//Clear & Enter value for Zip Code
		PersonalDetails_Page.txt_AddressZipCode(driver).clear();
		PersonalDetails_Page.txt_AddressZipCode(driver).sendKeys("!@#$%^");
		//Submit the form
		PersonalDetails_Page.txt_Phone(driver).submit();
		//Check error message displayed for the field
		Assert.assertEquals(PersonalDetails_Page.error_AddressZipCode(driver).getText(), "Only letters, numbers, space, and hyphen are allowed.");
	}
	@Test(priority=9,description="Test Method to test error message when invalid chars are entered in Telephone")
	public void Test_Telephone_InvalidChars() {
		//Clear & Enter value for telephone number
		PersonalDetails_Page.txt_Phone(driver).clear();
		PersonalDetails_Page.txt_Phone(driver).sendKeys("!@#$%^");
		//Submit the form
		PersonalDetails_Page.txt_Phone(driver).submit();
		//Check error message displayed for the field
		Assert.assertEquals(PersonalDetails_Page.error_TelephoneNumber(driver).getText(), "Only numbers and spaces are allowed.");
	}
	@Test(priority=10,description="Test Method to test error message when Telephone is left empty")
	public void Test_Telephone_EmptyField() {
		//Clear & Enter value for telephone number
		PersonalDetails_Page.txt_Phone(driver).clear();
		PersonalDetails_Page.txt_Phone(driver).sendKeys("");
		//Submit the form
		PersonalDetails_Page.txt_Phone(driver).submit();
		//Check error message displayed for the field
		Assert.assertEquals(PersonalDetails_Page.error_TelephoneNumber(driver).getText(), "This field is required.");
	}
		@Test(priority=11,description="Test Method to test error message when value of Telephone is less than 6 chars")
		public void Test_Telephone_LessChars() {
			//Clear & Enter value for telephone number
			PersonalDetails_Page.txt_Phone(driver).clear();
			PersonalDetails_Page.txt_Phone(driver).sendKeys(RandomStringUtils.randomNumeric(5));
			//Submit the form
			PersonalDetails_Page.txt_Phone(driver).submit();
			//Check error message displayed for the field
			Assert.assertEquals(PersonalDetails_Page.error_TelephoneNumber(driver).getText(), "You should enter 6-35 characters.");
		}
	 @Test(priority=12,description="Test Method to set all personal details fields")
	 public void SetPersonalDetailsFields() {
			SetPersonalDetails_Action.Execute(driver,Constant.birth_place,Constant.tax_residence,Constant.tax_id_number,Constant.address_line1,
			Constant.address_line2,Constant.address_city,Constant.address_state,Constant.zip_code,Constant.telephone_number);
			if(PersonalDetails_Page.msg_Success(driver).isDisplayed()){
				System.out.println(PersonalDetails_Page.msg_Success(driver).getText());
			}
	  }

}
