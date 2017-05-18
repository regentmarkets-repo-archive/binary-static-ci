package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;

import pageObjects.Authentication;
import pageObjects.Limits;
import pageObjects.MainAccount_Menu;
import pageObjects.Self_Exclusion;

public class Limits_Action {
	static int getAccBal , getMaxPos;
	static boolean authCheck;

	public static void checkExMaxAccBal(WebDriver driver){
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
	
	public static int checkLowMaxAccBal(WebDriver driver){
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
		
		return getAccBal;
	}
	
	public static void checkExMaxOpPo(WebDriver driver){
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
	
	public static int checkLowMaxOpPo(WebDriver driver){
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
		
		return getMaxPos;
	}
	
	public static void checkAuth(WebDriver driver){
		if(Authentication.txt_nonAuthedMsg(driver).isDisplayed()){
			authCheck = false;
		}else if(Authentication.txt_AuthedMsg(driver).isDisplayed()){
			authCheck = true;
		}
	}
	
	public static void limit_accbal(WebDriver driver , int temp){
		String tempGAB = intTostr(temp);
		
		if(temp>=300000){
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
	
	public static void limit_openpo(WebDriver driver, int temp){
		if(temp>=60){
			temp = 60;
			if(Limits.select_MaxOpenPos(driver).getText().equals(Integer.toString(temp))){
				System.out.println("Positions in Self-exclusion more than 60, 60 is shown");
			}
		}
		else{
			if(Limits.select_MaxOpenPos(driver).getText().equals(Integer.toString(temp))){
				System.out.println("Number in limits is same with self exclusion");
			}
		}
	}
	
	public static void test_msg(WebDriver driver){
		MainAccount_Menu.link_MainAccount(driver).click();
		if((MainAccount_Menu.link_ActiveAccount(driver).getText().contains("mlt"))||(MainAccount_Menu.link_ActiveAccount(driver).getText().contains("mf"))||(MainAccount_Menu.link_ActiveAccount(driver).getText().contains("mx"))){
			if(authCheck){
				Assert.assertEquals(Limits.select_LimitMsg_1(driver).getText(),"Your account is fully authenticated and your withdrawal limits have been lifted.");
				
			}else if(!authCheck){
				Assert.assertEquals(Limits.select_LimitMsg_1(driver).getText(),"Your withdrawal limit is EUR 2,300 (or equivalent in other currency).");
			}
		}else{
			if(authCheck){
				Assert.assertEquals(Limits.select_LimitMsg_1(driver).getText(),"Your account is fully authenticated and your withdrawal limits have been lifted.");
			}else if(!authCheck){
				Assert.assertEquals(Limits.select_LimitMsg_1(driver).getText(),"Your withdrawal limit is USD 10,000.00.");
				
			}
		}
	}
	
	// function to convert integer to string with comma
	private static String intTostr(int a) {
		int temp1 = Integer.parseInt(Integer.toString(a).substring(0, 3));
		int temp2 = Integer.parseInt(Integer.toString(a).substring(3, 6));
		String tempStr = (temp1+","+temp2);
		return tempStr;
	}
}
