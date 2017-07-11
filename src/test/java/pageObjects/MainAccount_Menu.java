package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;
	
public class MainAccount_Menu {
		private static WebElement element = null;
		//Method to find profile link
		public static WebElement link_Profile(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='all-accounts']/li/ul/a[1]"));
			return element;
		}
		//Method to find security link
		public static WebElement link_Security(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='all-accounts']/li/ul/a[2]"));
			return element;
		}
		//Method to find active account
		public static WebElement link_ActiveAccount(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='all-accounts']/li/a/div[1]/div[2]"));
			return element;
		}
		//Method to find logout link
		public static WebElement link_Logout(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='btn_logout']"));
			return element;
		}
		//Method to find Main Account link
		public static WebElement link_MainAccount(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='main-account']/li/a/div[2]"));
			return element;
		}
		//Method to find scroll up button
		public static WebElement btn_ScrollUp(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='scrollup']"));
			return element;
		}
	      //Method try check authentication message 
        public static WebElement auth_msg(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='msg_notification']"));
			return element;
        }
	      //Method try check virtual account message 
        public static WebElement link_VirtualAccount(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='all-accounts']/li/ul/div[2]/div/a"));
			return element;
        }
        public static WebElement link_MLTAccount(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='all-accounts']/li/ul/div[2]/div/a[1]/li"));
			return element;
        }
}
