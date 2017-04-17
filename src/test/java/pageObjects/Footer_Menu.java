package pageObjects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class Footer_Menu {
   
    //Method to find cashier page title   
    public static int footer(WebDriver driver){
        int element= driver.findElements(By.xpath("//*[@id='footer-menu']/div/div/div[*]/div/div[*]/ul/li[*]/a")).size();
        return element;
    }
    public static List<WebElement> footerString(WebDriver driver){
        List<WebElement> element= driver.findElements(By.xpath("//*[@id='footer-menu']/div/div/div[*]/div/div[*]/ul/li[*]/a"));
        return element;
    }
}
