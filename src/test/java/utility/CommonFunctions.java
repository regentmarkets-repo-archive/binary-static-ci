package utility;

import org.openqa.selenium.WebDriver;

public class CommonFunctions {	
	public static void endSession(WebDriver driver) {
		driver.quit();
	}
}
