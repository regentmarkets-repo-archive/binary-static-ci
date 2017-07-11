package testCases;

import org.testng.annotations.Test;
import utility.Constant;
import appModules.Login_Action;
import appModules.Navigation_Action;
import appModules.Resources_Action;
import appModules.Trading_Action;

public class Validate_ResourcesPage extends BaseClass{
    @Test(priority=0, description="Test Method to go to trading page")
    public void resourcePage() {
        driver.navigate().to(Constant.tradeURL);
        Trading_Action.CheckMarketOptions(driver);
        Navigation_Action.Navigate_To_ResourcesPage(driver);
    } 
  
    @Test(priority=1, description="Test Method to check resource page title")
    public void checkTitle() {
        Resources_Action.checkTitle(driver);
    }
    
    @Test(priority=2,description="Test method to check Asset Index")
    public void check_AssetIndex() {
        Resources_Action.link_AssetIndex(driver);
        
    }
    
    @Test(priority=3,description="Test method to check Forex Market")
    public void check_ForexMarket() {
        Resources_Action.checkMarket(driver);
        Resources_Action.clickNext(driver,0);
        Resources_Action.checkMajorPairs(driver);
        Resources_Action.checkMinorPairs(driver);
        Resources_Action.checkSmartFx(driver);
    }
    
    @Test(priority=4,description="Test method to check Indices Market")
    public void check_IndicesMarket() {
        Resources_Action.clickNext(driver,1);
        Resources_Action.checkAsiaOceaniaUnderlying(driver);
        Resources_Action.checkEuropeAfricaUnderlying(driver);
        Resources_Action.checkOTCIndices(driver);
        Resources_Action.checkAmericaIndices(driver);
        Resources_Action.checkMiddleEastIndices(driver);
    }
    
    @Test(priority=5, description="Test method to check OTC Stocks Market")
    public void check_OTCMarket() {
        Resources_Action.clickNext(driver,2);
        Resources_Action.checkGermanyStocks(driver);
        Resources_Action.checkIndiaStocks(driver);
        Resources_Action.checkUKStocks(driver);
        Resources_Action.checkUSStocks(driver);
    }
    @Test(priority=6, description="Test method to check Commodities Market")
    public void check_CommoditiesMarket() {
        Resources_Action.clickNext(driver,3);
        Resources_Action.checkMetalCOMM(driver);
        Resources_Action.checkEnergyCOMM(driver);
        Resources_Action.checkEnergyCOMM(driver);
    } 
    @Test(priority=6, description="Test method to check Volatility Market")
    public void check_VolatilityMarket() {
        Resources_Action.clickNext(driver,4);
        Resources_Action.checkCIVol(driver);
        Resources_Action.checkDailyVol(driver);
    } 
    @Test(priority=7,description="Test Method to Login using CR and check the market")
    public void Login() {
        Navigation_Action.Navigate_To_LoginPage(driver);
        Navigation_Action.Navigate_To_MainPage(driver, Constant.Email, Constant.Password);
        Navigation_Action.Navigate_To_ResourcesPage(driver);
        Resources_Action.link_AssetIndex(driver);
        Resources_Action.checkMarket(driver);
        Resources_Action.link_TradingTimes(driver);
        Resources_Action.checkMarketTradingTimes(driver);
        Navigation_Action.Navigate_To_LogoutPage(driver);
    }
    
    @Test(priority=8,description="Test Method to login to MF/MLT account ")
    public void loginMF() {
        Navigation_Action.Navigate_To_LoginPage(driver);
        Navigation_Action.Navigate_To_MainPage(driver, Constant.EmailMF, Constant.PassMF);
        Login_Action.continueTrading(driver);
        Navigation_Action.Navigate_To_ResourcesPage(driver);
        Resources_Action.link_AssetIndex(driver);
        Resources_Action.checkFinancialMarket(driver);
        Resources_Action.link_TradingTimes(driver);
        Resources_Action.checkFinancialMarketTradingTimes(driver);
        Login_Action.SwitchToMLTAccount(driver);
        Login_Action.continueTrading(driver);
        Navigation_Action.Navigate_To_ResourcesPage(driver);
        Resources_Action.link_AssetIndex(driver);
        Resources_Action.checkGamingMarket(driver);
        Resources_Action.link_TradingTimes(driver);
        Resources_Action.checkGamingMarketTradingTimes(driver);
        Navigation_Action.Navigate_To_LogoutPage(driver);
    }
    @Test(priority=9,description="Test Method to login to MX account ")
    public void loginMX() {
        Navigation_Action.Navigate_To_LoginPage(driver);
        Navigation_Action.Navigate_To_MainPage(driver, Constant.EmailMX, Constant.PassMx);
        Login_Action.continueTrading(driver);
        Navigation_Action.Navigate_To_ResourcesPage(driver);
        Resources_Action.link_AssetIndex(driver);
        Resources_Action.checkMarket(driver);
        Resources_Action.link_TradingTimes(driver);
        Resources_Action.checkMarketTradingTimes(driver);
        Navigation_Action.Navigate_To_LogoutPage(driver);
    }
}