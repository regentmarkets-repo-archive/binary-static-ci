package appModules;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.*;
import org.testng.Assert;

import pageObjects.NewAccount_Page;
import pageObjects.UpgradeRealAccount_Page;

public class UpgradeRealAccount_Action {
	//method to upgrade real account
		public static void UpgradeAccount_Action(WebDriver driver,String title,String Fname,String lName,String accReason,String fAddress,String sAddress,String city,String state,String pCode,String phone,String sQuestion,String aSq)
		{
		   //select title
			UpgradeRealAccount_Page.dd_Title(driver).selectByValue(title);
			//input FirstName
			UpgradeRealAccount_Page.txt_FirstName(driver).sendKeys(Fname);
			//input familyName
			UpgradeRealAccount_Page.txt_FamilyName(driver).sendKeys(lName);
			//select Account reason
			UpgradeRealAccount_Page.Account_Reason(driver).selectByValue(accReason);
			//input DOB
			UpgradeRealAccount_Page.txt_DOB(driver).click();
			UpgradeRealAccount_Page.DateValue(driver).click();
			//input FirstLine Address
			UpgradeRealAccount_Page.txt_FirstLineAddress(driver).sendKeys(fAddress);
			//input SecondLine Address
			UpgradeRealAccount_Page.txt_SecondLineAddress(driver).sendKeys(sAddress);
			//input town/city
			UpgradeRealAccount_Page.txt_TownCity(driver).sendKeys(city);
			//select state/province
			UpgradeRealAccount_Page.dd_StateProvince(driver).selectByValue(state);
			//input postal code
			UpgradeRealAccount_Page.txt_PostCode(driver).sendKeys(pCode);
			//input telephone
			UpgradeRealAccount_Page.txt_Telephone(driver).sendKeys(phone);
			//select secret question
			UpgradeRealAccount_Page.dd_SecretQuestion(driver).selectByValue(sQuestion);
			//input secret question answer
			UpgradeRealAccount_Page.txt_AnsSecretQuestion(driver).sendKeys(aSq);
			//accept PEP
			UpgradeRealAccount_Page.chk_NotPEP(driver).click();
			//accept Terms and Condition
			UpgradeRealAccount_Page.chk_TnC(driver).click();
			//open account
			UpgradeRealAccount_Page.btn_OpenAccount(driver).click();
			//check client landed on trade
			Assert.assertEquals(NewAccount_Page.IsClientOnTrade(driver).getText(),"Trade");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
}
