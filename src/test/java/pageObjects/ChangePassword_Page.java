package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChangePassword_Page {
	
	private static WebElement element = null;
	//Method to find old password field
	public static WebElement txt_oldPassword(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='old_password']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//Method to find new password field
		public static WebElement txt_newPassword(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='new_password']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find repeat password field
		public static WebElement txt_repeatPassword(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='repeat_password']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find change password button
		public static WebElement btn_ChangePassword(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='frm_change_password']/fieldset/div[4]/div[2]/button")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Success message
		public static WebElement msg_Success(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='msg_success']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find error message for Current Password field
		public static WebElement msg_Error_CurrentPassword(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='frm_change_password']/fieldset/div[1]/div[2]/div")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find error message for New Password field
		public static WebElement msg_Error_NewPassword(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='frm_change_password']/fieldset/div[2]/div[2]/div[2]")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find error message for Repeat Password field
		public static WebElement msg_Error_RepeatPassword(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='frm_change_password']/fieldset/div[3]/div[2]/div")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find hint message for New Password field
		public static WebElement msg_Hint_NewPassword(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='frm_change_password']/fieldset/div[2]/div[2]/div[1]")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find error message for Incorrect Old Password
		public static WebElement msg_Error_OldPassword(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='form_error']")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		

}
