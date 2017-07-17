package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.CommonFunctions;

public class ChangePassword_Page {
	
	private static WebElement element = null;
	//Method to find old password field
	public static WebElement txt_oldPassword(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='old_password']"));
		return element;
	}
	//Method to find new password field
		public static WebElement txt_newPassword(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='new_password']"));
			return element;
		}
		//Method to find repeat password field
		public static WebElement txt_repeatPassword(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='repeat_password']"));
			return element;
		}
		//Method to find change password button
		public static WebElement btn_ChangePassword(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='btn_submit']"));
			return element;
		}
		//Method to find Success message
		public static WebElement msg_Success(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='msg_success']"));
			return element;
		}
		//Method to find error message for Current Password field
		public static WebElement msg_Error_CurrentPassword(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_change_password']/fieldset/div[1]/div[2]/div"));
			return element;
		}
		//Method to find error message for New Password field
		public static WebElement msg_Error_NewPassword(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_change_password']/fieldset/div[2]/div[2]/div[2]"));
			return element;
		}
		//Method to find error message for Repeat Password field
		public static WebElement msg_Error_RepeatPassword(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_change_password']/fieldset/div[3]/div[2]/div"));
			return element;
		}
		//Method to find hint message for New Password field
		public static WebElement msg_Hint_NewPassword(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='frm_change_password']/fieldset/div[2]/div[2]/div[1]"));
			return element;
		}
		//Method to find error message for Incorrect Old Password
		public static WebElement msg_Error_OldPassword(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='form_error']"));
			return element;
		}
		//Method to find page title
		public static WebElement PageTitle(WebDriver driver){
			element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath(".//*[@id='content']/div[2]/h1"));
			return element;
		}
		
		

}
