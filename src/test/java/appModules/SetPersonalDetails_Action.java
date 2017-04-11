package appModules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.PersonalDetails_Page;

public class SetPersonalDetails_Action {
	
	public static void Execute(WebDriver driver, String birth_place,String tax_residence,String tax_id_number,String address_line1,String address_line2,
			String address_city,String address_state,String zip_code,String telephone_number){
		//Select value for Birth Place field
		Select oSelect_birth_place = new Select(PersonalDetails_Page.select_PlaceOfBirth(driver));
		oSelect_birth_place.selectByValue(birth_place);
		//Clear & Enter value for Tax Residence field
		PersonalDetails_Page.txt_TaxResidence(driver).clear();
		PersonalDetails_Page.txt_TaxResidence(driver).sendKeys(tax_residence);
		PersonalDetails_Page.txt_TaxResidence(driver).sendKeys(Keys.ENTER);
		//Clear & Enter value for Tax Identification Number
		PersonalDetails_Page.txt_TaxIdNumber(driver).clear();
		PersonalDetails_Page.txt_TaxIdNumber(driver).sendKeys(tax_id_number);
		//Clear & Enter value for Address Line1
		PersonalDetails_Page.txt_AddressLine1(driver).clear();
		PersonalDetails_Page.txt_AddressLine1(driver).sendKeys(address_line1);
		//Clear & Enter value for Address Line2
		PersonalDetails_Page.txt_AddressLine2(driver).clear();
		PersonalDetails_Page.txt_AddressLine2(driver).sendKeys(address_line2);
		//Clear & Enter value for Address City
		PersonalDetails_Page.txt_AddressCity(driver).clear();
		PersonalDetails_Page.txt_AddressCity(driver).sendKeys(address_city);
		//Clear & Select value for Address State
		Select oSelect_address_state= new Select(PersonalDetails_Page.select_AddressState(driver));
		oSelect_address_state.selectByIndex(2);
		//Clear & Enter value for Zip Code
		PersonalDetails_Page.txt_AddressZipCode(driver).clear();
		PersonalDetails_Page.txt_AddressZipCode(driver).sendKeys(zip_code);
		//Clear & Enter value for telephone number
		PersonalDetails_Page.txt_Phone(driver).clear();
		PersonalDetails_Page.txt_Phone(driver).sendKeys(telephone_number);
		//Submit form
		PersonalDetails_Page.txt_Phone(driver).submit();
	}
}
