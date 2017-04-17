//TestCase to Login to the site and then Logout with valid user credentials
package testCases;


import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.Constant;
import appModules.FooterMenu_Action;
import appModules.Navigation_Action;

public class Validate_FooterMenu {
    
public WebDriver driver;
    //Test Method to start browser session
    @BeforeTest
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
  //Test Method to launch site and print page title
  @Test
  public void A_Launch(){
      Navigation_Action.Navigate_To_HomePage(driver,Constant.URL);
  }
  //Test Method to login to the site with valid credentials
  @Test
  public void checkFooter() {
      FooterMenu_Action.ExecuteCount(driver);

  } 
  @Test
  public void listAllLink() {
      FooterMenu_Action.ListLinks(driver);
  }
  
  //Test Method to close the browser session
  @AfterTest
  public void endSession() {
      driver.quit();  
  }
}
