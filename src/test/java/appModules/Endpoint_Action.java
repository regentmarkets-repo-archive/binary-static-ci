package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Endpoint_Page;
import pageObjects.Home_Page;

public class Endpoint_Action {
	//method to set server with end point
	public static void SetServer(WebDriver driver, String server,String appId)
	{
		//clear the text field for server
		Endpoint_Page.txt_Server(driver).clear();
		//Enter the value in server text field
		Endpoint_Page.txt_Server(driver).sendKeys(server);
		//clear the text field for server
		Endpoint_Page.txt_AppID(driver).clear();
		//Enter the value in server text field
		Endpoint_Page.txt_AppID(driver).sendKeys(appId);
		//Click on CreateFreeAccount button
		Endpoint_Page.btn_Submit(driver).click();
		//Go to Home page
		Home_Page.logo(driver).click();
	}
}
