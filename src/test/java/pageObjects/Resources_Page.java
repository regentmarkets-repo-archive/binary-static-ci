package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class Resources_Page {

    private static WebElement element = null;
    //Method to find Title Page 
    public static WebElement title_page(WebDriver driver) {
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.xpath("//*[@id='content']/div[2]/h1")));
		return element;
    }
    //Method to find Asset Index link
    public static WebElement link_AssetIndex(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.xpath(".//*[@id='topMenuAssetIndex']/a")));
		return element;
    }
    // Method to find Trading Time link
    public static WebElement link_TradingTimes(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.xpath("//*[@id='topMenuTradingTimes']/a")));
		return element;
    }
    
    // Method to find asset index page 
    public static WebElement assetIndexPage(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.xpath("//*[@id='content']/div[2]/div")));
		return element;
    }
    // Method to find list of market asset list 
    public static List<WebElement> asset_list(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='asset-index']/ul/li"));
        return element; 
    }
    // Method to find list of market trading times
    public static List<WebElement> asset_listTradingTimes(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='trading-times']/ul/li"));
        return element; 
    }
    
    // Method to find list of Forex-major pairs underlying list 
    public static List<WebElement> list_MajorPairsUnderlying(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath(".//*[@id='submarket-major_pairs']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of Forex-minor pairs underlying list 
    public static List<WebElement> list_MinorPairsUnderlying(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath(".//*[@id='submarket-minor_pairs']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of Forex-smart fx underlying list 
    public static List<WebElement> list_SmartFxUnderlying(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath(".//*[@id='submarket-smart_fx']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of Asia/Oceania underlying list 
    public static List<WebElement> list_AsiaOceaniaUnderlying(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath(".//*[@id='submarket-asia_oceania']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of Europe/Africa underlying list 
    public static List<WebElement> list_EuropeAfricaUnderlying(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath(".//*[@id='submarket-europe_africa']/tbody/tr[*]/td[1]"));
        return element;
    }
    
    public static WebElement IndicesAmerica(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.xpath(".//*[@id='submarket-americas']/tbody/tr/td[1]")));
		return element;
    }
    public static WebElement IndicesMiddleEast(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.xpath(".//*[@id='submarket-middle_east']/tbody/tr/td[1]")));
		return element;
    }
    // Method to find list of OTC Indices underlying list 
    public static List<WebElement> list_OTCIndices(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath(".//*[@id='submarket-otc_index']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of OTC Stocks - Germany underlying list 
    public static List<WebElement> list_GermanyStocks(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath(".//*[@id='submarket-ge_otc_stock']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of OTC Stocks - India underlying list 
    public static List<WebElement> list_IndiaStocks(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='submarket-india_otc_stock']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of OTC Stocks - UK underlying list 
    public static List<WebElement> list_UKStocks(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='submarket-uk_otc_stock']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of OTC Stocks - US underlying list 
    public static List<WebElement> list_USStocks(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='submarket-us_otc_stock']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of Commodities- Metal  underlying list 
    public static List<WebElement> list_MetalCOMM(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='submarket-metals']/tbody/tr[*]/td[1]"));
        return element;
    }
    public static WebElement energyCOMM(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, (By.xpath("//*[@id='submarket-energy']/tbody/tr/td[1]")));
		return element;
    }
    // Method to find list of Continues Indices Volatility- Metal  underlying list 
    public static List<WebElement> list_CIVol(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='submarket-random_index']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of Daily Reset Volatility- Metal  underlying list 
    public static List<WebElement> list_DailyVol(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='submarket-random_daily']/tbody/tr[*]/td[1]"));
        return element;
    }
    // Method to find list of market times for JP Account 
    public static List<WebElement> list_JpMarket(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='外国為替-0']/tbody/tr[*]/td[1]"));
        return element;
    }
}
