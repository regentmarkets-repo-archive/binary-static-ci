package pageObjects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class Links_List {
   
    //Method to find all links  
    public static List<WebElement> All_links(WebDriver driver){
        List<WebElement> element= driver.findElements(By.tagName("a"));
        return element;
    }
}
