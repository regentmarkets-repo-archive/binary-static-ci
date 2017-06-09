package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.Portfolio_Page;
import pageObjects.Trade_Page;

public class Portfolio_Action {	
	//Check Sell Contract in Portfolio
	public static void ValidatePortfolioSellContract(WebDriver driver,String submarket,String duration,String durationType,String amount) {
		Portfolio_Page.btn_View(driver).click();
		Assert.assertTrue(Trade_Page.window_SellPopup(driver).isDisplayed());
		Trade_Page.btn_SellAtMarket(driver).click();
		Assert.assertTrue(Trade_Page.txt_ContractSellMessage(driver).isDisplayed());
	}
}
