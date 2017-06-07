package appModules;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
    public static void checkMarketType(WebDriver driver) {
        //Method to check marketType  available
        ArrayList<String> expectedMarket = new ArrayList<String>();
        ArrayList<String> actualMarket = new ArrayList<String>();
    
        String[] marketType = {"Forex","Indices","OTC Stocks","Commodities","Volatility Indices"};
        for(String theString : marketType) {
            expectedMarket.add(theString);
            System.out.println(theString);
            System.out.println(expectedMarket.size());
        }
        
        List<WebElement> allMarket = Resources_Page.asset_list(driver); 
        List <WebElement> actualMarkets = allMarket;
        for (WebElement element: actualMarkets) {
            actualMarket.add(element.getText().trim());
            System.out.println(element.getText());
            System.out.println(actualMarket.size());
        }
        Assert.assertTrue(expectedMarket.size() == actualMarket.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedMarket.containsAll(actualMarket));
        
          Assert.assertEquals(actualMarket,expectedMarket);
       // Assert.assertTrue(expectedMarket.containsAll(actualMarket));

    }
}
