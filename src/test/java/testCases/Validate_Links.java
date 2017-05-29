package testCases;

import org.testng.annotations.Test;
import pageObjects.Links_List;
import appModules.VerifyLinks_Action;

public class Validate_Links extends BaseClass{

  @Test(description="Test Method to verify all links")
  public void verify_allLinks() {
      VerifyLinks_Action.ListLinks(driver, Links_List.All_links(driver));
      System.out.println("Total All Links: " +  Links_List.All_links(driver).size());
  }

}
