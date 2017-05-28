package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import pageObjects.APIToken_Page;
import utility.Constant;
import appModules.APIToken_Action;
import appModules.Navigation_Action;

public class Validate_APITokenPage extends BaseClass{

    @Test(priority=0,description="Test method to login")
    public void Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
    } 
    @Test(priority=1,description="Test Method to navigate to API Token page")
    public void NavigateToAPITokenPage() {
    	Navigation_Action.Navigate_To_SecurityPage(driver);
    	Navigation_Action.Navigate_To_APITokenPage(driver);
    }
    @Test(priority=2,description="Test Method to check title of the page")
        public void CheckPageLoad() {
            APIToken_Action.checkTitle(driver);
        }
    @Test(priority=3,description="Test method to check scope validation")
    public void CheckScopeValidation() {
        APIToken_Action.ScopeValidation(driver);
        if(APIToken_Page.scoperror_field(driver).isDisplayed()){
            System.out.println("Scope validation is working ");
            Assert.assertEquals(APIToken_Page.scoperror_field(driver).getText(), "Please select at least one scope");
        }    
    }
    @Test (priority=4,description="Test method to check form validation for minimum token name")
    public void CheckMinChar() {
        APIToken_Action.Validation(driver, Constant.inv_tokenName);
        if(APIToken_Page.error_field(driver).isDisplayed()){
            System.out.println("Field validation for minimum character is working");
        }
        Assert.assertEquals(APIToken_Page.error_field(driver).getText(), "You should enter 2-32 characters.");
    }
    @Test (priority=5,description="Test method to check duplicate Token name")
    public void DuplicateName() {
        APIToken_Action.ExecuteDuplicate(driver, Constant.DuplicateName);
        if(APIToken_Page.nameerror_msg(driver).isDisplayed()){
            System.out.println("Field validation for invalid token name is working");
        }
        Assert.assertEquals(APIToken_Page.nameerror_msg(driver).getText(), "The name is taken.");
    }
    @Test (priority=6,description="Test method to check form validation for invalid token name")
    public void CheckInvalidName() {
        APIToken_Action.Validation(driver, Constant.inv_tokenName2);
        if(APIToken_Page.error_field(driver).isDisplayed()){
            System.out.println("Field validation for invalid token name is working");
        }
        Assert.assertEquals(APIToken_Page.error_field(driver).getText(), "Only letters, numbers, space, _ are allowed.");
    }
    @Test (priority=7,description="Test method to Add New Token")
    public void AddNewToken() {
        APIToken_Action.ExecuteAddToken(driver, Constant.v_tokenName);
        Assert.assertEquals(APIToken_Page.succes_msg(driver).getText(), "New token created.");
        System.out.println("Total Records After Add New Token : " + APIToken_Page.count_rows(driver));
    }
    @Test (priority=8,description="Test method to delete newly created Token")
    public void DeleteToken() {
        APIToken_Action.deleteToken(driver);
    }

}
