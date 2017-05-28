package testCases;

import org.testng.annotations.Test;
import utility.Constant;
import appModules.SetSelfExclusionPage_Action;
import appModules.Login_Action;
import appModules.Navigation_Action;

public class Validate_SelfExclusionPage extends BaseClass {
    @Test(priority=0,description="Test Method to login into the site") 
    public void Login() {
    	Navigation_Action.Navigate_To_LoginPage(driver);
        Login_Action.Execute(driver, Constant.Email, Constant.Password);
        driver.navigate().to(Constant.URL);
    } 
    @Test(priority=1,description="Test Method to navigate to Self Exclusion page")
    public void NavigateToSelfExclusionPage() {
    	Navigation_Action.Navigate_To_SelfExclusionPage_ValidateInput(driver);
    }
    
    @Test(priority=2,description="Test Method to test valid number")
    public void TestValidNumber(){
        SetSelfExclusionPage_Action.testValidNumber(driver);
    }
    
    @Test(priority=3,description="Test Method to test date field")
    public void TestRequiredFieldDate(){
    	SetSelfExclusionPage_Action.testRequiredFieldDate(driver);
    }
    
    @Test(priority=4)
    public void Refresh(){
    	driver.navigate().refresh();
    }
    
    @Test(enabled=false)
    public void TestNotMoreThanPrevious(){
    	SetSelfExclusionPage_Action.testNotMoreThanPrevious(driver);
    }
	}
