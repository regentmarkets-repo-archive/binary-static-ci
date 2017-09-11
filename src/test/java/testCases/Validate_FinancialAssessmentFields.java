//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Constant;
import appModules.Navigation_Action;
import appModules.SetFinancialAssessment_Action;

public class Validate_FinancialAssessmentFields extends BaseClass{
	
	  @Test(priority=0,description="Test Method to login into the site")
	  public void Login() {
		  	Navigation_Action.Navigate_To_LoginPage(driver);
		  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
	  } 
	  @Test(priority=1,description="Test Method to navigate to Financial Assessment page")
	  public void NavigateToFinancialAssessmentPage() {
		  	Navigation_Action.Navigate_To_ProfilePage(driver);
		  	Navigation_Action.Navigate_To_FinancialAssessmentPage(driver);
	  }
	  @Test(priority=2,description="Test Method to test the error messages displayed when fields are not set")
	  public void Test_FinancialAssessmentFields() {
		  SetFinancialAssessment_Action.CheckErrorValidation(driver);
		  List <WebElement> allErrors = driver.findElements(By.xpath("//div[contains(text(),'This field is required.')]"));
		  System.out.println(allErrors.size());
		  Assert.assertTrue(allErrors.size()==21);
		  
	  }
}