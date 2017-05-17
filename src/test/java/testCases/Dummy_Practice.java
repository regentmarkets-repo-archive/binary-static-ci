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
	public WebDriver webdriver;
	Helper helperutility;
	List<WebElement> tempEmailSubj = new ArrayList<WebElement>();//to store email subjects
	List<String> AllMailSubjactes = new ArrayList<String>();//to store all emails and then fetch last verify email msg# and go via command
	List<String> texts = new ArrayList<String>();
	//Test Method to start browser session
		//@BeforeTest
	    public void setUp() {
	    	ChromeDriverManager.getInstance().setup();
	    	webdriver = new ChromeDriver(); 
	    	webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	webdriver.manage().window().maximize();
	    	Navigation_Action.Navigate_To_HomePage(webdriver,"https://dev.binaryqa12.com");
	    	//helperutility = new Helper();//get current ticks
	    	}
		//@Test(priority=0)
		public void SetServer()
		{
			//Endpoint_Action.SetServer(driver,"www.binaryqa12.com","1003");
		}
	//@Test
	 public String DummyTestCookie()
	 {
		ChromeDriverManager.getInstance().setup();
		webdriver = new ChromeDriver(); 
		webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
    	Navigation_Action.Navigate_To_HomePage(webdriver,"https://dev.binaryqa12.com");
    	
		String token = "";
		 Cookie byPass = new Cookie.Builder("duo_bypass", "9747e0d241c08c196950273ca27746888e595ff3e41146d3bb2bd58216815dfd")
				    .domain("dev.binaryqa12.com")
				    .path("/")
				    .build();
		 webdriver.manage().addCookie(byPass);
		//Cookie cfduid = new Cookie.Builder("_cfduid", "dbf3fb7709db0d2ab6cec0315fdbdeefa1494221395")
			  //  .domain(".binaryqa12.com")
			   // .path("/")
			    //.build();
			//driver.manage().addCookie(cfduid);
		 webdriver.get("https://dev.binaryqa12.com");
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
		        char[] charArray = StringExtractor(binaryMails.get(binaryMails.size()-1));
		        //keys to to go to mail content
		        	//robot.keyPress(KeyEvent.VK_ALT);
	        		//robot.delay(10);
	        		//DigitKey(charArray[0]);
			        //robot.keyRelease(KeyEvent.VK_DOWN);
		            for(int i=0;i<charArray.length;i++)
		            {
		            	DigitKey(charArray[i]);
		            }
		            try {
						Thread.sleep(3000);
						robot.keyPress(KeyEvent.VK_ENTER);
		        		robot.delay(10);
				        robot.keyRelease(KeyEvent.VK_ENTER);
				        Thread.sleep(2000);
				        robot.keyPress(KeyEvent.VK_ENTER);
		        		robot.delay(10);
				        robot.keyRelease(KeyEvent.VK_ENTER);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            try {
						Thread.sleep(4000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        System.out.println("finding mail contents");
					WebDriverWait wait = new WebDriverWait(webdriver, 30);
			        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.aceterm-line-bg")));
			        List<WebElement> mailContents = new ArrayList<WebElement>();
			        mailContents = webdriver.findElements(By.cssSelector("span.aceterm-line-bg"));
			        System.out.println("found mail content span");
			        System.out.println("loading texts list");
			        for (int j=0; j <mailContents.size(); j++){
			        	
			        	 try {
								Thread.sleep(3000);
								WebDriverWait wait2 = new WebDriverWait(webdriver, 30);
								wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.aceterm-line-bg")));
								
								if(mailContents.get(j).getText().contains("Enter the following verification token into the form to create an account:"))
								{
									//System.out.println("Finally the token is here:"+mailContents.get(j+2).getText().trim());
									token = mailContents.get(j+2).getText().trim();
									break;
								}
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			        }
		        
		 			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    webdriver.quit();
			return token;    
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
		WebDriverWait wait = new WebDriverWait(webdriver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.aceterm-line-bg")));
        tempEmailSubj = new ArrayList<WebElement>();
        tempEmailSubj = webdriver.findElements(By.cssSelector("span.aceterm-line-bg"));
        System.out.println("found mail span");
        System.out.println("loading texts list");
        for (int i=0; i <tempEmailSubj.size(); i++){
        	
        	 try {
					Thread.sleep(10);
					WebDriverWait wait2 = new WebDriverWait(webdriver, 30);
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

	private char[] StringExtractor(String input)
	{
		//String input = " 697     May 15 Binary.com      ( 665) Verify your email address - Binaryqa12.com";
		String trimied = input.trim();
		input = input.trim().substring(0,trimied.indexOf(' '));
		System.out.println("My extracted output is:"+input);
		char[] charArray = new char[input.length()];
	    for(int i = 0; i < input.length(); i++)
	    {
	    	charArray[i] = input.charAt(i);
	    }
	    //System.out.println("My 1st value is:"+arr[0]);
	    //System.out.println("My 2nd value is:"+arr[1]);
	    //System.out.println("My 3rd value is:"+arr[2]);
		return charArray;
	}
	private void DigitKey(char digit)
	{
		Robot robot;
		try {
			robot = new Robot();
			switch(digit) {
	        case '0' :
	        	robot.keyPress(KeyEvent.VK_0);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_0);
	           break;
	        case '1' :
	        	robot.keyPress(KeyEvent.VK_1);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_1);
	           break;
	        case '2' :
	        	robot.keyPress(KeyEvent.VK_2);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_2);
	           break;
	        case '3' :
	        	robot.keyPress(KeyEvent.VK_3);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_3);
	           break;
	        case '4' :
	        	robot.keyPress(KeyEvent.VK_4);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_4);
		        break;
	        case '5' :
	        	robot.keyPress(KeyEvent.VK_5);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_5);
		        break;
	        case '6' :
	        	robot.keyPress(KeyEvent.VK_6);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_6);
	           break;
	        case '7' :
	        	robot.keyPress(KeyEvent.VK_7);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_7);
		        break;
	        case '8' :
	        	robot.keyPress(KeyEvent.VK_8);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_8);
		        break;
	        case '9' :
	        	robot.keyPress(KeyEvent.VK_9);
	    		robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_9);
		        break;
	        default :
	           System.out.println("Invalid Key");
	     }
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
