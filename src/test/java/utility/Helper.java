package utility;
import java.sql.Timestamp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class Helper {
	private  WebElement element = null;
   //Method to get current timestamp in ticks
	public String Get_CurrentTicks()
	{
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return String.valueOf(timestamp.getTime());
        //System.out.println(timestamp.getTime().ToString());
	}
	//Method to get account verification token from Mailinator.com
	public String Get_VerificationToken(WebDriver driver,String userName)
	{
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Go to mailinator home page
		driver.get("https://www.mailinator.com/inbox2.jsp?public_to="+userName+"#/#public_maildirdiv");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Open_Mail(driver).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Get_TokenElement(driver);
	}
	//get mailnator email field
	private WebElement EmailField(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inboxfield")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//get mailinator go button
	private WebElement Go_Button(WebDriver driver)
	{
		WebElement result=null;
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("input-group-btn")));
		List<WebElement> allbutton = element.findElements(By.tagName("button"));
		for (WebElement we: allbutton) {       
	        if ( we.getText().contains( "Go!" ) ) result=we;break;
	    }
		return result;
	}
	//get mail subject element to open email
	private WebElement Open_Mail(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='height:100%;']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	// get token element
	private String Get_TokenElement(WebDriver driver)
	{
		//scroll down page to get token
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.switchTo().frame("publicshowmaildivcontent");
		//WebElement iframe = parent.findElement(By.id("publicshowmaildivcontent"));
		WebElement token = driver.findElement(By.xpath("//span[contains(@style,'background: #f2f2f2 ; padding: 10px ; line-height: 50px')]"));
		return token.getText();
	}
	
	
}
