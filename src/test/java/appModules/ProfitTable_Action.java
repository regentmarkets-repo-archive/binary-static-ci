package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.ProfitTable_Page;
import pageObjects.Trade_Page;

public class ProfitTable_Action {
	
	public static void ValidateViewContract(WebDriver driver){
		ProfitTable_Page.btn_View(driver).click();
		Assert.assertTrue(Trade_Page.window_SellPopup(driver).isDisplayed());
	}

}
