package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Trade_Page {
	
	private static WebElement element = null;
	//Method to find market dropdown
	public static WebElement select_Market(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_markets']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find asset dropdown
	public static WebElement select_Asset(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='underlying']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find risefall link
	public static WebElement link_RiseFall(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='risefall']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find higherlower link
	public static WebElement link_HigherLower(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='higherlower']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find EndsInOut link
	public static WebElement link_EndsInOut(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='endsinout']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find StaysInOut link
	public static WebElement link_StaysInOut(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='staysinout']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Matches/Differs link
	public static WebElement link_MatchesDiffers(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='matchdiff']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Even/Odd link
	public static WebElement link_EvenOdd(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='evenodd']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Over/Under link
	public static WebElement link_OverUnder(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='overunder']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Up/Down link
	public static WebElement link_UpDown(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_form_name_nav']/li[1]/a")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Over/Under link
	public static WebElement link_TouchNoTouch(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='touchnotouch']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find In/Out link
	public static WebElement link_InOut(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_form_name_nav']/li[3]/a")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Asians link
	public static WebElement link_Asians(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='asian']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Digits link
	public static WebElement link_Digits(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_form_name_nav']/li[5]/a")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Duration dropdown
	public static WebElement select_Duration(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='expiry_type']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Duration units dropdown
	public static WebElement select_DurationUnits(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='duration_units']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Last Digit Prediction dropdown
	public static WebElement select_LastDigitPrediction(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='prediction']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Amount Type dropdown
	public static WebElement select_AmountType(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='amount_type']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Amount textbox
	public static WebElement txt_Amount(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='amount']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Duration Amount textbox
	public static WebElement txt_DurationAmount(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='duration_amount']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find High Barrier Offset textbox
	public static WebElement txt_HighBarrierOffset(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='barrier_high']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find low Barrier Offset textbox
	public static WebElement txt_LowBarrierOffset(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='barrier_low']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Barrier textbox
	public static WebElement txt_BarrierOffset(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='barrier']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Top Purchase button 
	public static WebElement btn_TopPurchase(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='purchase_button_top']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Bottom Purchase button 
	public static WebElement btn_BottomPurchase(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='purchase_button_bottom']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase
	public static WebElement err_TopPurchase(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='price_container_top']/div[3]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase
	public static WebElement err_BottomPurchase(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='price_container_bottom']/div[3]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase with Expiry time cannot be equal to start time
	public static WebElement err_ExpiryTimeTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Expiry time cannot be equal to start time.')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase with Expiry time cannot be equal to start time
	public static WebElement err_ExpiryTimeBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Expiry time cannot be equal to start time.')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase with Contracts greater than 24 hours
	public static WebElement err_GreaterThan24HrsTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase with Contracts greater than 24 hours
	public static WebElement err_GreaterThan24HrsBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase with cannot create contract
	public static WebElement err_CannotCreateContractTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Cannot create contract')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase with cannot create contract
	public static WebElement err_CannotCreateContractBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Cannot create contract')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase with contract must expire on trading day
	public static WebElement err_TradingDayExpireTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'The contract must expire on a trading day.')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase with contract must expire on trading day
	public static WebElement err_TradingDayExpireBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'The contract must expire on a trading day.')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase with trading is not offered for this duration
	public static WebElement err_TradingOfferTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Trading is not offered for this duration.')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase with trading is not offered for this duration
	public static WebElement err_TradingOfferBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Trading is not offered for this duration.')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase when payout < 0.5 or >5000
	public static WebElement err_PayoutTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 5,000.00')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase when payout < 0.5 or >5000
	public static WebElement err_PayoutBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 5,000.00')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase when barrier is out of acceptable range
	public static WebElement err_BarrierRangeTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Barrier is out of acceptable range.')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase when barrier is out of acceptable range
	public static WebElement err_BarrierRangeBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Barrier is out of acceptable range.')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase when absolute barrier is zero
	public static WebElement err_AbsoluteBarrierTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Absolute barrier cannot be zero')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase when when absolute barrier is zero
	public static WebElement err_AbsoluteBarrierBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Absolute barrier cannot be zero')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase when barrier must be 2 pips away from spot
	public static WebElement err_BarrierPipsTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Barrier must be at least 2 pips away from the spot.')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase when barrier must be 2 pips away from spot
	public static WebElement err_BarrierPipsBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Barrier must be at least 2 pips away from the spot.')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase when barrier is zero
	public static WebElement err_BarrierZeroTop(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Absolute barrier cannot be zero')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase when barrier is zero
	public static WebElement err_BarrierZeroBottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Absolute barrier cannot be zero')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	
	//Method to find Start Time dropdown
	public static WebElement select_StartTime(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='date_start']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Currency dropdown
	public static WebElement select_Currency(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='currency']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	

}
