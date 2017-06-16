package testCases;

import org.testng.annotations.Test;
import utility.Constant;
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
    }
      
}