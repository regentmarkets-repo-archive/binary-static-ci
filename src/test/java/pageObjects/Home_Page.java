package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utility.CommonFunctions;

public class Home_Page {

    private static WebElement element = null;
    //Method to find login button on the home page
    public static WebElement btn_Login(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.id("btn_login"));
		return element;
    }
    public static WebElement platformLink(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='main-navigation-trading']/a"));
		return element;
    }
    public static WebElement tradeNowLink(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='trading-platforms']/div[1]/div[1]/div[2]/p[2]"));
		return element;
    }
    public static WebElement acceptRealityCheck(WebDriver driver){
		element = CommonFunctions.FindElementWithExplicitWait(driver, By.xpath("//*[@id='reality_check_nav']/button"));
		return element;

	}
	//method to go find logo 
		public static WebElement logo(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,60);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("logo")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find Email text box on home page
		public static WebElement txt_Email(WebDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver,60);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find create free account button on home page
		public static WebElement btn_CreateFreeAccount(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,60);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_verify_email")));
			Assert.assertTrue(element.isDisplayed());
			return element;
		}
		//Method to find upgrade to a real account link on home page
			public static WebElement link_UpgradeToRealAccount(WebDriver driver){
				WebDriverWait wait = new WebDriverWait(driver,60);
				element = wait.until(ExpectedConditions.elementToBeClickable(By.id("topbar-msg")));
				Assert.assertTrue(element.isDisplayed());
				WebElement link = element.findElement(By.linkText("Upgrade to a Real Account"));
				return link;
			}

    }


