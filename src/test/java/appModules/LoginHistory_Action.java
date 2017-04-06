package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Login_History;

public class LoginHistory_Action {
    //Method to check title page 
    public static void Execute(WebDriver driver) {
        String j= Login_History.title_page(driver).getText();
        System.out.println("Result : "+ j);
        Assert.assertEquals("Login History",j); 
    }
    //Method to validated new entries
    public static void ExecuteCheckLatest(WebDriver driver){
        String a =Login_History.first_row(driver).getText();
        String b =Login_History.second_row(driver).getText();
        Assert.assertEquals("Successful", a);
        Assert.assertEquals("Failed", b);
    }
    //Method to count the total records displayed
    public static void ExecuteCount(WebDriver driver){
        System.out.println("Total Rows Count : " + Login_History.count_rows(driver));
    }
}