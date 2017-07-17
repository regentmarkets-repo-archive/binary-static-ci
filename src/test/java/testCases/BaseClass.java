package testCases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.Constant;
import utility.WebEventListener;

public class BaseClass {
	
	WebDriver driver;
	public EventFiringWebDriver e_driver;
	public WebEventListener eventListener;
	 
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
    	e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		e_driver.manage().window().maximize();
		e_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		e_driver.get(Constant.URL);
    	}
	
	  @AfterClass
	  public void closeApplication() {
		  e_driver.quit();
	  }
}
