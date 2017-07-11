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

}
