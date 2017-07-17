package testCases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utility.Constant;

public class BaseClass {
	
	WebDriver driver;
	 
	@BeforeClass
    public void setupApplication() {
    	ChromeDriverManager.getInstance().setup();
    	Map<String, Object> prefs = new HashMap<String, Object>();
    	prefs.put("profile.default_content_setting_values.notifications", 2);
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
    	ChromeOptions options = new ChromeOptions();
    	options.setExperimentalOption("prefs", prefs);
    	driver = new ChromeDriver(options);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get(Constant.URL);
    	}
	
	  @AfterClass
	  public void closeApplication() {
		  driver.quit();
	  }
}
