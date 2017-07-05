package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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
		WebDriverWait wait = new WebDriverWait(driver,60);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='purchase_button_top']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Bottom Purchase button 
	public static WebElement btn_BottomPurchase(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
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
	public static WebElement err_Payout5000Top(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 5000.00.')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase when payout < 0.5 or >5000
	public static WebElement err_Payout5000Bottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 5000.00.')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase when payout < 0.5 or >1000
	public static WebElement err_Payout1000Top(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 1000.00.')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase when payout < 0.5 or >1000
	public static WebElement err_Payout1000Bottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 1000.00.')])[2]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Top Purchase when payout < 0.35 or >50000
	public static WebElement err_Payout50000Top(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Minimum stake of 0.35 and maximum payout of 50000.00.')])[1]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find contract error for Bottom Purchase when payout < 0.35 or >50000
	public static WebElement err_Payout50000Bottom(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//div[contains(text(),'Minimum stake of 0.35 and maximum payout of 50000.00.')])[2]")));
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
	//Method to find Contract Confirmation screen
	public static WebElement screen_ContractConfirmation(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='confirmation_message']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find View button
	public static WebElement btn_View(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_purchase_button']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Potential Payout text
	public static WebElement txt_PotentialPayout(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_purchase_payout']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Total Cost text
	public static WebElement txt_TotalCost(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_purchase_cost']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Potential Profit text
	public static WebElement txt_PotentialProfit(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_purchase_profit']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Contract Purchase description text
	public static WebElement txt_ContractPurchaseDescription(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_purchase_descr']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Contract Purchase heading text
	public static WebElement txt_ContractPurchaseHeading(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_purchase_heading']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Contract Purchase balance text
	public static WebElement txt_ContractPurchaseBalance(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_purchase_balance']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Contract Purchase reference text
	public static WebElement txt_ContractPurchaseReference(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_purchase_reference']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Sell Popup window
	public static WebElement window_SellPopup(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sell_popup_container']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Sell Popup description
	public static WebElement txt_SellPopupDescription(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sell_bet_desc']']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Trade Details Contract Id description
	public static WebElement txt_TradeDetailsContractId(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='trade_details_contract_id']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Trade Details Potential Payout
	public static WebElement txt_TradeDetailsPayout(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='trade_details_contract_id']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Trade Details Purchase Price
	public static WebElement txt_TradeDetailsPurchasePrice(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='trade_details_purchase_price']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Trade Details Entry sPot
	public static WebElement txt_TradeDetailsEntrySpot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='trade_details_entry_spot']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Trade Details Exit Spot
	public static WebElement txt_TradeDetailsExitSpot(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='trade_details_current_spot']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Trade Details Profit Loss
	public static WebElement txt_TradeDetailsProfitLoss(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='trade_details_profit_loss']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Trade Details Reference Id
	public static WebElement txt_TradeDetailsReferenceId(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='trade_details_ref_id']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find Trade Details Indicative Price
	public static WebElement txt_TradeDetailsIndicative(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='trade_details_indicative_price']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
		//Method to find Trade Details Close button
		public static WebElement btn_PopupCloseButton(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sell_popup_container']/a")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Sell At Market button
		public static WebElement btn_SellAtMarket(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='sell_at_market']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Contract Sell Message
		public static WebElement txt_ContractSellMessage(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contract_sell_message']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Asian graph
		public static WebElement img_AsianContractGraph(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='highcharts.*]/svg")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find close button on Confirmation screen
		public static WebElement btn_CloseConfirmationScreen(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='close_confirmation_container']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		
}
