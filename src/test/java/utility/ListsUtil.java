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
    // Method to compare two list of from a WebElement list
    public static void compareWebElementList(String[] expectedList,List<WebElement> actualList) {
        //Method to check marketType  available
        ArrayList<String> newExpectedList = new ArrayList<String>();
        ArrayList<String> newActualList = new ArrayList<String>();

        for(int i = 0;i<expectedList.length;i++) {
            newExpectedList.add(expectedList[i]); 
        }

        for (WebElement element: actualList) {
            newActualList.add(element.getText().trim());
        }
        // Verify both the lists having same size
        Assert.assertTrue(newExpectedList.size() == newActualList.size());
        // Compare expected and actual list
        Assert.assertTrue(newExpectedList.containsAll(newActualList));
        Assert.assertEquals(newExpectedList,newActualList);


    }
}
