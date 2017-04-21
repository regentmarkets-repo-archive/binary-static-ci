package appModules;

import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.Footer_Menu;

public class FooterMenu_Action {
    //Method to check title page 

    public static void ExecuteCount(WebDriver driver){
        System.out.println("Total Footer Menu: " + Footer_Menu.footer(driver));
    }
    //Method to get all links list
    public static void ListLinks(WebDriver driver ){
        for(int i=0;i<Footer_Menu.footerString(driver).size();i++)
        {

            WebElement ele= Footer_Menu.footerString(driver).get(i);

            String url=ele.getAttribute("href");

            verifyLinkActive(url); 
        }   
    }
    //Method to verify the links is broken or not
    public static void verifyLinkActive(String linkUrl)
    {
        try 
        {
            URL url = new URL(linkUrl);

            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();

            httpURLConnect.setConnectTimeout(3000);

            httpURLConnect.connect();

            if(httpURLConnect.getResponseCode()==200)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {

        }
    } 
}