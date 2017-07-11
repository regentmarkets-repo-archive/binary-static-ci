package utility;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class CommonFunctions {	
 
	  public static void ExtractJSLogs(WebDriver driver) {
		
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
	        for (LogEntry entry : logEntries) {
	        	if(entry.getLevel().toString()=="SEVERE"){
	        	System.out.println(driver.getCurrentUrl());
	            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
	        }
	     }
	}
}

