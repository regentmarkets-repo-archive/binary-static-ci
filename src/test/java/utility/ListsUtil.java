package utility;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class ListsUtil {

    //Method to compare two lists
    public static void CompareLists(String[] expectedArr,WebElement element) {
        ArrayList<String> expectedList = new ArrayList<String>();
        ArrayList<String> actualList = new ArrayList<String>();
        for(int i = 0;i<expectedArr.length;i++) {
            expectedList.add(expectedArr[i]);	
        }
        Select oSelect = new Select(element);
        List <WebElement> actualMarkets = oSelect.getOptions();
        for(WebElement value : actualMarkets){
            actualList.add(value.getText().trim());
        }
        // Verify both the lists having same size
        Assert.assertTrue(expectedList.size() == actualList.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedList.containsAll(actualList));

    }
    // Method to compare two list of market type
    public static void compareMarketType(String[] marketType,List<WebElement> allMarket) {
        //Method to check marketType  available
        ArrayList<String> expectedMarket = new ArrayList<String>();
        ArrayList<String> actualMarket = new ArrayList<String>();

        for(int i = 0;i<marketType.length;i++) {
            expectedMarket.add(marketType[i]); 
        }

        for (WebElement element: allMarket) {
            actualMarket.add(element.getText().trim());
        }
        // Verify both the lists having same size
        Assert.assertTrue(expectedMarket.size() == actualMarket.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedMarket.containsAll(actualMarket));
        Assert.assertEquals(actualMarket,expectedMarket);


    }
    // Method to compare two list of Forex - Major Pairs Underlying
    public static void compareMajorPairsUnderlying(String[] MajorPairs,List<WebElement> MajorPairsUnderlying) {

        ArrayList<String> expectedMajorPairsUnderlying = new ArrayList<String>();
        ArrayList<String> actualMajorPairsUnderlying = new ArrayList<String>();

        for(int i = 0;i<MajorPairs.length;i++) {
            expectedMajorPairsUnderlying.add(MajorPairs[i]); 
        }

        for (WebElement element: MajorPairsUnderlying) {
            actualMajorPairsUnderlying.add(element.getText().trim());

        }
        // Verify both the lists having same size
        Assert.assertTrue(expectedMajorPairsUnderlying.size() == actualMajorPairsUnderlying.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedMajorPairsUnderlying.containsAll(actualMajorPairsUnderlying));
        Assert.assertEquals(expectedMajorPairsUnderlying,actualMajorPairsUnderlying);
    }

    // Method to compare two list of Forex - Minor Pairs Underlying
    public static void compareMinorPairsUnderlying(String[] MinorPairs,List<WebElement> MinorPairsUnderlying) {

        ArrayList<String> expectedMinorPairsUnderlying = new ArrayList<String>();
        ArrayList<String> actualMinorPairsUnderlying = new ArrayList<String>();

        for(int i = 0;i<MinorPairs.length;i++) {
            expectedMinorPairsUnderlying.add(MinorPairs[i]); 
        }


        for (WebElement element: MinorPairsUnderlying) {
            actualMinorPairsUnderlying.add(element.getText().trim()); 
        }
        // Verify both the lists having same size
        Assert.assertTrue(expectedMinorPairsUnderlying.size() == actualMinorPairsUnderlying.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedMinorPairsUnderlying.containsAll(actualMinorPairsUnderlying));
        Assert.assertEquals(expectedMinorPairsUnderlying,actualMinorPairsUnderlying);
    }

    // Method to compare two list of Forex - Smart Fx Underlying
    public static void compareSmartFxUnderlying(String[] SmartFx,List<WebElement> SmartFxUnderlying) {

        ArrayList<String> expectedSmartFxUnderlying = new ArrayList<String>();
        ArrayList<String> actualSmartFxUnderlying = new ArrayList<String>();

        for(int i = 0;i<SmartFx.length;i++) {
            expectedSmartFxUnderlying.add(SmartFx[i]); 
        }


        for (WebElement element: SmartFxUnderlying) {
            actualSmartFxUnderlying.add(element.getText().trim());
        }
        // Verify both the lists having same size
        Assert.assertTrue(expectedSmartFxUnderlying.size() == actualSmartFxUnderlying.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedSmartFxUnderlying.containsAll(actualSmartFxUnderlying));
        Assert.assertEquals(expectedSmartFxUnderlying,actualSmartFxUnderlying);
    }

    // Method to compare two list of Indices Underlying
    public static void compareAsiaOceaniaUnderlying(String[] AsiaOceania,List<WebElement> AsiaOceaniaUnderlying) {
        
        ArrayList<String> expectedAsiaOceaniaUnderlying = new ArrayList<String>();
        ArrayList<String> actualAsiaOceaniaUnderlying = new ArrayList<String>();

        for(int i = 0;i<AsiaOceania.length;i++) {
            expectedAsiaOceaniaUnderlying.add(AsiaOceania[i]); 
        }

     
        for (WebElement element: AsiaOceaniaUnderlying) {
            actualAsiaOceaniaUnderlying.add(element.getText().trim());
        }
     // Verify both the lists having same size
        Assert.assertTrue(expectedAsiaOceaniaUnderlying.size() == actualAsiaOceaniaUnderlying.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedAsiaOceaniaUnderlying.containsAll(actualAsiaOceaniaUnderlying));
        Assert.assertEquals(expectedAsiaOceaniaUnderlying,actualAsiaOceaniaUnderlying);
    }
    // Method to compare two list of Indices Underlying
    public static void compareEuropeAfricaUnderlying(String[] EuropeAfrica,List<WebElement> EuropeAfricaUnderlying) {
        
        ArrayList<String> expectedAEuropeAfricaUnderlying = new ArrayList<String>();
        ArrayList<String> actualEuropeAfricaUnderlying = new ArrayList<String>();

        for(int i = 0;i<EuropeAfrica.length;i++) {
            actualEuropeAfricaUnderlying.add(EuropeAfrica[i]); 
        }

        for (WebElement element: EuropeAfricaUnderlying) {
            expectedAEuropeAfricaUnderlying.add(element.getText().trim());
        }
     // Verify both the lists having same size
        Assert.assertTrue(expectedAEuropeAfricaUnderlying.size() == actualEuropeAfricaUnderlying.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedAEuropeAfricaUnderlying.containsAll(actualEuropeAfricaUnderlying));
        Assert.assertEquals(expectedAEuropeAfricaUnderlying,actualEuropeAfricaUnderlying);
    }
    public static void compareOTCIndicesUnderlying(String[] OTCIndices,List<WebElement> OTCIndicesUnderlying) {
        
        ArrayList<String> expectedOTCIndicesUnderlying = new ArrayList<String>();
        ArrayList<String> actualOTCIndicesUnderlying = new ArrayList<String>();

        for(int i = 0;i<OTCIndices.length;i++) {
            expectedOTCIndicesUnderlying.add(OTCIndices[i]); 
        }

        for (WebElement element: OTCIndicesUnderlying) {
            actualOTCIndicesUnderlying.add(element.getText().trim());
        }
     // Verify both the lists having same size
        Assert.assertTrue(expectedOTCIndicesUnderlying.size() == actualOTCIndicesUnderlying.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedOTCIndicesUnderlying.containsAll(actualOTCIndicesUnderlying));
        Assert.assertEquals(expectedOTCIndicesUnderlying,actualOTCIndicesUnderlying);
    }
    public static void compareGermanyStocksUnderlying(String[] GermanyStocks,List<WebElement> GermanyStocksUnderlying) {
        
        ArrayList<String> expectedGermanyStocksUnderlying = new ArrayList<String>();
        ArrayList<String> actualGermanyStocksUnderlying = new ArrayList<String>();

        for(int i = 0;i<GermanyStocks.length;i++) {
            expectedGermanyStocksUnderlying.add(GermanyStocks[i]); 
            System.out.println(expectedGermanyStocksUnderlying);
        }

        for (WebElement element: GermanyStocksUnderlying) {
            actualGermanyStocksUnderlying.add(element.getText().trim());
            System.out.println(actualGermanyStocksUnderlying);
        }
     // Verify both the lists having same size
        Assert.assertTrue(expectedGermanyStocksUnderlying.size() == actualGermanyStocksUnderlying.size());
        // Compare expected and actual list
        Assert.assertTrue(expectedGermanyStocksUnderlying.containsAll(actualGermanyStocksUnderlying));
        Assert.assertEquals(expectedGermanyStocksUnderlying,actualGermanyStocksUnderlying);
    }
}
