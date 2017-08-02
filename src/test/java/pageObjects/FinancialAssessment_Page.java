package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class FinancialAssessment_Page {
	private static WebElement element = null;
	//Method to find forex trading experience select field
	public static WebElement select_ForexTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("forex_trading_experience"));
		return element;
	}
	//Method to find forex trading frequency select field
	public static WebElement select_ForexTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("forex_trading_frequency"));
		return element;
	}
	//Method to find indices trading experience select field
	public static WebElement select_IndicesTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("indices_trading_experience"));
		return element;
	}
	//Method to find indices trading frequency select field
	public static WebElement select_IndicesTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("indices_trading_frequency"));
		return element;
	}
	//Method to find commodities trading experience select field
	public static WebElement select_CommoditiesTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("commodities_trading_experience"));
		return element;
	}
	//Method to find commodities trading frequency select field
	public static WebElement select_CommoditiesTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("commodities_trading_frequency"));
		return element;
	}
	//Method to find stocks trading experience select field
	public static WebElement select_StocksTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("stocks_trading_experience"));
		return element;
	}
	//Method to find stocks trading frequency select field
	public static WebElement select_StocksTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("stocks_trading_frequency"));
		return element;
	}
	//Method to find other derivatives trading experience select field
	public static WebElement select_OtherDerivativesTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("other_derivatives_trading_experience"));
		return element;
	}
	//Method to find other derivatives trading frequency select field
	public static WebElement select_OtherDerivativesTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("other_derivatives_trading_frequency"));
		return element;
	}
	//Method to find other trading experience select field
	public static WebElement select_OtherTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("other_instruments_trading_experience"));
		return element;
	}
	//Method to find other trading frequency select field
	public static WebElement select_OtherTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("other_instruments_trading_frequency"));
		return element;
	}
	//Method to find industry employment select field
	public static WebElement select_IndustryEmployment(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("employment_industry"));
		return element;
	}
	//Method to find occupation select field
	public static WebElement select_Occupation(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("occupation"));
		return element;
	}
	//Method to find education select field
	public static WebElement select_Education(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("education_level"));
		return element;
	}
	//Method to find source of income select field
	public static WebElement select_IncomeSource(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("income_source"));
		return element;
	}
	//Method to find annual income select field
	public static WebElement select_AnnualIncome(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("net_income"));
		return element;
	}
	//Method to find net worth select field
	public static WebElement select_NetWorth(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("estimated_worth"));
		return element;
	}
	//Method to find employment status select field
	public static WebElement select_EmpStatus(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("employment_status"));
		return element;
	}
	//Method to find source of wealth select field
	public static WebElement select_SourceOfWealth(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("source_of_wealth"));
		return element;
	}
	//Method to find update button
	public static WebElement btn_Update(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("btn_submit"));
		return element;
	}
	//Method to find success message text field
	public static WebElement msg_Success(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[contains(@id,'msg_form')]"));
		return element;
	}
	//Method to find no changes message text field
	public static WebElement msg_NoChanges(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='form_message']"));
		return element;
	}
	//Method to find forex trading experience error message text field
	public static WebElement error_ForexTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[1]/div[2]/div"));
		return element;
	}
	//Method to find forex trading frequency error message text field
	public static WebElement error_ForexTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[2]/div[2]/div"));
		return element;
	}
	//Method to find indices trading experience error message text field
	public static WebElement error_IndicesTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[3]/div[2]/div"));
		return element;
	}
	//Method to find indices trading frequency error message text field
	public static WebElement error_IndicesTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[4]/div[2]/div"));
		return element;
	}
	//Method to find commodities trading experience error message text field
	public static WebElement error_CommoditiesTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[5]/div[2]/div"));
		return element;
	}
	//Method to find commodities trading frequency error message text field
	public static WebElement error_CommoditiesTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[6]/div[2]/div"));
		return element;
	}
	//Method to find stocks trading experience error message text field
	public static WebElement error_StocksTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[7]/div[2]/div"));
		return element;
	}
	//Method to find stocks trading frequency error message text field
	public static WebElement error_StocksTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[8]/div[2]/div"));
		return element;
	}
	//Method to find other derivatives trading experience error message text field
	public static WebElement error_OtherDerivativesTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[9]/div[2]/div"));
		return element;
	}
	//Method to find  other derivatives trading frequency error message text field
	public static WebElement error_OtherDerivativesTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[10]/div[2]/div"));
		return element;
	}
	//Method to find other trading experience error message text field
	public static WebElement error_OtherTradingExperience(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[11]/div[2]/div"));
		return element;
	}
	//Method to find other trading frequency error message text field
	public static WebElement error_OtherTradingFrequency(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[12]/div[2]/div"));
		return element;
	}
	//Method to find industry employment error message text field
	public static WebElement error_IndustryEmployment(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[13]/div[2]/div"));
		return element;
	}
	//Method to find occupation error message text field
	public static WebElement error_Occupation(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[14]/div[2]/div"));
		return element;
	}
	//Method to find education error message text field
	public static WebElement error_Education(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[15]/div[2]/div"));
		return element;
	}
	//Method to find source of income error message text field
	public static WebElement error_IncomeSource(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[16]/div[2]/div"));
		return element;
	}
	//Method to find annual income error message text field
	public static WebElement error_AnnualIncome(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[17]/div[2]/div"));
		return element;
	}
	//Method to find net worth error message text field
	public static WebElement error_NetWorth(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[18]/div[2]/div"));
		return element;
	}
	//Method to find  Anticipated Account Turnover field
	public static WebElement select_AnticipatedAccountTurnover(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='account_turnover']"));
		return element;
	}
	//Method to find Anticipated Account Turnover error message text field
	public static WebElement error_AnticipatedAccountTurnover(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[19]/div[2]/div"));
		return element;
	}
	public static WebElement error_Text(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//div[contains(text(),'This field is required.')]"));
		return element;
	}
	

}
