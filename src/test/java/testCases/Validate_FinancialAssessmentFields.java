//Test case to check error validation of each field on the Financial Assessment page
package testCases;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.FinancialAssessment_Page;
import utility.Constant;
import utility.Helper;
import appModules.Endpoint_Action;
import appModules.Navigation_Action;
import appModules.SetFinancialAssessment_Action;

public class Validate_FinancialAssessmentFields {
	public WebDriver driver;
	  //Test Method to login into the site
	  @Test(priority=0)
	  public void Login() {
		  	Navigation_Action.Navigate_To_LoginPage(driver);
		  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
	  } 
	  //Test Method to navigate to Financial Assessment page
	  @Test(priority=1)
	  public void NavigateToFinancialAssessmentPage() {
		  	Navigation_Action.Navigate_To_ProfilePage(driver);
		  	Navigation_Action.Navigate_To_FinancialAssessmentPage(driver);
	  }
	  //Test Method to test the error message displayed when forex trading experience field is not set
	  @Test(priority=2)
	  public void Test_ForexTradingExperience() {
		  SetFinancialAssessment_Action.Execute(driver, Constant.select_value,Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_ForexTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for forex trading experience is working");
			}
	  }
	//Test Method to test the error message displayed when forex trading frequency field is not set
	  @Test(priority=3)
	  public void Test_ForexTradingFrequency() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.select_value, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_ForexTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for forex trading frequency is working");
			}
	  }
	//Test Method to test the error message displayed when indices trading experience field is not set
	  @Test(priority=4)
	  public void Test_IndicesTradingExperience() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.select_value, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_IndicesTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for Indices trading Experience is working");
			}
	  }
	//Test Method to test the error message displayed when indices trading frequency field is not set
	  @Test(priority=5)
	  public void Test_IndicesTradingFrequency() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.select_value, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_IndicesTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Indices trading frequency is working");
			}
	  }
	//Test Method to test the error message displayed when commodities trading experience field is not set
	  @Test(priority=6)
	  public void Test_CommoditiesTradingExperience() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.select_value, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_CommoditiesTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for Commodities trading experience is working");
			}
	  }
	//Test Method to test the error message displayed when commodities trading frequency field is not set
	  @Test(priority=7)
	  public void Test_CommoditiesTradingFrequency() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.select_value, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_CommoditiesTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Commodities trading frequency is working");
			}
	  }
	//Test Method to test the error message displayed when stocks trading experience field is not set
	  @Test(priority=8)
	  public void Test_StocksTradingExperience() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.select_value, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_StocksTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for Stocks trading experience is working");
			}
	  }
	//Test Method to test the error message displayed when stocks trading frequency field is not set
	  @Test(priority=9)
	  public void Test_StocksTradingFrequency() {
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience,Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.select_value, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_StocksTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Stocks trading frequency is working");
			}
	  }
	//Test Method to test the error message displayed when other trading experience field is not set
	  @Test(priority=10)
	  public void Test_OtherTradingExperience() {
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience,Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.select_value, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_OtherTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for Binary options or other financial derivatives trading experience is working");
			}
	  }
	//Test Method to test the error message displayed when other trading frequency field is not set
	  @Test(priority=11)
	  public void Test_OtherTradingFrequency() {
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience,Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.select_value, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_OtherTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Binary options or other financial derivatives trading frequency is working");
			}
	  }
	//Test Method to test the error message displayed when other derivatives trading experience field is not set
	  @Test(priority=12)
	  public void Test_OtherDerivativesTradingExperience() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.select_value, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_OtherDerivativesTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for Other financial instruments trading experience is working");
			}
	  }
	//Test Method to test the error message displayed when other derivatives trading frequency field is not set
	  @Test(priority=13)
	  public void Test_OtherDerivatiesTradingFrequency() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.select_value, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_OtherDerivativesTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Other financial instruments trading frequency is working");
			}
	  }
	//Test Method to test the error message displayed when Industry Employment field is not set
	  @Test(priority=14)
	  public void Test_IndustryEmployment() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.select_value, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_IndustryEmployment(driver).isDisplayed()){
				System.out.println("Field validation for Industry of Employment is working");
			}
	  }
	//Test Method to test the error message displayed when occupation field is not set
	  @Test(priority=15)
	  public void Test_Occupation() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.select_value,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_Occupation(driver).isDisplayed()){
				System.out.println("Field validation for Occupation is working");
			}
	  }
	//Test Method to test the error message displayed when education field is not set
	  @Test(priority=16)
	  public void Test_Education() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.select_value, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_Education(driver).isDisplayed()){
				System.out.println("Field validation for Education is working");
			}
	  }
	//Test Method to test the error message displayed when annual income field is not set
	  @Test(priority=17)
	  public void Test_AnnualIncome() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.select_value, Constant.net_worth,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_AnnualIncome(driver).isDisplayed()){
				System.out.println("Field validation for Annual Income is working");
			}
	  }
	//Test Method to test the error message displayed when net worth field is not set
	  @Test(priority=18)
	  public void Test_NetWorth() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.select_value,Constant.anticipated_account);
			if(FinancialAssessment_Page.error_NetWorth(driver).isDisplayed()){
				System.out.println("Field validation for Net Worth is working");
			}
	  }
	//Test Method to test the error message displayed when anticipated income field is not set
	  @Test(priority=19)
	  public void Test_AnticipatedAccountTurnover() {
		  SetFinancialAssessment_Action.Execute(driver,Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.select_value);
			if(FinancialAssessment_Page.error_AnticipatedAccountTurnover(driver).isDisplayed()){
				System.out.println("Field validation for Anticipated Account Turnover is working");
			}
	  }
	  //Test Method to start browser session and launch site
	  @BeforeTest
	  public void launchApplication() {
		  if(Constant.testExeEnv.equals("Local"))
	    	{
	    		ChromeDriverManager.getInstance().setup();
	    		driver = new ChromeDriver();
	    	}
	    	else
	    	{
	    		driver = Helper.BrowserStackConfigurations();
	    	}
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	//driver.get(Constant.URL);
	    	Helper helperutility = new Helper();//get current ticks
	      	helperutility.AddCookieOfQaServer(driver);
	      	Navigation_Action.Navigate_To_HomePage(driver,Constant.URL+"/en/endpoint.html");
	      	Endpoint_Action.SetServer(driver,Constant.targetserver,Constant.appId);
	        driver.get(Constant.URL+"/en/endpoint.html");
			
	  }
	  //Test Method to close browser session
	  @AfterTest
	  public void endSession() {
		  driver.quit();
	  }
}