package appModules;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class VerifyLinks_Action {
    //Method to check title page 

    //Method to get all links list
    public static void ListLinks(WebDriver driver ,List<WebElement> verifylink){
        List<WebElement> links=verifylink;
        for(int i=0;i<links.size();)
        {
            WebElement ele= links.get(i);
            String url=ele.getAttribute("href");
            verifyLinkActive(url); 
            i++;
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
