package appModules;

import static org.testng.Assert.assertEquals;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.Resources_Page;
import utility.ListsUtil;


public class Resources_Action {

    //Method to check title

    public static void checkTitle(WebDriver driver) {
        String j= Resources_Page.title_page(driver).getText();
        System.out.println("Result : "+ j);
        Assert.assertEquals("Resources",j); 
    }
    public static void link_AssetIndex(WebDriver driver) {
        //Method go to Trading Times Asset Index
        Resources_Page.link_AssetIndex(driver).click();
    }
    public static void link_TradingTimes(WebDriver driver) {
        //Method go to Trading Times
        Resources_Page.link_TradingTimes(driver).click();
    }
    public static void checkMarket(WebDriver driver) {
        String[] marketType = {"Forex","Indices","OTC Stocks","Commodities","Volatility Indices"};
        List<WebElement> allMarket = Resources_Page.asset_list(driver);
        ListsUtil.compareMarketType(marketType,allMarket);
    }
    public static void checkMajorPairs(WebDriver driver) {
        String[] MajorPairs = {"AUD/JPY","AUD/USD","EUR/AUD","EUR/CAD","EUR/CHF","EUR/GBP","EUR/JPY","EUR/USD","GBP/AUD","GBP/JPY","GBP/USD","USD/CAD","USD/CHF","USD/JPY"};
        List<WebElement> MajorPairsUnderlying = Resources_Page.list_MajorPairsUnderlying(driver);
        ListsUtil.compareMajorPairsUnderlying(MajorPairs, MajorPairsUnderlying);
    }
    public static void checkMinorPairs(WebDriver driver) {
        String[] MinorPairs = {"AUD/CAD","AUD/CHF","AUD/NZD","AUD/PLN","EUR/NZD","GBP/CAD","GBP/CHF","GBP/NOK","GBP/NZD","GBP/PLN","NZD/JPY","NZD/USD","USD/MXN","USD/NOK","USD/PLN","USD/SEK"};
        List<WebElement> MinorPairsUnderlying = Resources_Page.list_MinorPairsUnderlying(driver);
        ListsUtil.compareMinorPairsUnderlying(MinorPairs, MinorPairsUnderlying);
    }
    public static void checkSmartFx(WebDriver driver) {
        String[] SmartFx ={"AUD Index","EUR Index","GBP Index","USD Index"}; 
        List<WebElement> SmartFxUnderlying = Resources_Page.list_SmartFxUnderlying(driver);
        ListsUtil.compareSmartFxUnderlying(SmartFx, SmartFxUnderlying);
    }
    public static void checkAsiaOceaniaUnderlying(WebDriver driver) {
        String[] AsiaOceania ={"Australian Index","Bombay Index","Hong Kong Index","Jakarta Index","Japanese Index","Singapore Index"}; 
        List<WebElement> AsiaOceaniaUnderlying = Resources_Page.list_AsiaOceaniaUnderlying(driver);
        ListsUtil.compareAsiaOceaniaUnderlying(AsiaOceania, AsiaOceaniaUnderlying);
    }
    public static void checkEuropeAfricaUnderlying(WebDriver driver) {
        String[] EuropeAfrica ={"Belgian Index","Dutch Index","French Index","German Index","Irish Index","Norwegian Index","South African Index","Swiss Index"}; 
        List<WebElement> EuropeAfricaUnderlying = Resources_Page.list_EuropeAfricaUnderlying(driver);
        ListsUtil.compareEuropeAfricaUnderlying(EuropeAfrica, EuropeAfricaUnderlying);
    }
    public static void checkOTCIndices(WebDriver driver) {
        String[] OTCIndices ={"Australian OTC Index","Belgian OTC Index","Bombay OTC Index","Dutch OTC Index","French OTC Index","German OTC Index","Hong Kong OTC Index","Istanbul OTC Index","Japanese OTC Index","UK OTC Index","US OTC Index","US Tech OTC Index","Wall Street OTC Index"}; 
        List<WebElement> OTCIndicesUnderlying = Resources_Page.list_OTCIndices(driver);
        ListsUtil.compareOTCIndicesUnderlying(OTCIndices, OTCIndicesUnderlying);
    }
    public static void checkAmericaIndices(WebDriver driver) {
       Assert.assertEquals("US Index",Resources_Page.IndicesAmerica(driver).getText());
    }
    public static void checkMiddleEastIndices(WebDriver driver) {
        Assert.assertEquals("Dubai Index",Resources_Page.IndicesMiddleEast(driver).getText());
     }
    public static void checkGermanyStocks(WebDriver driver) {
        String[] GermanyStocks ={"Airbus","Allianz","BMW","Daimler","Deutsche Bank","Novartis","SAP","Siemens"};
        List<WebElement> GermanyStocksUnderlying = Resources_Page.list_GermanyStocks(driver);
        ListsUtil.compareGermanyStocksUnderlying(GermanyStocks, GermanyStocksUnderlying);
    }
    public static void clickNext(WebDriver driver , int i) {
        List<WebElement> NextMarket = Resources_Page.asset_list(driver);
        NextMarket.get(i).click();
    }
    
}
