package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.Endpoint_Action;
import appModules.Navigation_Action;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import utility.Constant;
import utility.Helper;

public class Dummy_Practice {
	public WebDriver driver;
	Helper helperutility;
	List<WebElement> tempEmailSubj = new ArrayList<WebElement>();//to store email subjects
	List<String> AllMailSubjactes = new ArrayList<String>();//to store all emails and then fetch last verify email msg# and go via command
	List<String> texts = new ArrayList<String>();
	//Test Method to start browser session
		@BeforeTest
	    public void setUp() {
	    	ChromeDriverManager.getInstance().setup();
	    	driver = new ChromeDriver(); 
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.manage().window().maximize();
	    	Navigation_Action.Navigate_To_HomePage(driver,"https://dev.binaryqa12.com");
	    	//helperutility = new Helper();//get current ticks
	    	}
		@Test(priority=0)
		public void SetServer()
		{
			//Endpoint_Action.SetServer(driver,"www.binaryqa12.com","1003");
		}
	@Test
	 public void DummyTestCookie()
	 {
		 Cookie byPass = new Cookie.Builder("duo_bypass", "550b19dd8919f792976bcc5d85853d04493a05e7757bc4ff0da745926cab40a6")
				    .domain("dev.binaryqa12.com")
				    .path("/")
				    .build();
				driver.manage().addCookie(byPass);
		//Cookie cfduid = new Cookie.Builder("_cfduid", "dbf3fb7709db0d2ab6cec0315fdbdeefa1494221395")
			  //  .domain(".binaryqa12.com")
			   // .path("/")
			    //.build();
			//driver.manage().addCookie(cfduid);
				driver.get("https://dev.binaryqa12.com");
				//System.out.println("This is cookie "+cfduid.toString());
		    try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_ALT);
		        try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_ALT);
		        robot.keyRelease(KeyEvent.VK_T);
		        try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        robot.keyPress(KeyEvent.VK_M);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_M);
		        robot.keyPress(KeyEvent.VK_U);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_U);
		        robot.keyPress(KeyEvent.VK_T);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_T);
		        robot.keyPress(KeyEvent.VK_T);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_T);
		        robot.keyPress(KeyEvent.VK_SPACE);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_SPACE);
		        robot.keyPress(KeyEvent.VK_MINUS);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_MINUS);
		        robot.keyPress(KeyEvent.VK_F);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_F);
		        robot.keyPress(KeyEvent.VK_SLASH);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_SLASH);
		        robot.keyPress(KeyEvent.VK_T);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_T);
		        robot.keyPress(KeyEvent.VK_M);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_M);
		        robot.keyPress(KeyEvent.VK_P);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_P);
		        robot.keyPress(KeyEvent.VK_SLASH);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_SLASH);
		        robot.keyPress(KeyEvent.VK_D);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_D);
		        robot.keyPress(KeyEvent.VK_E);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_E);
		        robot.keyPress(KeyEvent.VK_F);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_F);
		        robot.keyPress(KeyEvent.VK_A);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_A);
		        robot.keyPress(KeyEvent.VK_U);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_U);
		        robot.keyPress(KeyEvent.VK_L);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_L);
		        robot.keyPress(KeyEvent.VK_T);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_T);
		        robot.keyPress(KeyEvent.VK_DECIMAL);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_DECIMAL);
		        robot.keyPress(KeyEvent.VK_M);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_M);
		        robot.keyPress(KeyEvent.VK_A);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_A);
		        robot.keyPress(KeyEvent.VK_I);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_I);
		        robot.keyPress(KeyEvent.VK_L);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_L);
		        robot.keyPress(KeyEvent.VK_B);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_B);
		        robot.keyPress(KeyEvent.VK_O);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_O);
		        robot.keyPress(KeyEvent.VK_X);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_X);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_ENTER);
		        //loop to go end of mailbox
		        String lastText = "";
		        
		        do {
		        	LoadALLMails();//method to get all emails subjects displayed on terminal
		        	System.out.println("Called once Load Mail");
		            lastText = texts.get(texts.size()-2).toString();
		        	System.out.println("got test in string");
		        	lastText = lastText.substring(lastText.lastIndexOf('(')+1,lastText.lastIndexOf('(')+4);
		        	System.out.println("got substring"+lastText);
		        	if(!lastText.equals("end"))
		        	{
		        		System.out.println("if condition");
		        		int size = texts.size();
		        	for(int i=0;i<=size;i++)//loop to page down n times
		        	{
		        		System.out.println("down key loop");
		        		robot.keyPress(KeyEvent.VK_DOWN);
		        		robot.delay(100);
				        robot.keyRelease(KeyEvent.VK_DOWN);
		        	}
		        	}
		       } while (!lastText.equals("end"));
		        //get all verification email from mailbox
		        String searchString = "Verify your email address - Binaryqa12.com";
		        List<String> binaryMails = new ArrayList<String>();
		        for (String curVal : AllMailSubjactes){
		          if (curVal.contains(searchString)){
		        	  binaryMails.add(curVal);
		          }
		        }
		        //loop through verification emails
		        for (String curVal : binaryMails){
			         System.out.println(curVal);
			       }
		        //get last mail of verification and extract mail number from it
		        String lastMailtext = binaryMails.get(binaryMails.size()-1);
		        lastMailtext = lastMailtext.trim().substring(0,lastMailtext.indexOf(' '));
		        System.out.println("email number"+lastMailtext.trim());
		        
		        
		        
		        
		        /*LoadALLMails();//method to get all emails subjects displayed on terminal
		        boolean status = false;
		        for(int i=0;i<texts.size();i++)
		        {
		        	String mailSubj = texts.get(i);
		        	System.out.println("Email subject is"+mailSubj);
		        	mailSubj = mailSubj.substring(mailSubj.lastIndexOf(')')+1);
		        	System.out.println("Email trimmed subject is"+mailSubj.trim());
		        	if(mailSubj.trim().equals("Verify your email address - Binaryqa12.com"))
		        	{
		        		robot.keyPress(KeyEvent.VK_ENTER);
				        robot.delay(10);
				        robot.keyRelease(KeyEvent.VK_ENTER);
				        try {
							Thread.sleep(4000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				        System.out.println("finding mail contents");
						WebDriverWait wait = new WebDriverWait(driver, 30);
				        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.aceterm-line-bg")));
				        List<WebElement> mailContents = new ArrayList<WebElement>();
				        mailContents = driver.findElements(By.cssSelector("span.aceterm-line-bg"));
				        System.out.println("found mail content span");
				        System.out.println("loading texts list");
				        List<String> data = new ArrayList<String>();
				        for (int j=0; j <mailContents.size(); j++){
				        	
				        	 try {
									Thread.sleep(4000);
									WebDriverWait wait2 = new WebDriverWait(driver, 30);
									wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.aceterm-line-bg")));
									//System.out.println("Line#"+i+" is:"+tempEmailSubj.get(i).getText());
									data.add(mailContents.get(j).getText());
									if(mailContents.get(j).getText().contains("Enter the following verification token into the form to create an account:"))
									{
										System.out.println("Finally the token is here"+mailContents.get(j+1).getText());
										status = true;
										break;
									}
									
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
				        }
				        if(status){break;}
				        System.out.println("down key loop");
		        		robot.keyPress(KeyEvent.VK_DOWN);
		        		robot.delay(100);
				        robot.keyRelease(KeyEvent.VK_DOWN);
				        System.out.println("Loaded list of mails");
		        	}
		        	
		        }
		        System.out.println("Done");//last email of mailbox
*/			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    
	 }
	private void LoadALLMails()
	{
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		texts = new ArrayList<String>();
		System.out.println("finding mail span");
		WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.aceterm-line-bg")));
        tempEmailSubj = new ArrayList<WebElement>();
        tempEmailSubj = driver.findElements(By.cssSelector("span.aceterm-line-bg"));
        System.out.println("found mail span");
        System.out.println("loading texts list");
        for (int i=0; i <tempEmailSubj.size(); i++){
        	
        	 try {
					Thread.sleep(10);
					WebDriverWait wait2 = new WebDriverWait(driver, 30);
					wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.aceterm-line-bg")));
					//System.out.println("Line#"+i+" is:"+tempEmailSubj.get(i).getText());
					texts.add(tempEmailSubj.get(i).getText());
					AllMailSubjactes.add(tempEmailSubj.get(i).getText());
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }
        System.out.println("Loaded list of mails");
	}
}
