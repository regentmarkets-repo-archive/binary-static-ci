package appModules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.Footer_Menu;

public class FooterMenu_Action {
    //Method to check title page 

    public static void ExecuteCount(WebDriver driver){
        System.out.println("Total Footer Menu: " + Footer_Menu.footer(driver));
    }
    //Get the array of footer links
    public static void ListLinks(WebDriver driver ){
        String[] links = new String[Footer_Menu.footerString(driver).size()];
        for(int i=0;i<Footer_Menu.footerString(driver).size(); i++)
        {
            links[i] = Footer_Menu.footerString(driver).get(i).getAttribute("href");
            System.out.println("The " +Footer_Menu.footerString(driver).get(i).getText() +" is working");

        }
        // navigate to each Link on the webpage
        for(int i=0;i<Footer_Menu.footerString(driver).size();)
        {
            //Navigate to particular link
            driver.navigate().to(links[i]);
            //Check the page should be the same as clicked URL
            String j =driver.getCurrentUrl();
            Assert.assertEquals(j, links[i]);
            System.out.println("The " + j +" is working");
            //Back to previous page
            driver.navigate().back();
            i++;
        }


    }

}
