package appModules;

import java.math.BigInteger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.SelfExclusionPage;
import utility.DateUtil;

// class to set values on self exclusion page
public class SetSelfExclusionPage_Action {
	
	public static final String notNumber = "^*&S";
	public static final String notDate = "^*&S";
	
	// Test the fields with non valid number
	public static void testValidNumber(WebDriver driver){
		
		// Get all elements that needs valid number inputs
		WebElement input_max_balance = SelfExclusionPage.input_MaxBalance(driver);
		WebElement input_max_turnover = SelfExclusionPage.input_MaxTurnover(driver);
		WebElement input_max_losses = SelfExclusionPage.input_MaxLosses(driver);
		WebElement input_max_7day_turnover = SelfExclusionPage.input_Max7DaysTurnover(driver);
		WebElement input_max_7day_losses = SelfExclusionPage.input_Max7DaysLosses(driver);
		WebElement input_max_30day_turnover = SelfExclusionPage.input_Max30DaysTurnover(driver);
		WebElement input_max_30day_losses = SelfExclusionPage.input_Max30DaysLosses(driver);
		WebElement input_max_open_bets = SelfExclusionPage.input_MaxOpenBets(driver);
		WebElement input_session_duraion_limit = SelfExclusionPage.input_SessionDurationLimit(driver);
		
		// Clean them all
		input_max_balance.clear();
		input_max_turnover.clear();
		input_max_losses.clear();
		input_max_7day_turnover.clear();
		input_max_7day_losses.clear();
		input_max_30day_turnover.clear();
		input_max_30day_losses.clear();
		input_max_open_bets.clear();
		input_session_duraion_limit.clear();
		
		// Key in non numeric values into them
		input_max_balance.sendKeys(notNumber);
		input_max_turnover.sendKeys(notNumber);
		input_max_losses.sendKeys(notNumber);
		input_max_7day_turnover.sendKeys(notNumber);
		input_max_7day_losses.sendKeys(notNumber);
		input_max_30day_turnover.sendKeys(notNumber);
		input_max_30day_losses.sendKeys(notNumber);
		input_max_open_bets.sendKeys(notNumber);
		input_session_duraion_limit.sendKeys(notNumber);
		
		// Get error elements of respective inputs
		WebElement error_max_balance = SelfExclusionPage.error_MaxBalance(driver);
		WebElement error_max_turnover = SelfExclusionPage.error_MaxTurnover(driver);
		WebElement error_max_losses = SelfExclusionPage.error_MaxLosses(driver);
		WebElement error_max_7day_turnover = SelfExclusionPage.error_Max7DaysTurnover(driver);
		WebElement error_max_7day_losses = SelfExclusionPage.error_Max7DaysLosses(driver);
		WebElement error_max_30day_turnover = SelfExclusionPage.error_Max30DaysTurnover(driver);
		WebElement error_max_30day_losses = SelfExclusionPage.error_Max30DaysLosses(driver);
		WebElement error_max_open_bets = SelfExclusionPage.error_MaxOpenBets(driver);
		WebElement error_session_duraion_limit = SelfExclusionPage.error_SessionDurationLimit(driver);
		
		// Check errors displayed
		logAndAssertIsDisplayed(error_max_balance, "error for max balance");
		logAndAssertIsDisplayed(error_max_turnover, "error for max turnover");
		logAndAssertIsDisplayed(error_max_losses, "error for max losses");
		logAndAssertIsDisplayed(error_max_7day_turnover, "error for max turnover in 7 days");
		logAndAssertIsDisplayed(error_max_7day_losses, "error for max losses in 7 days");
		logAndAssertIsDisplayed(error_max_30day_turnover, "error for max turnover in 30 days");
		logAndAssertIsDisplayed(error_max_30day_losses, "error for max losses in 30 days");
		logAndAssertIsDisplayed(error_max_open_bets, "error for max open bets");
		logAndAssertIsDisplayed(error_session_duraion_limit, "error for session duration limit");
		
		// Check if it is valid error for non numberic values
		logAndAssertIsValidNumber(error_max_balance, "error for max balance");
		logAndAssertIsValidNumber(error_max_turnover, "error for max turnover");
		logAndAssertIsValidNumber(error_max_losses, "error for max losses");
		logAndAssertIsValidNumber(error_max_7day_turnover, "error for max turnover in 7 days");
		logAndAssertIsValidNumber(error_max_7day_losses, "error for max losses in 7 days");
		logAndAssertIsValidNumber(error_max_30day_turnover, "error for max turnover in 30 days");
		logAndAssertIsValidNumber(error_max_30day_losses, "error for max losses in 30 days");
		logAndAssertIsValidNumber(error_max_open_bets, "error for max open bets");
		logAndAssertIsValidNumber(error_session_duraion_limit, "error for session duration limit");
	}
	
