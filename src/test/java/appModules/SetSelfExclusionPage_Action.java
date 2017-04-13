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
		logIsDisplayed(error_max_balance, "error for max balance");
		logIsDisplayed(error_max_turnover, "error for max turnover");
		logIsDisplayed(error_max_losses, "error for max losses");
		logIsDisplayed(error_max_7day_turnover, "error for max turnover in 7 days");
		logIsDisplayed(error_max_7day_losses, "error for max losses in 7 days");
		logIsDisplayed(error_max_30day_turnover, "error for max turnover in 30 days");
		logIsDisplayed(error_max_30day_losses, "error for max losses in 30 days");
		logIsDisplayed(error_max_open_bets, "error for max open bets");
		logIsDisplayed(error_session_duraion_limit, "error for session duration limit");
		
		// Check if it is valid error for non numberic values
		logIsValidNumber(error_max_balance, "error for max balance");
		logIsValidNumber(error_max_turnover, "error for max turnover");
		logIsValidNumber(error_max_losses, "error for max losses");
		logIsValidNumber(error_max_7day_turnover, "error for max turnover in 7 days");
		logIsValidNumber(error_max_7day_losses, "error for max losses in 7 days");
		logIsValidNumber(error_max_30day_turnover, "error for max turnover in 30 days");
		logIsValidNumber(error_max_30day_losses, "error for max losses in 30 days");
		logIsValidNumber(error_max_open_bets, "error for max open bets");
		logIsValidNumber(error_session_duraion_limit, "error for session duration limit");
	}
	
	// test the fields that would be required
	public static void testRequiredFieldDate(WebDriver driver){
		
		// get elements
		WebElement date = SelfExclusionPage.date_TimeOutUntilDate(driver);
		WebElement time = SelfExclusionPage.time_TimeOutUntilTime(driver);
		
		// clear them
		date.clear();
		time.clear();

		// clear time field and check if date field error will appear
		time.sendKeys(DateUtil.getCurrentTime());
		WebElement error_date = SelfExclusionPage.error_TimeOutUntilDate(driver);
		logIsDisplayed(error_date, "error for required date");
		logIsRequiredErrorFieldShown(error_date, "error for required date");
		time.clear();
		
		// clear date field and check if time field error will appear
		date.sendKeys(DateUtil.getTodayDate());
		WebElement error_time = SelfExclusionPage.error_TimeOutUntilTime(driver);
		logIsDisplayed(error_time, "error for required time");
		logIsRequiredErrorFieldShown(error_time, "error for required time");
		date.clear();
	}
	
	// test if the date fields error will appear if input non-valid dates
	public static void testValidDate(WebDriver driver){
		
		// get elements
		WebElement date_timeout = SelfExclusionPage.date_TimeOutUntilDate(driver);
		WebElement time_timeout = SelfExclusionPage.time_TimeOutUntilTime(driver);
		WebElement date_exclusion = SelfExclusionPage.date_ExcludeUntil(driver);
		
		// clear them all
		date_timeout.clear();
		time_timeout.clear();
		date_exclusion.clear();
		
		// key in non date values
		date_timeout.sendKeys(notDate);
		time_timeout.sendKeys(notDate);
		date_exclusion.sendKeys(notDate);
		
		//get error elements
		WebElement error_date_timeout = SelfExclusionPage.error_TimeOutUntilDate(driver);
		WebElement error_time_timeout = SelfExclusionPage.error_TimeOutUntilTime(driver);
		WebElement error_date_exclusion = SelfExclusionPage.error_ExcludeUntil(driver);
		
		// see if those errors are displayed
		logIsDisplayed(error_date_timeout, "error of timeout date");
		logIsDisplayed(error_time_timeout, "error of timeout time");
		logIsDisplayed(error_date_exclusion, "error of exclusion date");
		
		// see if error for valid date is shown or not
		logIsValidDate(error_date_timeout, "error of timeout date is not date");
		logIsValidDate(error_date_exclusion, "error of exclusion date is not date");
		
		// see if error for valid time is shown or not
		if(error_time_timeout.getText().equals("Time out cannot be in the past.")){
			System.out.println("Valid Time Error Shown : error of timeout time.");
		}else{
			System.out.println("Not Valid Time Error Shown : error of timeout time.");
		}
	}
	
	// test if error will appear if inputed date after 6 weeks in timeout field
	public static void testTimeOutSixWeekAfter_TimeOut(WebDriver driver){
		
		// get elements
		WebElement date_timeout = SelfExclusionPage.date_TimeOutUntilDate(driver);
		WebElement time_timeout = SelfExclusionPage.time_TimeOutUntilTime(driver);
		
		// clear them
		date_timeout.clear();
		time_timeout.clear();
		
		// key in date after 6 weeks and current time
		date_timeout.sendKeys(DateUtil.getSixWeekLaterDate());
		time_timeout.sendKeys(DateUtil.getCurrentTime());
		
		// get error element
		WebElement error_date_timeout = SelfExclusionPage.error_TimeOutUntilDate(driver);
		
		// log whether error is displayed and has correct 6 weeks timeout error
		logIsDisplayed(error_date_timeout, "error of 6 weeks timeout");
		logIsSixWeek_TimeOut(error_date_timeout, "error of 6 weeks timeout");
	}
	
	// test exclusion 6 months earlier date error
	public static void testSixMonthLesser_Exclusion(WebDriver driver){
		
		// get element and clear them
		WebElement date_exclusion = SelfExclusionPage.date_ExcludeUntil(driver);
		date_exclusion.clear();
		
		// send in date lesser than 6 months onto exclusion date field
		date_exclusion.sendKeys(DateUtil.getSixMonthLesserDate());
		
		// get error element
		WebElement error_date_exclusion = SelfExclusionPage.error_ExcludeUntil(driver);
		
		// log if error displayed and error lesser than 6 months appear
		logIsDisplayed(error_date_exclusion, "error of 6 months lesser exclusion");
		logIsSixMonthLesser_Exclusion(error_date_exclusion, "error of 6 months lesser exclusion");
	}
	
	// test if date after 5 years appear in exclusion date field
	public static void testFiveYearLater_Exclusion(WebDriver driver){
		
		// get element and clear it
		WebElement date_exclusion = SelfExclusionPage.date_ExcludeUntil(driver);
		date_exclusion.clear();
		
		// send in date after five years onto exclusion date field
		date_exclusion.sendKeys(DateUtil.getFiveYearLaterDate());
		
		// get error element
		WebElement error_date_exclusion = SelfExclusionPage.error_ExcludeUntil(driver);
		
		// log if error displayed and date after 5 years error shown
		logIsDisplayed(error_date_exclusion, "error of 5 yeears later exclusion");
		logIsFiveYearMore_Exclusion(error_date_exclusion, "error of 5 yeears later exclusion");
	}
	
	// test if yesterdays date is inputed onto timeout field
	public static void testYesterdayDate_Timeout(WebDriver driver){
		
		// get element
		WebElement date_timeout = SelfExclusionPage.date_TimeOutUntilDate(driver);
		WebElement time_timeout = SelfExclusionPage.time_TimeOutUntilTime(driver);

		// clear them
		date_timeout.clear();
		time_timeout.clear();
		
		// send in yesterday date and current time onto timeout date and time field.
		date_timeout.sendKeys(DateUtil.getYesterdayDate());
		time_timeout.sendKeys(DateUtil.getCurrentTime());
		
		// get their error elements
		WebElement error_date_timeout = SelfExclusionPage.error_TimeOutUntilDate(driver);
		WebElement error_time_timeout = SelfExclusionPage.error_TimeOutUntilTime(driver);
		
		// log if errors displayed
		logIsDisplayed(error_date_timeout, "error of yesterday date timeout");
		logIsDisplayed(error_time_timeout, "error of yesterday time timeout");
		
		// log if correct error shown
		logIsPassDate_Timeout(error_date_timeout, "error of yesterday date timeout");
		logIsPassTime_Timeout(error_time_timeout, "error of yesterday time timeout");
	}
	
	// test if time 5 minutes before now is inputed onto timeout
	public static void testFiveMinuteAgo_Timeout(WebDriver driver){
		
		// get elements
		WebElement date_timeout = SelfExclusionPage.date_TimeOutUntilDate(driver);
		WebElement time_timeout = SelfExclusionPage.time_TimeOutUntilTime(driver);
		
		// clear them
		date_timeout.clear();
		time_timeout.clear();
		
		// send in today date onto timeout date field and time 5 minutes ago onto timeout time field
		date_timeout.sendKeys(DateUtil.getTodayDate());
		time_timeout.sendKeys(DateUtil.getFiveMinutesAgoTime());
		
		// get timeout time field error element
		WebElement error_time_timeout = SelfExclusionPage.error_TimeOutUntilTime(driver);
		
		// check if time field error appear and pass time timeout error appeared
		logIsDisplayed(error_time_timeout, "error of pass time timeout");
		logIsPassTime_Timeout(error_time_timeout, "error of pass time timeout");
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
		logIsDisplayed(error_max_balance, "error for max balance need to be lesser");
		logIsDisplayed(error_max_turnover, "error for max turnover to be lesser");
		logIsDisplayed(error_max_losses, "error for max losses to be lesser");
		logIsDisplayed(error_max_7day_turnover, "error for max turnover in 7 days to be lesser");
		logIsDisplayed(error_max_7day_losses, "error for max losses in 7 days to be lesser");
		logIsDisplayed(error_max_30day_turnover, "error for max turnover in 30 days to be lesser");
		logIsDisplayed(error_max_30day_losses, "error for max losses in 30 days to be lesser");
		logIsDisplayed(error_max_open_bets, "error for max open bets to be lesser");
		logIsDisplayed(error_session_duraion_limit, "error for session duration limit to be lesser");

		
		// Check larger than original value errors displayed
		logIsValueLargerThanItShuold(error_max_balance, "error for max balance need to be lesser");
		logIsValueLargerThanItShuold(error_max_turnover, "error for max turnover to be lesser");
		logIsValueLargerThanItShuold(error_max_losses, "error for max losses to be lesser");
		logIsValueLargerThanItShuold(error_max_7day_turnover, "error for max turnover in 7 days to be lesser");
		logIsValueLargerThanItShuold(error_max_7day_losses, "error for max losses in 7 days to be lesser");
		logIsValueLargerThanItShuold(error_max_30day_turnover, "error for max turnover in 30 days to be lesser");
		logIsValueLargerThanItShuold(error_max_30day_losses, "error for max losses in 30 days to be lesser");
		logIsValueLargerThanItShuold(error_max_open_bets, "error for max open bets to be lesser");
		logIsValueLargerThanItShuold(error_session_duraion_limit, "error for session duration limit to be lesser");
	}
	
	// log if error displayed
	private static void logIsDisplayed(WebElement element, String denoted_item){
		if(element.isDisplayed()){
			System.out.println("Displayed : " + denoted_item + ".");
		}else{
			System.out.println("Not Displayed : " + denoted_item + ".");
		}
	}
	
	// log if error is about valid number
	private static void logIsValidNumber(WebElement element, String denoted_item){
		if(element.getText().equals("Should be a valid number")){
			System.out.println("Valid Error Shown : non-numeric " + denoted_item + ".");
		}else{
			System.out.println("Not Valid Error Shown : non-numeric " + denoted_item + ".");
		}
	}
	
	// log if error is required field
	private static void logIsRequiredErrorFieldShown(WebElement element, String denoted_item){
		if(element.getText().equals("This field is required.")){
			System.out.println("Required Field Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not Required Field Error Shown : " + denoted_item + ".");
		}
	}
	
	// log if error is about valid date
	private static void logIsValidDate(WebElement element, String denoted_item){
		if(element.getText().equals("Please select a valid date.")){
			System.out.println("Valid Date Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Valid Date Error Shown : " + denoted_item + ".");
		}
	}
	
	// log if error is about timeout date is more than 6 weeks 
	private static void logIsSixWeek_TimeOut(WebElement element, String denoted_item){
		if(element.getText().equals("Time out cannot be more than 6 weeks.")){
			System.out.println("6 weeks Timeout Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not 6 weeks Timeout Error Shown : " + denoted_item + ".");
		}
	}
	
	// log if error is about exclusion date lesser than 6 months
	private static void logIsSixMonthLesser_Exclusion(WebElement element, String denoted_item){
		if(element.getText().equals("Exclude time cannot be less than 6 months.")){
			System.out.println("6 Month lesser Exlusion Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not 6 Month lesser Exlusion Error Shown : " + denoted_item + ".");
		}
	}
	
	// log if error is about exlcusion date more than 5 years
	private static void logIsFiveYearMore_Exclusion(WebElement element, String denoted_item){
		if(element.getText().equals("Exclude time cannot be for more than 5 years.")){
			System.out.println("5 years more Exlusion Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not 5 years more Exlusion Error Shown : " + denoted_item + ".");
		}
	}
	
	// log if error is about timeout having date before today
	private static void logIsPassDate_Timeout(WebElement element, String denoted_item){
		if(element.getText().equals("Time out must be after today.")){
			System.out.println("Pass date timeout Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not Pass date Timeout Error Shown : " + denoted_item + ".");
		}
	}
	
	// log if error is about timeout having time in the past
	private static void logIsPassTime_Timeout(WebElement element, String denoted_item){
		if(element.getText().equals("Time out cannot be in the past.")){
			System.out.println("Pass time Timeout Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not Pass time Timeout Error Shown : " + denoted_item + ".");
		}
	}
	
	// log if value is larger than it should
	private static void logIsValueLargerThanItShuold(WebElement element, String denoted_item){
		if(element.getText().toLowerCase().contains(("Should be between").toLowerCase())){
			System.out.println("Value Larger Than Original Error Shown : " + denoted_item + ".");
		}else{
			System.out.println("Not Value Larger Than It Should  Error Shown : " + denoted_item + ".");
		}
	}
}
