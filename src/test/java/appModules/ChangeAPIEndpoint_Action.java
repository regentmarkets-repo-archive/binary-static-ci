package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.ChangeAPIEndpoint_Page;

public class ChangeAPIEndpoint_Action {
	
	//Method to perform change API Endpoint
	public static void Execute(WebDriver driver,String AppId,String Server) {
		
		ChangeAPIEndpoint_Page.txt_Server(driver).clear();
		ChangeAPIEndpoint_Page.txt_Server(driver).sendKeys(Server);
		ChangeAPIEndpoint_Page.txt_AppId(driver).clear();
		ChangeAPIEndpoint_Page.txt_AppId(driver).sendKeys(AppId);
		ChangeAPIEndpoint_Page.btn_Submit(driver).click();
			
	}

}