	// test the fields that would be required
	public static void testRequiredFieldDate(WebDriver driver){
		
		// get elements
		WebElement date = SelfExclusionPage.date_TimeOutUntilDate(driver);
		WebElement time = SelfExclusionPage.time_TimeOutUntilTime(driver);
		
		// clear them
		date.clear();
		time.clear();
		
		// clear date field and check if time field error will appear
		date.click();

		WebElement todayDate = SelfExclusionPage.date_FindTodayDateViaPicker(driver);
		
		todayDate.click();
		WebElement error_time = SelfExclusionPage.error_TimeOutUntilTime(driver);
		logAndAssertIsDisplayed(error_time, "error for required time");
		logAndAssertIsRequiredErrorFieldShown(error_time, "error for required time");
		date.clear();
	}
	
	public static void testNotMoreThanPrevious(WebDriver driver){
		// Get all elements that needs valid number inputs
		WebElement input_max_balance = SelfExclusionPage.input_MaxBalance(driver);
		WebElement input_max_turnover = SelfExclusionPage.input_MaxTurnover(driver);
		WebElement input_max_losses = SelfExclusionPage.input_MaxLosses(driver);
		WebElement input_max_7day_turnover = SelfExclusionPage.input_Max7DaysTurnover(driver);
		WebElement input_max_7day_losses = SelfExclusionPage.input_Max7DaysLosses(driver);
		WebElement input_max_30day_turnover = SelfExclusionPage.input_Max30DaysTurnover(driver);
		WebElement input_max_30day_losses = SelfExclusionPage.input_Max30DaysLosses(driver);
		WebElement input_max_open_bets = SelfExclusionPage.input_MaxOpenBets(driver);
		WebElement input_session_duraion_limit = SelfExclusionPage.input_SessionDurationLimit(driver);
		WebElement btn_submit = SelfExclusionPage.btn_Submit(driver);
		boolean changed = false;
		
		// Give them value if previously no inputs given to them
		if(input_max_balance.getAttribute("value").length() == 0){
			input_max_balance.sendKeys("99999999999999999997");
			changed = true;
		}
		
		if(input_max_turnover.getAttribute("value").length() == 0){
			input_max_turnover.sendKeys("99999999999999999997");
			changed = true;
		}
		
		if(input_max_losses.getAttribute("value").length() == 0){
			input_max_losses.sendKeys("99999999999999999997");
			changed = true;
		}
		
		if(input_max_7day_turnover.getAttribute("value").length() == 0){
			input_max_7day_turnover.sendKeys("99999999999999999997");
			changed = true;
		}
		
		if(input_max_7day_losses.getAttribute("value").length() == 0){
			input_max_7day_losses.sendKeys("99999999999999999997");
			changed = true;
		}
		
		if(input_max_30day_turnover.getAttribute("value").length() == 0){
			input_max_30day_turnover.sendKeys("99999999999999999997");
			changed = true;
		}
		
		if(input_max_30day_turnover.getAttribute("value").length() == 0){
			input_max_30day_turnover.sendKeys("99999999999999999997");
			changed = true;
		}
		
		if(input_max_30day_losses.getAttribute("value").length() == 0){
			input_max_30day_losses.sendKeys("99999999999999999997");
			changed = true;
		}
		
		if(input_max_open_bets.getAttribute("value").length() == 0){
			input_max_open_bets.sendKeys("9997");
			changed = true;
		}
		
		if(input_session_duraion_limit.getAttribute("value").length() == 0){
			input_session_duraion_limit.sendKeys("99997");
			changed = true;
		}
		
		if(changed){
			btn_submit.click();
		}
		
		// calculate numbers larger than original
		String test_max_balance = (new BigInteger(input_max_balance.getAttribute("value"))).add(new BigInteger("2")).toString();
		String test_max_turnover = (new BigInteger(input_max_turnover.getAttribute("value"))).add(new BigInteger("2")).toString();
		String test_max_losses = (new BigInteger(input_max_losses.getAttribute("value"))).add(new BigInteger("2")).toString();
		String test_max_7day_turnover = (new BigInteger(input_max_7day_turnover.getAttribute("value"))).add(new BigInteger("2")).toString();
		String test_max_7day_losses = (new BigInteger(input_max_7day_losses.getAttribute("value"))).add(new BigInteger("2")).toString();
		String test_max_30day_turnover = (new BigInteger(input_max_30day_turnover.getAttribute("value"))).add(new BigInteger("2")).toString();
		String test_max_30day_losses = (new BigInteger(input_max_30day_losses.getAttribute("value"))).add(new BigInteger("2")).toString();
		String test_max_open_bets = (new BigInteger(input_max_open_bets.getAttribute("value"))).add(new BigInteger("2")).toString();
		String test_session_duraion_limit = (new BigInteger(input_session_duraion_limit.getAttribute("value"))).add(new BigInteger("2")).toString();
		
		// clear them all due to character limit
		input_max_balance.clear();
		input_max_turnover.clear();
		input_max_losses.clear();
		input_max_7day_turnover.clear();
		input_max_7day_losses.clear();
		input_max_30day_turnover.clear();
		input_max_30day_losses.clear();
		input_max_open_bets.clear();
		input_session_duraion_limit.clear();
		
		// send in calculated numbers
		input_max_balance.sendKeys(test_max_balance);
		input_max_turnover.sendKeys(test_max_turnover);
		input_max_losses.sendKeys(test_max_losses);
		input_max_7day_turnover.sendKeys(test_max_7day_turnover);
		input_max_7day_losses.sendKeys(test_max_7day_losses);
		input_max_30day_turnover.sendKeys(test_max_30day_turnover);
		input_max_30day_losses.sendKeys(test_max_30day_losses);
		input_max_open_bets.sendKeys(test_max_open_bets);
		input_session_duraion_limit.sendKeys(test_session_duraion_limit);
	
		// Get error elements of respective inputs
		WebElement error_max_balance = SelfExclusionPage.error_MaxBalance(driver);
		WebElement error_max_turnover = SelfExclusionPage.error_MaxTurnover(driver);
		WebElement error_max_losses = SelfExclusionPage.error_MaxLosses(driver);
		WebElement error_max_7day_turnover = SelfExclusionPage.error_Max7DaysTurnover(driver);
		WebElement error_max_7day_losses = SelfExclusionPage.error_Max7DaysLosses(driver);
		WebElement error_max_30day_turnover = SelfExclusionPage.error_Max30DaysTurnover(driver);
		WebElement error_max_30day_losses = SelfExclusionPage.error_Max30DaysLosses(driver);
		WebElement error_max_open_bets = SelfExclusionPage.error_MaxOpenBets(driver);
		WebElement error_session_duraion_limit = SelfExclusionPage.error_SessionDurationLimit(driver);
		
		// Check errors displayed
		logAndAssertIsDisplayed(error_max_balance, "error for max balance need to be lesser");
		logAndAssertIsDisplayed(error_max_turnover, "error for max turnover to be lesser");
		logAndAssertIsDisplayed(error_max_losses, "error for max losses to be lesser");
		logAndAssertIsDisplayed(error_max_7day_turnover, "error for max turnover in 7 days to be lesser");
		logAndAssertIsDisplayed(error_max_7day_losses, "error for max losses in 7 days to be lesser");
		logAndAssertIsDisplayed(error_max_30day_turnover, "error for max turnover in 30 days to be lesser");
		logAndAssertIsDisplayed(error_max_30day_losses, "error for max losses in 30 days to be lesser");
		logAndAssertIsDisplayed(error_max_open_bets, "error for max open bets to be lesser");
		logAndAssertIsDisplayed(error_session_duraion_limit, "error for session duration limit to be lesser");

		
		// Check larger than original value errors displayed
		logAndAssertIsValueLargerThanItShuold(error_max_balance, "error for max balance need to be lesser");
		logAndAssertIsValueLargerThanItShuold(error_max_turnover, "error for max turnover to be lesser");
		logAndAssertIsValueLargerThanItShuold(error_max_losses, "error for max losses to be lesser");
		logAndAssertIsValueLargerThanItShuold(error_max_7day_turnover, "error for max turnover in 7 days to be lesser");
		logAndAssertIsValueLargerThanItShuold(error_max_7day_losses, "error for max losses in 7 days to be lesser");
		logAndAssertIsValueLargerThanItShuold(error_max_30day_turnover, "error for max turnover in 30 days to be lesser");
		logAndAssertIsValueLargerThanItShuold(error_max_30day_losses, "error for max losses in 30 days to be lesser");
		logAndAssertIsValueLargerThanItShuold(error_max_open_bets, "error for max open bets to be lesser");
		logAndAssertIsValueLargerThanItShuold(error_session_duraion_limit, "error for session duration limit to be lesser");
	}
	
