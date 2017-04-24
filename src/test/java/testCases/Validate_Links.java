//TestCase to Login to the site and then Logout with valid user credentials
package testCases;


import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageObjects.Links_List;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.Constant;
import appModules.VerifyLinks_Action;
import appModules.Navigation_Action;

public class Validate_Links {
    
public WebDriver driver;
    //Test Method to start browser session
    @BeforeTest
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
  //Test Method to launch site and print page title
  @Test(priority=1)
  public void A_Launch(){
      Navigation_Action.Navigate_To_HomePage(driver,Constant.URL);
  }
//Test Method to verify footer links 
  @Test(priority=2)
  public void verify_FooterLinks() {
      VerifyLinks_Action.ListLinks(driver, Links_List.footerString(driver));
      System.out.println("Total Footer Links: " +  Links_List.footerString(driver).size());
  }
//Test Method to verify all links 
  @Test(priority=3)
  public void verify_allLinks() {
      VerifyLinks_Action.ListLinks(driver, Links_List.All_links(driver));
      System.out.println("Total All Links: " +  Links_List.All_links(driver).size());
  }
  //Test Method to close the browser session
  @AfterTest
  public void endSession() {
      driver.quit();  
  }
}
