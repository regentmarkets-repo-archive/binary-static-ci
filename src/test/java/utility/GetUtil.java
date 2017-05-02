package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// utility class to get parent element
public class GetUtil {
	public static WebElement getParent(WebElement child){
		return child.findElement(By.xpath("./.."));
	}
}
