//TestCase to set all financial assessment fields and save
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Home_Page;
import pageObjects.FinancialAssessment_Page;
import utility.Constant;
import utility.Helper;
import appModules.Endpoint_Action;
import appModules.Logout_Action;
import appModules.Navigation_Action;
import appModules.SetFinancialAssessment_Action;

public class Validate_SetFinancialAssessment extends BaseClass{	
	//Test Method to Login to binary site
	@Test
	public void A_Login() {
		Navigation_Action.Navigate_To_LoginPage(driver);
	  	Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
	}
	//Test Method to navigate to financial assessment page
	@Test
	  public void B_NavigateToFinancialAssessmentPage() {
		Navigation_Action.Navigate_To_ProfilePage(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  	Navigation_Action.Navigate_To_FinancialAssessmentPage(driver);
	  }
	//Test Method to set all financial assessment fields
	 @Test
	 public void C_Set_FinancialAssessment() {
			SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience,Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth,Constant.anticipated_account); 
			//if(FinancialAssessment_Page.msg_Success(driver).isDisplayed()){
				System.out.println(FinancialAssessment_Page.msg_Success(driver).getText());
			//}	
	  }
	 //Test Method to logout
	 @Test
	  public void D_Logout() {
			Logout_Action.Execute(driver);
			Assert.assertTrue(Home_Page.btn_Login(driver).isDisplayed());
	  }

	 //Test Method to start browser session and launch binary site
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
			Helper helperutility = new Helper();
		  	helperutility.AddCookieOfQaServer(driver);//add server cookie
		  	Navigation_Action.Navigate_To_HomePage(driver,Constant.URL+"/en/endpoint.html");
		  	Endpoint_Action.SetServer(driver,Constant.targetserver,Constant.appId);
		    driver.get(Constant.URL+"/en/endpoint.html");
			
	  }
  //Test Method to close the browser session
  @AfterTest
  public void endSession() {
	  driver.quit();
  }

}
