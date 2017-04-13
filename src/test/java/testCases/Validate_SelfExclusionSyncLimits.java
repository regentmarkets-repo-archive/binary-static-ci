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
import pageObjects.Limits;
import pageObjects.MainAccount_Menu;
import pageObjects.PersonalDetails_Page;
import pageObjects.Profile_Page;
import pageObjects.Security_Page;
import pageObjects.Self_Exclusion;
import utility.Constant;

public class Validate_SelfExclusionSyncLimits {
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
			if(Self_Exclusion.err_MaxAccBal(driver).isDisplayed()){
				System.out.println("[P]New amount are not allowed to exceed current amount.");;
			}
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
			Self_Exclusion.txt_MaxAccCashBal(driver).clear();
			Self_Exclusion.txt_MaxAccCashBal(driver).sendKeys(Integer.toString(getAccBal));
			//If the error message is shown
			Self_Exclusion.txt_ExcludeUntil(driver).submit();
			if(Self_Exclusion.msg_confirmMsg(driver).isDisplayed()){
				System.out.println("[P]");;
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
			if(Self_Exclusion.err_MaxOpenPos(driver).isDisplayed()){
				System.out.println("[P]New number are not allowed to exceed current number.");
			}
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
			Self_Exclusion.txt_MaxOpenPos(driver).clear();
			Self_Exclusion.txt_MaxOpenPos(driver).sendKeys(Integer.toString(getMaxPos));
			//If the error message is shown
			Self_Exclusion.txt_ExcludeUntil(driver).submit();
			if(Self_Exclusion.msg_confirmMsg(driver).isDisplayed()){
				System.out.println("[P]");
			}
		}
	}
	//Test Method to navigate to limits page
	@Test(priority=6)
	public void NavigateToLimitsPage() {
			MainAccount_Menu.link_MainAccount(driver).click();
			MainAccount_Menu.link_Security(driver).click();
			Security_Page.link_Limits(driver).click();
	}
	//Test Method to check whether the amount displayed correctly
	@Test(priority=7)
	public void Test_Limits_MaxAccountBalance() {
		Limits.select_MaxAccCashBal(driver).getText();
		Integer.toString(getAccBal);
				
		if(getAccBal>=300000){
			if(Limits.select_MaxAccCashBal(driver).getText().equals(Integer.toString(getAccBal))){
				System.out.println("Amount in Self-exclusion more than 300000, 300000 is shown");
			}
		}
		else{
			if(Limits.select_MaxAccCashBal(driver).getText().equals(Integer.toString(getAccBal))){
				System.out.println("Amount in limits is same with self exclusion");
			}
		}
	}
	//Test Method to check whether the number displayed correctly
	@Test(priority=8)
	public void Test_Limits_MaxOpenPosition() {
		Limits.select_MaxOpenPos(driver).getText();
		Integer.toString(getMaxPos);
				
		if(getMaxPos>=60){
			if(Limits.select_MaxOpenPos(driver).getText().equals(Integer.toString(getAccBal))){
				System.out.println("Positions in Self-exclusion more than 60, 60 is shown");
			}
		}
		else{
			if(Limits.select_MaxOpenPos(driver).getText().equals(Integer.toString(getAccBal))){
				System.out.println("Number in limits is same with self exclusion");
			}
		}
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
}