	// logAndAssert if error displayed
	private static void logAndAssertIsDisplayed(WebElement element, String denoted_item){
		boolean toBeAssert = element.isDisplayed();
		Assert.assertTrue(toBeAssert);
		if(toBeAssert){
			System.out.println("Displayed : " + denoted_item + ".");
		}else{
			System.out.println("Not Displayed : " + denoted_item + ".");
		}
	}
	
	// logAndAssert if error is about valid number
	private static void logAndAssertIsValidNumber(WebElement element, String denoted_item){
		boolean toBeAssert = element.getText().equals("Should be a valid number");
		Assert.assertTrue(toBeAssert);
		if(toBeAssert){
			System.out.println("Valid Error Shown : non-numeric " + denoted_item + ".");
		}else{
			System.out.println("Not Valid Error Shown : non-numeric " + denoted_item + ".");
		}
	}
	
	// logAndAssert if error is required field
	private static void logAndAssertIsRequiredErrorFieldShown(WebElement element, String denoted_item){
		boolean toBeAssert = element.getText().equals("This field is required.");
		Assert.assertTrue(toBeAssert);
		if(toBeAssert){
			System.out.println("Required Field Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not Required Field Error Shown : " + denoted_item + ".");
		}
	}
	
	// logAndAssert if error is about valid date
	private static void logAndAssertIsValidDate(WebElement element, String denoted_item){
		boolean toBeAssert = element.getText().equals("Please select a valid date.");
		Assert.assertTrue(toBeAssert);
		if(toBeAssert){
			System.out.println("Valid Date Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Valid Date Error Shown : " + denoted_item + ".");
		}
	}
	
