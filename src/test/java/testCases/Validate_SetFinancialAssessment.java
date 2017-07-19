//TestCase to set all financial assessment fields and save
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Home_Page;
import pageObjects.FinancialAssessment_Page;
import utility.Constant;
import appModules.Logout_Action;
import appModules.Navigation_Action;
import appModules.SetFinancialAssessment_Action;

public class Validate_SetFinancialAssessment extends BaseClass{	
	
	@Test(priority=0,description="Test Method to Login to binary site")
	public void A_Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
	}
	@Test(priority=1,description="Test Method to navigate to financial assessment page")
	  public void B_NavigateToFinancialAssessmentPage() {
		Navigation_Action.Navigate_To_ProfilePage(driver);
	  	Navigation_Action.Navigate_To_FinancialAssessmentPage(driver);
	  }
	 @Test(priority=2,description="Test Method to set all financial assessment fields")
	 public void C_Set_FinancialAssessment() {
			SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience,Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.msg_Success(driver).isDisplayed()){
				System.out.println(FinancialAssessment_Page.msg_Success(driver).getText());
			}	
	  }
	 @Test(priority=3,description="Test Method to logout")
	  public void D_Logout() {
			Logout_Action.Execute(driver);
			Assert.assertTrue(Home_Page.btn_Login(driver).isDisplayed());
	  }
}
