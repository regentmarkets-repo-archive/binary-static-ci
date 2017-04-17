package testCases;

import java.util.concurrent.TimeUnit;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.Login_Action;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageObjects.Authentication;
import pageObjects.ChangePassword_Page;
import pageObjects.Limits;
import pageObjects.MainAccount_Menu;
import pageObjects.PersonalDetails_Page;
import pageObjects.Profile_Page;
import pageObjects.Security_Page;
import pageObjects.Self_Exclusion;
import utility.Constant;

public class Validate_Limits {
	public WebDriver driver;
	int getAccBal , getMaxPos;
	//Test Method to login into the site
	@Test(priority=0)
	public void Login() {
	  	Login_Action.Execute(driver,Constant.Email,Constant.Password);
	}
	//Test Method to navigate to self exclusion page
	@Test(priority=1)
	public void NavigateToPersonalDetailsPage() {
		  	MainAccount_Menu.link_MainAccount(driver).click();
			MainAccount_Menu.link_Security(driver).click();
			Security_Page.link_SelfExclusion(driver).click();
	}
	//Test Method to test error message when the new amount exceed the current amount
	@Test(priority=2)
	public void Test_Exceed_MaxAccountBalance() {
		//If there is no value added, skip this test		
		if(Self_Exclusion.txt_MaxAccCashBal(driver).getAttribute("value").equals("")){
			throw new SkipException("Skipping this exception");}
		else{
			//Increase the current value
			int temp;
			temp = Integer.parseInt(Self_Exclusion.txt_MaxAccCashBal(driver).getAttribute("value"));
			getAccBal = temp + 1;
			Self_Exclusion.txt_MaxAccCashBal(driver).clear();
			Self_Exclusion.txt_MaxAccCashBal(driver).sendKeys(Integer.toString(getAccBal));
			//If the error message is shown
			Assert.assertEquals(Self_Exclusion.err_MaxAccBal(driver).getText(),"Should be between 0 and "+ temp);
		}
	}
	//Test Method to test whether the update is saved when the new amount less than the current amount
	@Test(priority=3)
	public void Test_Lower_MaxAccountBalance() {
		//If there is no value added, skip this test		
		if(Self_Exclusion.txt_MaxAccCashBal(driver).getAttribute("value").equals("")){
			throw new SkipException("Skipping this exception");}
		else{
			//Decrease the current value
			int temp;
			temp = Integer.parseInt(Self_Exclusion.txt_MaxAccCashBal(driver).getAttribute("value"));
			getAccBal = temp - 2;
				if (getAccBal <= 0){
					getAccBal = 1;
					Self_Exclusion.txt_MaxAccCashBal(driver).clear();
					Self_Exclusion.txt_MaxAccCashBal(driver).sendKeys(Integer.toString(getAccBal));
					//If the error message is shown
					Self_Exclusion.txt_ExcludeUntil(driver).submit();
					Assert.assertEquals(Self_Exclusion.msg_confirmMsg(driver).getText(),"You did not change anything.");
				}else{
				Self_Exclusion.txt_MaxAccCashBal(driver).clear();
				Self_Exclusion.txt_MaxAccCashBal(driver).sendKeys(Integer.toString(getAccBal));
				//If the error message is shown
				Self_Exclusion.txt_ExcludeUntil(driver).submit();
				Assert.assertEquals(Self_Exclusion.msg_confirmMsg(driver).getText(),"Your changes have been updated.");
				}
			}
	}
	//Test Method to test error message when the new number exceed the current number
	@Test(priority=4)
	public void Test_Exceed_MaxOpenPos() {
		//If there is no value added, skip this test		
		if(Self_Exclusion.txt_MaxOpenPos(driver).getAttribute("value").equals("")){
			throw new SkipException("Skipping this exception");}
		else{
			//Increase the current value
			int temp;
			temp = Integer.parseInt(Self_Exclusion.txt_MaxOpenPos(driver).getAttribute("value"));
			getMaxPos = temp + 1;
			Self_Exclusion.txt_MaxOpenPos(driver).clear();
			Self_Exclusion.txt_MaxOpenPos(driver).sendKeys(Integer.toString(getMaxPos));
			//If the error message is shown
			Assert.assertEquals(Self_Exclusion.err_MaxOpenPos(driver).getText(),"Should be between 0 and "+ temp);
			}
		}
	//Test Method to test whether the update is saved when the new number less than the current number
	@Test(priority=5)
	public void Test_Lower_MaxOpenPos() {
		//If there is no value added, skip this test		
		if(Self_Exclusion.txt_MaxOpenPos(driver).getAttribute("value").equals("")){
			throw new SkipException("Skipping this exception");}
		else{
			//Decrease the current value
			int temp;
			temp = Integer.parseInt(Self_Exclusion.txt_MaxOpenPos(driver).getAttribute("value"));
			getMaxPos = temp - 2;
				if (getMaxPos <= 0){
					getMaxPos = 1;
					Self_Exclusion.txt_MaxOpenPos(driver).clear();
					Self_Exclusion.txt_MaxOpenPos(driver).sendKeys(Integer.toString(getMaxPos));
					//If the error message is shown
					Self_Exclusion.txt_ExcludeUntil(driver).submit();
					Assert.assertEquals(Self_Exclusion.msg_confirmMsg(driver).getText(),"You did not change anything.");
				}else{
				Self_Exclusion.txt_MaxOpenPos(driver).clear();
				Self_Exclusion.txt_MaxOpenPos(driver).sendKeys(Integer.toString(getMaxPos));
				//If the error message is shown
				Self_Exclusion.txt_ExcludeUntil(driver).submit();
				Assert.assertEquals(Self_Exclusion.msg_confirmMsg(driver).getText(),"Your changes have been updated.");
			}
		}
	}
	//Test Method to navigate to limits page
	@Test(priority=6)
	public void NavigateToLimitsPage() {
		boolean authCheck;
		driver.get("https://staging.binary.com/en/user/authenticate.html");
		if(Authentication.txt_AuthedMsg(driver).isDisplayed()){
			authCheck = true;
		}else if(Authentication.txt_nonAuthedMsg(driver).isDisplayed()){
			authCheck = false;
		}
		
		MainAccount_Menu.link_MainAccount(driver).click();
		MainAccount_Menu.link_Security(driver).click();
		Security_Page.link_Limits(driver).click();
	}
	//Test Method to check whether the amount displayed correctly
	@Test(priority=7)
	public void Test_Limits_MaxAccountBalance() {	
		String tempGAB = intTostr(getAccBal);
		
		if(getAccBal>=300000){
			String tempNum = intTostr(300000);
			tempGAB = tempNum;
			if(Limits.select_MaxAccCashBal(driver).getText().equals(tempGAB)){
				System.out.println("Amount in Self-exclusion more than 300000, 300000 is shown");
			}
		}
		else{
			if(Limits.select_MaxAccCashBal(driver).getText().equals(tempGAB)){
				System.out.println("Amount in limits is same with self exclusion");
			}
		}
	}
	//Test Method to check whether the number displayed correctly
	@Test(priority=8)
	public void Test_Limits_MaxOpenPosition() {
		
		if(getMaxPos>=60){
			getMaxPos = 60;
			if(Limits.select_MaxOpenPos(driver).getText().equals(Integer.toString(getMaxPos))){
				System.out.println("Positions in Self-exclusion more than 60, 60 is shown");
			}
		}
		else{
			if(Limits.select_MaxOpenPos(driver).getText().equals(Integer.toString(getMaxPos))){
				System.out.println("Number in limits is same with self exclusion");
			}
		}
	}
	//Test Method to check whether the limits message displayed correctly
	@Test(priority=9)
	public void Test_Limits_Message() {
		MainAccount_Menu.link_MainAccount(driver).click();
		/*if((MainAccount_Menu.link_ActiveAccount(driver).getText().contains("mlt"))||(MainAccount_Menu.link_ActiveAccount(driver).getText().contains("mf"))||(MainAccount_Menu.link_ActiveAccount(driver).getText().contains("mx"))){
			if(!Limits.select_AuthMsg(driver).isDisplayed()){
				Assert.assertEquals(Limits.select_LimitMsg_1(driver).getText(),"Your account is fully authenticated and your withdrawal limits have been lifted.");
				
			}else{
				Assert.assertEquals(Limits.select_LimitMsg_1(driver).getText(),"Your withdrawal limit is EUR 2,300 (or equivalent in other currency).");
			}
		}else{
			if(!Limits.select_AuthMsg(driver).isDisplayed()){
				Assert.assertEquals(Limits.select_LimitMsg_1(driver).getText(),"Your account is fully authenticated and your withdrawal limits have been lifted.");
			}else{
				Assert.assertEquals(Limits.select_LimitMsg_1(driver).getText(),"Your withdrawal limit is USD 10,000.");
				
			}
		}*/
//		Assert.assertEquals(Limits.select_LimitMsg_1(driver).getText(),"Your withdrawal limit is USD 10,000.");
		//*[@id="msg_notification"]
		System.out.println(MainAccount_Menu.link_ActiveAccount(driver).getText());
	} 
	//Test Method to start browser session and launch site
	@BeforeTest
	public void launchApplication() {
	 	ChromeDriverManager.getInstance().setup();
	   	driver = new ChromeDriver();
	   	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Constant.URL);
	}
	//Test Method to close browser session
	@AfterTest
	public void endSession() {
		driver.quit();
	}
	// function to convert integer to string with comma
	public String intTostr(int a) {
		int temp1 = Integer.parseInt(Integer.toString(a).substring(0, 3));
		int temp2 = Integer.parseInt(Integer.toString(a).substring(3, 6));
		String tempStr = (temp1+","+temp2);
		return tempStr;
	}
}
