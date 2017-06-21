package appModules;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.ProfitTable_Page;
import pageObjects.Statement_Page;
import pageObjects.Trade_Page;

public class Statement_Action {
	
	public static void ValidateViewContract(WebDriver driver){
		ProfitTable_Page.btn_View(driver).click();
		Assert.assertTrue(Trade_Page.window_SellPopup(driver).isDisplayed());
	}
	public static void ValidateVirtualMoneyCredit(WebDriver driver){
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",Statement_Page.txt_VirtualMoney(driver));
		Assert.assertTrue(Statement_Page.txt_VirtualMoney(driver).getText().equals("Virtual money credit to account"));
	}
	public static void ValidateStatementEntry(WebDriver driver){
		List<WebElement> elements = driver.findElements(By.xpath("(.//button[contains(text(),'View')])"));
		System.out.println("Total number of rows in Statement: "+ elements.size());
		Assert.assertTrue(elements.size()>0);
 	}

}