	// logAndAssert if error is about timeout date is more than 6 weeks 
	private static void logAndAssertIsSixWeek_TimeOut(WebElement element, String denoted_item){
		boolean toBeAssert = element.getText().equals("Time out cannot be more than 6 weeks.");
		Assert.assertTrue(toBeAssert);
		if(toBeAssert){
			System.out.println("6 weeks Timeout Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not 6 weeks Timeout Error Shown : " + denoted_item + ".");
		}
	}
	
	// logAndAssert if error is about exclusion date lesser than 6 months
	private static void logAndAssertIsSixMonthLesser_Exclusion(WebElement element, String denoted_item){
		boolean toBeAssert = element.getText().equals("Exclude time cannot be less than 6 months.");
		Assert.assertTrue(toBeAssert);
		if(toBeAssert){
			System.out.println("6 Month lesser Exlusion Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not 6 Month lesser Exlusion Error Shown : " + denoted_item + ".");
		}
	}
	
	// logAndAssert if error is about exlcusion date more than 5 years
	private static void logAndAssertIsFiveYearMore_Exclusion(WebElement element, String denoted_item){
		boolean toBeAssert = element.getText().equals("Exclude time cannot be for more than 5 years.");
		Assert.assertTrue(toBeAssert);
		if(toBeAssert){
			System.out.println("5 years more Exlusion Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not 5 years more Exlusion Error Shown : " + denoted_item + ".");
		}
	}
	
	// logAndAssert if error is about timeout having date before today
	private static void logAndAssertIsPassDate_Timeout(WebElement element, String denoted_item){
		if(element.getText().equals("Time out must be after today.")){
			System.out.println("Pass date timeout Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not Pass date Timeout Error Shown : " + denoted_item + ".");
		}
	}
	
	// logAndAssert if error is about timeout having time in the past
	private static void logAndAssertIsPassTime_Timeout(WebElement element, String denoted_item){
		boolean toBeAssert = element.getText().equals("Time out cannot be in the past.");
		Assert.assertTrue(toBeAssert);
		if(toBeAssert){
			System.out.println("Pass time Timeout Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not Pass time Timeout Error Shown : " + denoted_item + ".");
		}
	}
	
	// logAndAssert if value is larger than it should
	private static void logAndAssertIsValueLargerThanItShuold(WebElement element, String denoted_item){
		boolean toBeAssert = element.getText().toLowerCase().contains(("Should be between").toLowerCase());
		Assert.assertTrue(toBeAssert);
		if(toBeAssert){
			System.out.println("Value Larger Than Original Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not Value Larger Than It Should  Error Shown : " + denoted_item + ".");
		}
	}
}
