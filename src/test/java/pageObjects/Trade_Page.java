package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.CommonFunctions;

public class Trade_Page {
	
	private static WebElement element = null;
	//Method to find market dropdown
	public static WebElement select_Market(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_markets']"));
		return element;
	}
	//Method to find asset dropdown
	public static WebElement select_Asset(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='underlying']"));
		return element;
	}
	//Method to find risefall link
	public static WebElement link_RiseFall(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='risefall']"));
		return element;
	}
	//Method to find higherlower link
	public static WebElement link_HigherLower(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='higherlower']"));
		return element;
	}
	//Method to find EndsInOut link
	public static WebElement link_EndsInOut(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='endsinout']"));
		return element;
	}
	//Method to find StaysInOut link
	public static WebElement link_StaysInOut(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='staysinout']"));
		return element;
	}
	//Method to find Matches/Differs link
	public static WebElement link_MatchesDiffers(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='matchdiff']"));
		return element;
	}
	//Method to find Even/Odd link
	public static WebElement link_EvenOdd(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='evenodd']"));
		return element;
	}
	//Method to find Over/Under link
	public static WebElement link_OverUnder(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='overunder']"));
		return element;
	}
	//Method to find Up/Down link
	public static WebElement link_UpDown(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_form_name_nav']/li[1]/a"));
		return element;
	}
	//Method to find Over/Under link
	public static WebElement link_TouchNoTouch(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='touchnotouch']"));
		return element;
	}
	//Method to find In/Out link
	public static WebElement link_InOut(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_form_name_nav']/li[3]/a"));
		return element;
	}
	//Method to find Asians link
	public static WebElement link_Asians(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='asian']"));
		return element;
	}
	//Method to find Digits link
	public static WebElement link_Digits(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_form_name_nav']/li[5]/a"));
		return element;
	}
	//Method to find Duration dropdown
	public static WebElement select_Duration(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='expiry_type']"));
		return element;
	}
	//Method to find Duration units dropdown
	public static WebElement select_DurationUnits(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='duration_units']"));
		return element;
	}
	//Method to find Last Digit Prediction dropdown
	public static WebElement select_LastDigitPrediction(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='prediction']"));
		return element;
	}
	//Method to find Amount Type dropdown
	public static WebElement select_AmountType(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='amount_type']"));
		return element;
	}
	//Method to find Amount textbox
	public static WebElement txt_Amount(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='amount']"));
		return element;
	}
	//Method to find Duration Amount textbox
	public static WebElement txt_DurationAmount(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='duration_amount']"));
		return element;
	}
	//Method to find High Barrier Offset textbox
	public static WebElement txt_HighBarrierOffset(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='barrier_high']"));
		return element;
	}
	//Method to find low Barrier Offset textbox
	public static WebElement txt_LowBarrierOffset(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='barrier_low']"));
		return element;
	}
	//Method to find Barrier textbox
	public static WebElement txt_BarrierOffset(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='barrier']"));
		return element;
	}
	//Method to find Top Purchase button 
	public static WebElement btn_TopPurchase(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='purchase_button_top']"));
		return element;
	}
	//Method to find Bottom Purchase button 
	public static WebElement btn_BottomPurchase(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='purchase_button_bottom']"));
		return element;
	}
	//Method to find contract error for Top Purchase
	public static WebElement err_TopPurchase(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='price_container_top']/div[3]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase
	public static WebElement err_BottomPurchase(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='price_container_bottom']/div[3]"));
		return element;
	}
	//Method to find contract error for Top Purchase with Expiry time cannot be equal to start time
	public static WebElement err_ExpiryTimeTop(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Expiry time cannot be equal to start time.')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase with Expiry time cannot be equal to start time
	public static WebElement err_ExpiryTimeBottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Expiry time cannot be equal to start time.')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase with Contracts greater than 24 hours
	public static WebElement err_GreaterThan24HrsTop(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase with Contracts greater than 24 hours
	public static WebElement err_GreaterThan24HrsBottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase with cannot create contract
	public static WebElement err_CannotCreateContractTop(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Cannot create contract')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase with cannot create contract
	public static WebElement err_CannotCreateContractBottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Cannot create contract')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase with contract must expire on trading day
	public static WebElement err_TradingDayExpireTop(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'The contract must expire on a trading day.')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase with contract must expire on trading day
	public static WebElement err_TradingDayExpireBottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'The contract must expire on a trading day.')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase with trading is not offered for this duration
	public static WebElement err_TradingOfferTop(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Trading is not offered for this duration.')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase with trading is not offered for this duration
	public static WebElement err_TradingOfferBottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Trading is not offered for this duration.')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase when payout < 0.5 or >5000
	public static WebElement err_Payout5000Top(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 5000.00.')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase when payout < 0.5 or >5000
	public static WebElement err_Payout5000Bottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 5000.00.')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase when payout < 0.5 or >1000
	public static WebElement err_Payout1000Top(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 1000.00.')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase when payout < 0.5 or >1000
	public static WebElement err_Payout1000Bottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Minimum stake of 0.50 and maximum payout of 1000.00.')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase when payout < 0.35 or >50000
	public static WebElement err_Payout50000Top(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Minimum stake of 0.35 and maximum payout of 50000.00.')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase when payout < 0.35 or >50000
	public static WebElement err_Payout50000Bottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Minimum stake of 0.35 and maximum payout of 50000.00.')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase when barrier is out of acceptable range
	public static WebElement err_BarrierRangeTop(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Barrier is out of acceptable range.')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase when barrier is out of acceptable range
	public static WebElement err_BarrierRangeBottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Barrier is out of acceptable range.')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase when absolute barrier is zero
	public static WebElement err_AbsoluteBarrierTop(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Absolute barrier cannot be zero')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase when when absolute barrier is zero
	public static WebElement err_AbsoluteBarrierBottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Absolute barrier cannot be zero')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase when barrier must be 2 pips away from spot
	public static WebElement err_BarrierPipsTop(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Barrier must be at least 2 pips away from the spot.')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase when barrier must be 2 pips away from spot
	public static WebElement err_BarrierPipsBottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Barrier must be at least 2 pips away from the spot.')])[2]"));
		return element;
	}
	//Method to find contract error for Top Purchase when barrier is zero
	public static WebElement err_BarrierZeroTop(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Absolute barrier cannot be zero')])[1]"));
		return element;
	}
	//Method to find contract error for Bottom Purchase when barrier is zero
	public static WebElement err_BarrierZeroBottom(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("(.//div[contains(text(),'Absolute barrier cannot be zero')])[2]"));
		return element;
	}
	//Method to find Start Time dropdown
	public static WebElement select_StartTime(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='date_start']"));
		return element;
	}
	//Method to find Currency dropdown
	public static WebElement select_Currency(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='currency']"));
		return element;
	}
	//Method to find Contract Confirmation screen
	public static WebElement screen_ContractConfirmation(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='confirmation_message']"));
		return element;
	}
	//Method to find View button
	public static WebElement btn_View(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_purchase_button']"));
		return element;
	}
	//Method to find Potential Payout text
	public static WebElement txt_PotentialPayout(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_purchase_payout']"));
		return element;
	}
	//Method to find Total Cost text
	public static WebElement txt_TotalCost(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_purchase_cost']"));
		return element;
	}
	//Method to find Potential Profit text
	public static WebElement txt_PotentialProfit(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_purchase_profit']"));
		return element;
	}
	//Method to find Contract Purchase description text
	public static WebElement txt_ContractPurchaseDescription(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_purchase_descr']"));
		return element;
	}
	//Method to find Contract Purchase heading text
	public static WebElement txt_ContractPurchaseHeading(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_purchase_heading']"));
		return element;
	}
	//Method to find Contract Purchase balance text
	public static WebElement txt_ContractPurchaseBalance(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_purchase_balance']"));
		return element;
	}
	//Method to find Contract Purchase reference text
	public static WebElement txt_ContractPurchaseReference(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_purchase_reference']"));
		return element;
	}
	//Method to find Sell Popup window
	public static WebElement window_SellPopup(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='sell_popup_container']"));
		return element;
	}
	//Method to find Sell Popup description
	public static WebElement txt_SellPopupDescription(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='sell_bet_desc']"));
		return element;
	}
	//Method to find Trade Details Contract Id description
	public static WebElement txt_TradeDetailsContractId(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='trade_details_contract_id']"));
		return element;
	}
	//Method to find Trade Details Potential Payout
	public static WebElement txt_TradeDetailsPayout(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='trade_details_contract_id']"));
		return element;
	}
	//Method to find Trade Details Purchase Price
	public static WebElement txt_TradeDetailsPurchasePrice(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='trade_details_purchase_price']"));
		return element;
	}
	//Method to find Trade Details Entry sPot
	public static WebElement txt_TradeDetailsEntrySpot(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='trade_details_entry_spot']"));
		return element;
	}
	//Method to find Trade Details Exit Spot
	public static WebElement txt_TradeDetailsExitSpot(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='trade_details_current_spot']"));
		return element;
	}
	//Method to find Trade Details Profit Loss
	public static WebElement txt_TradeDetailsProfitLoss(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='trade_details_profit_loss']"));
		return element;
	}
	//Method to find Trade Details Reference Id
	public static WebElement txt_TradeDetailsReferenceId(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='trade_details_ref_id']"));
		return element;
	}
	//Method to find Trade Details Indicative Price
	public static WebElement txt_TradeDetailsIndicative(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='trade_details_indicative_price']"));
		return element;
	}
		//Method to find Trade Details Close button
		public static WebElement btn_PopupCloseButton(WebDriver driver) {
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='sell_popup_container']/a"));
			return element;
		}
		//Method to find Sell At Market button
		public static WebElement btn_SellAtMarket(WebDriver driver) {
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='sell_at_market']"));
			return element;
		}
		//Method to find Contract Sell Message
		public static WebElement txt_ContractSellMessage(WebDriver driver) {
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='contract_sell_message']"));
			return element;
		}
		//Method to find Asian graph
		public static WebElement img_AsianContractGraph(WebDriver driver) {
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='highcharts.*]/svg"));
			return element;
		}
		//Method to find close button on Confirmation screen
		public static WebElement btn_CloseConfirmationScreen(WebDriver driver) {
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='close_confirmation_container']"));
			return element;
		}
		
}
