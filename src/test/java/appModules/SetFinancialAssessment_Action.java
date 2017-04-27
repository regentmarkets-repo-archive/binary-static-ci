package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.FinancialAssessment_Page;

public class SetFinancialAssessment_Action {
	//Method to set all financial assessment fields
	public static void Execute(WebDriver driver,String fx_trading_exerience,String fx_trading_frequency,String indices_trading_experience,String indices_trading_frequency,String commodities_trading_experience,String commodities_trading_frequency,
			String stocks_trading_experience,String stocks_trading_frequency,String other_trading_experience,String other_trading_frequency,String other_derivative_trading_experience,String other_derivative_trading_frequency,
			String employment_industry,String occupation,String education,String income_source,String annual_income,String net_worth,String anticipated_account) {
		//Select value for Forex Trading Experience field
		Select oSelect_fx_trading_exerience = new Select(FinancialAssessment_Page.select_ForexTradingExperience(driver));
		oSelect_fx_trading_exerience.selectByValue(fx_trading_exerience);
		//Select value for Forex Trading Frequency field
		Select oSelect_fx_trading_frequency = new Select(FinancialAssessment_Page.select_ForexTradingFrequency(driver));
		oSelect_fx_trading_frequency.selectByValue(fx_trading_frequency);
		//Select value for Indices Trading Experience field
		Select oSelect_indices_trading_experience = new Select(FinancialAssessment_Page.select_IndicesTradingExperience(driver));
		oSelect_indices_trading_experience.selectByValue(indices_trading_experience);
		//Select value for Forex Trading Frequency field
		Select oSelect_indices_trading_frequency = new Select(FinancialAssessment_Page.select_IndicesTradingFrequency(driver));
		oSelect_indices_trading_frequency.selectByValue(indices_trading_frequency);
		//Select value for Commodities Trading Experience field
		Select oSelect_commodities_trading_experience = new Select(FinancialAssessment_Page.select_CommoditiesTradingExperience(driver));
		oSelect_commodities_trading_experience.selectByValue(commodities_trading_experience);
		//Select value for Commodities Trading Frequency field
		Select oSelect_commodities_trading_frequency = new Select(FinancialAssessment_Page.select_CommoditiesTradingFrequency(driver));
		oSelect_commodities_trading_frequency.selectByValue(commodities_trading_frequency);
		//Select value for Stocks Trading Experience field
		Select oSelect_stocks_trading_experience = new Select(FinancialAssessment_Page.select_StocksTradingExperience(driver));
		oSelect_stocks_trading_experience.selectByValue(stocks_trading_experience);
		//Select value for Stocks Trading Frequency field
		Select oSelect_stocks_trading_frequency = new Select(FinancialAssessment_Page.select_StocksTradingFrequency(driver));
		oSelect_stocks_trading_frequency.selectByValue(stocks_trading_frequency);
		//Select value for Other Trading Experience field
		Select oSelect_binary_options_trading_experience = new Select(FinancialAssessment_Page.select_OtherTradingExperience(driver));
		oSelect_binary_options_trading_experience.selectByValue(other_trading_experience);
		//Select value for Other Trading Frequency field
		Select oSelect_binary_options_trading_frequency = new Select(FinancialAssessment_Page.select_OtherTradingFrequency(driver));
		oSelect_binary_options_trading_frequency.selectByValue(other_trading_frequency);
		//Select value for OtherDerivative Trading Experience field
		Select oSelect_other_derivatives_experience = new Select(FinancialAssessment_Page.select_OtherDerivativesTradingExperience(driver));
		oSelect_other_derivatives_experience.selectByValue(other_derivative_trading_experience);
		//Select value for OtherDerivative Trading Frequency field
		Select oSelect_other_derivatives_frequency = new Select(FinancialAssessment_Page.select_OtherDerivativesTradingFrequency(driver));
		oSelect_other_derivatives_frequency.selectByValue(other_derivative_trading_frequency);
		//Select value for Employment Industry field
		Select oSelect_employment_industry = new Select(FinancialAssessment_Page.select_IndustryEmployment(driver));
		oSelect_employment_industry.selectByValue(employment_industry);
		//Select value for Occupation field
		Select oSelect_occupation = new Select(FinancialAssessment_Page.select_Occupation(driver));
		oSelect_occupation.selectByValue(occupation);
		//Select value for Education field
		Select oSelect_education = new Select(FinancialAssessment_Page.select_Education(driver));
		oSelect_education.selectByValue(education);
		//Select value for Annual Income field
		Select oSelect_annual_income = new Select(FinancialAssessment_Page.select_AnnualIncome(driver));
		oSelect_annual_income.selectByValue(annual_income);
		//Select value for Net Worth field
		Select oSelect_net_worth = new Select(FinancialAssessment_Page.select_NetWorth(driver));
		oSelect_net_worth.selectByValue(net_worth);
		//Select value for Anticipated Account Turnover field
		Select oSelect_anticipated_account_turnover = new Select(FinancialAssessment_Page.select_AnticipatedAccountTurnover(driver));
		oSelect_anticipated_account_turnover.selectByValue(anticipated_account);
		//Click on Update button
		FinancialAssessment_Page.select_NetWorth(driver).submit();
	}
}
