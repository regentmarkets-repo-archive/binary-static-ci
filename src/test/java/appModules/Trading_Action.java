package appModules;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageObjects.Trade_Page;
import utility.ListsUtil;

public class Trading_Action {
	//Check all market options
	public static void CheckMarketOptions(WebDriver driver) {
		String[] expectedMarkets = {"Forex","Major Pairs","Minor Pairs","Smart FX","Indices","Asia/Oceania",
				"Europe/Africa","Middle East","Americas","OTC Indices","OTC Stocks","Germany","India","UK","US",
				"Commodities","Metals","Energy","Volatility Indices","Continuous Indices","Daily Reset Indices"};
		WebElement element = Trade_Page.select_Market(driver);
		ListsUtil.CompareLists(expectedMarkets, element);
	}
	public static void CheckForexAssets(WebDriver driver) {
		//Check underlying assets for Forex market
		String[] forexAssets = {"AUD/JPY","AUD/USD","EUR/AUD","EUR/CAD","EUR/CHF","EUR/GBP","EUR/JPY","EUR/USD",
				"GBP/AUD","GBP/JPY","GBP/USD","USD/CAD","USD/CHF","USD/JPY","AUD/CAD","AUD/CHF","AUD/NZD","AUD/PLN",
				"EUR/NZD","GBP/CAD","GBP/CHF","GBP/NOK","GBP/NZD","GBP/PLN","NZD/JPY","NZD/USD","USD/MXN","USD/NOK",
				"USD/PLN","USD/SEK","AUD Index","EUR Index","GBP Index","USD Index"};
		Select oSelect = new Select(Trade_Page.select_Market(driver));
		oSelect.selectByVisibleText("Forex");
		WebElement element = Trade_Page.select_Asset(driver);
		ListsUtil.CompareLists(forexAssets, element);
		}
	public static void CheckIndicesAssets(WebDriver driver) {
		//Check underlying assets for Indices market
		String[] IndicesAssets = {"Australian Index","Bombay Index","Hong Kong Index","Jakarta Index","Japanese Index","Singapore Index","Belgian Index","Dutch Index",
				"French Index","German Index","Irish Index","Norwegian Index","South African Index","Swiss Index","Australian OTC Index","Belgian OTC Index","Bombay OTC Index","Dutch OTC Index",
				"French OTC Index","German OTC Index","Hong Kong OTC Index","Istanbul OTC Index","Japanese OTC Index","UK OTC Index","US OTC Index","US Tech OTC Index","Wall Street OTC Index","Dubai Index",
				"US Index"};
		Select oSelect = new Select(Trade_Page.select_Market(driver));
		oSelect.selectByVisibleText("Indices");
		WebElement element = Trade_Page.select_Asset(driver);
		ListsUtil.CompareLists(IndicesAssets, element);
		}
	public static void CheckOTCStocksAssets(WebDriver driver) {
		//Check underlying assets for Indices market
		String[] OTCStocksAssets = {"Airbus","Allianz","BMW","Daimler","Deutsche Bank","Novartis","SAP","Siemens","Bharti Airtel","Maruti Suzuki","Reliance Industries","Tata Steel","Barclays","BP",
				"British American Tobacco","HSBC","Lloyds Bank","Rio Tinto","Standard Chartered","Tesco","Alibaba","Alphabet","Amazon.com","American Express","Apple","Berkshire Hathaway","Boeing","Caterpillar",
				"Citigroup","Electronic Arts","Exxon Mobil","Facebook","Goldman Sachs","IBM","Johnson & Johnson","MasterCard","McDonald's","Microsoft",
				"PepsiCo","Procter & Gamble"};
		Select oSelect = new Select(Trade_Page.select_Market(driver));
		oSelect.selectByVisibleText("OTC Stocks");
		WebElement element = Trade_Page.select_Asset(driver);
		ListsUtil.CompareLists(OTCStocksAssets, element);
		}
	public static void CheckCommoditiesAssets(WebDriver driver) {
		//Check underlying assets for Indices market
		String[] CommoditiesAssets = {"Gold/USD","Palladium/USD","Platinum/USD","Silver/USD","Oil/USD"};
		Select oSelect = new Select(Trade_Page.select_Market(driver));
		oSelect.selectByVisibleText("Commodities");
		WebElement element = Trade_Page.select_Asset(driver);
		ListsUtil.CompareLists(CommoditiesAssets, element);
		}
	public static void CheckVolatilityIndicesAssets(WebDriver driver) {
		//Check underlying assets for Indices market
		String[] VolatilityIndicesAssets = {"Volatility 10 Index","Volatility 100 Index","Volatility 25 Index","Volatility 50 Index","Volatility 75 Index","Bear Market Index","Bull Market Index"};
		Select oSelect = new Select(Trade_Page.select_Market(driver));
		oSelect.selectByVisibleText("Volatility Indices");
		WebElement element = Trade_Page.select_Asset(driver);
		ListsUtil.CompareLists(VolatilityIndicesAssets, element);
		}
	public static void SelectEnterDuration(WebDriver driver,String durationAmount,String durationUnits) {
		//Select duration type and enter duration amount
		Select dSelect = new Select(Trade_Page.select_Duration(driver));
		dSelect.selectByValue("duration");
		Select tSelect = new Select(Trade_Page.select_DurationUnits(driver));
		tSelect.selectByValue(durationUnits);
		Actions action = new Actions(driver);
		action.doubleClick(Trade_Page.txt_DurationAmount(driver)).perform();
		Trade_Page.txt_DurationAmount(driver).sendKeys(durationAmount);
		Trade_Page.txt_Amount(driver).click();
	}
	public static void SelectEnterAmount(WebDriver driver,String amount_value,String amount_type) {
		//Select duration and Enter amount
		SelectEnterDuration(driver,"1","d");
		Select oSelect = new Select(Trade_Page.select_AmountType(driver));
		oSelect.selectByVisibleText(amount_type);
		Actions builder = new Actions(driver);
		Action seriesofActions = builder
				.doubleClick(Trade_Page.txt_Amount(driver))
				.sendKeys(amount_value)
				.build();
		seriesofActions.perform();
	}
	public static void NavigateToUpDownRiseFall(WebDriver driver,String market,String asset) {
		Select mSelect = new Select(Trade_Page.select_Market(driver));
		mSelect.selectByVisibleText(market);
		Select aSelect = new Select(Trade_Page.select_Asset(driver));
		aSelect.selectByVisibleText(asset);
		Trade_Page.link_UpDown(driver).click();
		Trade_Page.link_RiseFall(driver).click();
	}
	public static void NavigateToUpDownHigherLower(WebDriver driver,String market,String asset) {
		Select mSelect = new Select(Trade_Page.select_Market(driver));
		mSelect.selectByVisibleText(market);
		Select aSelect = new Select(Trade_Page.select_Asset(driver));
		aSelect.selectByVisibleText(asset);
		Trade_Page.link_UpDown(driver).click();
		Trade_Page.link_HigherLower(driver).click();
	}
	public static void NavigateToTouchNoTouch(WebDriver driver,String market,String asset) {
		Select mSelect = new Select(Trade_Page.select_Market(driver));
		mSelect.selectByVisibleText(market);
		Select aSelect = new Select(Trade_Page.select_Asset(driver));
		aSelect.selectByVisibleText(asset);
		Trade_Page.link_TouchNoTouch(driver).click();
	}
	public static void NavigateToInOutEndsInOut(WebDriver driver,String market,String asset) {
		Select mSelect = new Select(Trade_Page.select_Market(driver));
		mSelect.selectByVisibleText(market);
		Select aSelect = new Select(Trade_Page.select_Asset(driver));
		aSelect.selectByVisibleText(asset);
		Trade_Page.link_InOut(driver).click();
		Trade_Page.link_EndsInOut(driver).click();
	}
	public static void NavigateToInOutStaysInGoesOut(WebDriver driver,String market,String asset) {
		Select mSelect = new Select(Trade_Page.select_Market(driver));
		mSelect.selectByVisibleText(market);
		Select aSelect = new Select(Trade_Page.select_Asset(driver));
		aSelect.selectByVisibleText(asset);
		Trade_Page.link_InOut(driver).click();
		Trade_Page.link_StaysInOut(driver).click();
	}
	public static void NavigateToAsians(WebDriver driver,String market,String asset) {
		Select mSelect = new Select(Trade_Page.select_Market(driver));
		mSelect.selectByVisibleText(market);
		Select aSelect = new Select(Trade_Page.select_Asset(driver));
		aSelect.selectByVisibleText(asset);
		Trade_Page.link_Asians(driver).click();
	}
	public static void NavigateToDigitsMatchesDiffers(WebDriver driver,String market,String asset) {
		Select mSelect = new Select(Trade_Page.select_Market(driver));
		mSelect.selectByVisibleText(market);
		Select aSelect = new Select(Trade_Page.select_Asset(driver));
		aSelect.selectByVisibleText(asset);
		Trade_Page.link_Digits(driver).click();
		Trade_Page.link_MatchesDiffers(driver).click();
	}
	public static void NavigateToDigitsEvenOdd(WebDriver driver,String market,String asset) {
		Select mSelect = new Select(Trade_Page.select_Market(driver));
		mSelect.selectByVisibleText(market);
		Select aSelect = new Select(Trade_Page.select_Asset(driver));
		aSelect.selectByVisibleText(asset);
		Trade_Page.link_Digits(driver).click();
		Trade_Page.link_EvenOdd(driver).click();
	}
	public static void NavigateToDigitsOverUnder(WebDriver driver,String market,String asset) {
		Select mSelect = new Select(Trade_Page.select_Market(driver));
		mSelect.selectByVisibleText(market);
		Select aSelect = new Select(Trade_Page.select_Asset(driver));
		aSelect.selectByVisibleText(asset);
		Trade_Page.link_Digits(driver).click();
		Trade_Page.link_OverUnder(driver).click();
	}
	public static void ValidateDurationFields(WebDriver driver,String durationType){
		if(durationType=="t"){
			SelectEnterDuration(driver,"2",durationType);
			Assert.assertEquals(Trade_Page.err_TopPurchase(driver).getText(), "Number of ticks must be between 5 and 10");
			Assert.assertEquals(Trade_Page.err_BottomPurchase(driver).getText(), "Number of ticks must be between 5 and 10");
			SelectEnterDuration(driver,"11",durationType);
			Assert.assertEquals(Trade_Page.err_TopPurchase(driver).getText(), "Number of ticks must be between 5 and 10");
			Assert.assertEquals(Trade_Page.err_BottomPurchase(driver).getText(), "Number of ticks must be between 5 and 10");
		}
		else if(durationType=="s") {
			SelectEnterDuration(driver,"2",durationType);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			Assert.assertEquals(Trade_Page.err_TradingOfferTop(driver).getText(), "Trading is not offered for this duration.");
			Assert.assertEquals(Trade_Page.err_TradingOfferBottom(driver).getText(), "Trading is not offered for this duration.");
			SelectEnterDuration(driver,"99999",durationType);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			Assert.assertEquals(Trade_Page.err_GreaterThan24HrsTop(driver).getText(), "Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.");
			Assert.assertEquals(Trade_Page.err_GreaterThan24HrsBottom(driver).getText(), "Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.");
		}
		else if(durationType=="m"){
			SelectEnterDuration(driver,"0",durationType);
			Assert.assertEquals(Trade_Page.err_ExpiryTimeTop(driver).getText(), "Expiry time cannot be equal to start time.");
			Assert.assertEquals(Trade_Page.err_ExpiryTimeBottom(driver).getText(), "Expiry time cannot be equal to start time.");
			SelectEnterDuration(driver,"1500",durationType);
			Assert.assertEquals(Trade_Page.err_GreaterThan24HrsTop(driver).getText(), "Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.");
			Assert.assertEquals(Trade_Page.err_GreaterThan24HrsBottom(driver).getText(), "Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.");
		}
		else if(durationType=="h"){
			SelectEnterDuration(driver,"0",durationType);
			Assert.assertEquals(Trade_Page.err_ExpiryTimeTop(driver).getText(), "Expiry time cannot be equal to start time.");
			Assert.assertEquals(Trade_Page.err_ExpiryTimeBottom(driver).getText(), "Expiry time cannot be equal to start time.");
			SelectEnterDuration(driver,"25",durationType);
			Assert.assertEquals(Trade_Page.err_GreaterThan24HrsTop(driver).getText(), "Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.");
			Assert.assertEquals(Trade_Page.err_GreaterThan24HrsBottom(driver).getText(), "Contracts on this market with a duration of more than 24 hours must expire at the end of a trading day.");
		}
		else if(durationType=="d"){
			SelectEnterDuration(driver,"0",durationType);
			Assert.assertEquals(Trade_Page.err_ExpiryTimeTop(driver).getText(), "Expiry time cannot be equal to start time.");
			Assert.assertEquals(Trade_Page.err_ExpiryTimeBottom(driver).getText(), "Expiry time cannot be equal to start time.");
			SelectEnterDuration(driver,"366",durationType);
			Assert.assertEquals(Trade_Page.err_CannotCreateContractTop(driver).getText(), "Cannot create contract");
			Assert.assertEquals(Trade_Page.err_CannotCreateContractBottom(driver).getText(), "Cannot create contract");
		}
	}
	public static void ValidateAmountField(WebDriver driver,String market,String amount_type){
		if(market=="Volatility Indices"){
			SelectEnterAmount(driver,"0.34",amount_type);
			Assert.assertEquals(Trade_Page.err_TopPurchase(driver).getText(), "Minimum stake of 0.35 and maximum payout of 50,000.00");
			Assert.assertEquals(Trade_Page.err_BottomPurchase(driver).getText(), "Minimum stake of 0.35 and maximum payout of 50,000.00");
			SelectEnterAmount(driver,"51000",amount_type);
			Assert.assertEquals(Trade_Page.err_TopPurchase(driver).getText(), "Minimum stake of 0.35 and maximum payout of 50,000.00");
			Assert.assertEquals(Trade_Page.err_BottomPurchase(driver).getText(), "Minimum stake of 0.35 and maximum payout of 50,000.00");
		}
		else if (market=="Forex"){
			SelectEnterAmount(driver,"0.49",amount_type);
			Assert.assertEquals(Trade_Page.err_TopPurchase(driver).getText(), "Minimum stake of 0.50 and maximum payout of 20,000.00");
			Assert.assertEquals(Trade_Page.err_BottomPurchase(driver).getText(), "Minimum stake of 0.50 and maximum payout of 20,000.00");
			SelectEnterAmount(driver,"21000",amount_type);
			Assert.assertEquals(Trade_Page.err_TopPurchase(driver).getText(), "Minimum stake of 0.50 and maximum payout of 20,000.00");
			Assert.assertEquals(Trade_Page.err_BottomPurchase(driver).getText(), "Minimum stake of 0.50 and maximum payout of 20,000.00");
		}
		else if (market=="Commodities"){
			SelectEnterAmount(driver,"0.49",amount_type);
			Assert.assertEquals(Trade_Page.err_TopPurchase(driver).getText(), "Minimum stake of 0.50 and maximum payout of 5,000.00");
			Assert.assertEquals(Trade_Page.err_BottomPurchase(driver).getText(), "Minimum stake of 0.50 and maximum payout of 5,000.00");
			SelectEnterAmount(driver,"5100",amount_type);
			Assert.assertEquals(Trade_Page.err_TopPurchase(driver).getText(), "Minimum stake of 0.50 and maximum payout of 5,000.00");
			Assert.assertEquals(Trade_Page.err_BottomPurchase(driver).getText(), "Minimum stake of 0.50 and maximum payout of 5,000.00");
		}
	}
	public static void ValidateBarrierField(WebDriver driver,String submarket,String amount_type){
		if(submarket=="TouchNoTouch"){
		SelectEnterAmount(driver,"10",amount_type);
		Trade_Page.txt_BarrierOffset(driver).clear();
		Trade_Page.txt_BarrierOffset(driver).sendKeys("0");
		Assert.assertEquals(Trade_Page.err_BarrierPipsTop(driver).getText(), "Barrier must be at least 2 pips away from the spot.");
		Assert.assertEquals(Trade_Page.err_BarrierPipsTop(driver).getText(), "Barrier must be at least 2 pips away from the spot.");
		SelectEnterAmount(driver,"10",amount_type);
		Trade_Page.txt_BarrierOffset(driver).clear();
		Trade_Page.txt_BarrierOffset(driver).sendKeys("2");
		Assert.assertEquals(Trade_Page.err_BarrierRangeTop(driver).getText(), "Barrier is out of acceptable range.");
		Assert.assertEquals(Trade_Page.err_BarrierRangeBottom(driver).getText(), "Barrier is out of acceptable range.");
	} else if(submarket=="HigherLower"){
		SelectEnterAmount(driver,"10",amount_type);
		Trade_Page.txt_BarrierOffset(driver).clear();
		Trade_Page.txt_BarrierOffset(driver).sendKeys("0");
		Assert.assertEquals(Trade_Page.err_BarrierZeroTop(driver).getText(), "Absolute barrier cannot be zero");
		Assert.assertEquals(Trade_Page.err_BarrierZeroTop(driver).getText(), "Absolute barrier cannot be zero");
		SelectEnterAmount(driver,"10",amount_type);
		Trade_Page.txt_BarrierOffset(driver).clear();
		Trade_Page.txt_BarrierOffset(driver).sendKeys("2");
		Assert.assertEquals(Trade_Page.err_BarrierRangeTop(driver).getText(), "Barrier is out of acceptable range.");
		Assert.assertEquals(Trade_Page.err_BarrierRangeBottom(driver).getText(), "Barrier is out of acceptable range.");
	}
	}
	
}
	

