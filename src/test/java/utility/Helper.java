package utility;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import appModules.Navigation_Action;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Helper {
	private  WebElement element = null;
	public WebDriver webdriver;
	List<WebElement> tempEmailSubj = new ArrayList<WebElement>();//to store email subjects
	List<String> AllMailSubjactes = new ArrayList<String>();//to store all emails and then fetch last verify email msg# and go via command
	List<String> texts = new ArrayList<String>();
   //Method to get current timestamp in ticks
	public String Get_CurrentTicks()
	{
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return String.valueOf(timestamp.getTime());
        //System.out.println(timestamp.getTime().ToString());
	}
	//Method to get account verification token from Mailinator.com
	public String Get_VerificationToken(WebDriver driver,String userName)
	{
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Go to mailinator home page
		driver.get("https://www.mailinator.com/inbox2.jsp?to="+userName+"#/#public_maildirdiv");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Open_Mail(driver).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Get_TokenElement(driver);
	}
	//get mailnator email field
	private WebElement EmailField(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inboxfield")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	//get mailinator go button
	private WebElement Go_Button(WebDriver driver)
	{
		WebElement result=null;
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("input-group-btn")));
		List<WebElement> allbutton = element.findElements(By.tagName("button"));
		for (WebElement we: allbutton) {       
	        if ( we.getText().contains( "Go!" ) ) result=we;break;
	    }
		return result;
	}
	//get mail subject element to open email
	private WebElement Open_Mail(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='height:100%;']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	// get token element
	private String Get_TokenElement(WebDriver driver)
	{
		//scroll down page to get token
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.switchTo().frame("publicshowmaildivcontent");
		//WebElement iframe = parent.findElement(By.id("publicshowmaildivcontent"));
		WebElement token = driver.findElement(By.xpath("//span[contains(@style,'background: #f2f2f2 ; padding: 10px ; line-height: 50px')]"));
		return token.getText();
	}
	//Add cookie of qaserver authenticate(server whihc have to be logged-in in new tab along with staging)
	public void AddCookieOfQaServer(WebDriver driver)
	{
		driver.get("https://"+Constant.targetserver+"/");
		Cookie byPass = new Cookie.Builder("duo_bypass", Constant.qaserver_duoBypass)
			    .domain(Constant.targetserver)
			    .path("/")
			    .build();
		driver.manage().addCookie(byPass);
		driver.get("https://"+Constant.targetserver+"/");
	}
	private void LoginDev(WebDriver driver)
	{
		//ChromeDriverManager.getInstance().setup();
		//webdriver = new ChromeDriver(); 
		webdriver = driver;
		webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
   	    Navigation_Action.Navigate_To_HomePage(webdriver,"https://"+Constant.devQaServer);
   	
		 Cookie byPass = new Cookie.Builder("duo_bypass", Constant.dev_duoBypass)
				    .domain(Constant.devQaServer)
				    .path("/")
				    .build();
		 webdriver.manage().addCookie(byPass);
		 webdriver.get("https://"+Constant.devQaServer);
		 
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.out.println("This is cookie "+cfduid.toString());
	}
	//Get Token for server like QA 12
	public String GetTokenFromQaServer(WebDriver driver)
	 {
		String token = "";
		    LoginDev(driver);
		    try {
		    	
		    	Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_ALT);
				robot.delay(10);
		        robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_ALT);
		        robot.keyRelease(KeyEvent.VK_T);
		        try {
					Thread.sleep(5000);
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
		        //go to end of mailbox
		        try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        robot.keyPress(KeyEvent.VK_SHIFT);
		        robot.delay(10);
		        robot.keyPress(KeyEvent.VK_8);
		        robot.delay(10);
		        robot.keyRelease(KeyEvent.VK_8);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        //fetch email from it
		        String lastText = "";
		        List<String> binaryMails;
		        do{
		          LoadALLMails();//method to get all emails subjects displayed on terminal
		        //get all verification email from mailbox
		        String searchString = "Verify your email address - Binary"+Constant.emailSubjectContainServer;
		         binaryMails = new ArrayList<String>();
		        for (String curVal : AllMailSubjactes){
		          if (curVal.contains(searchString)){
		        	  binaryMails.add(curVal);
		          }
		        }
		        if(binaryMails.size()==0)
		        {
		        	int size = texts.size();
		        	for(int i=0;i<=size;i++)//loop to page down n times
		        	{
			        		robot.keyPress(KeyEvent.VK_UP);
			        		robot.delay(100);
					        robot.keyRelease(KeyEvent.VK_UP);
			        	}
		        }
		        }while (binaryMails.size()==0);
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
		    //webdriver.quit();
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
					Thread.sleep(20);
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
	public String RandomName(int len) 
	{
		Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
	    StringBuilder sb = new StringBuilder(len);
	    for(int i = 0; i < len; i++) { // For each letter in the word
	        char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
	        sb.append(tmp); // Add it to the String
	    }
	    //System.out.println(sb.toString());
	    return sb.toString();
    }
	public void TestTerminal()
	{
		ChromeDriverManager.getInstance().setup();
		webdriver = new ChromeDriver(); 
		webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
   	Navigation_Action.Navigate_To_HomePage(webdriver,"https://"+Constant.devQaServer);
   	
		String token = "";
		 Cookie byPass = new Cookie.Builder("duo_bypass", Constant.dev_duoBypass)
				    .domain(Constant.devQaServer)
				    .path("/")
				    .build();
		 webdriver.manage().addCookie(byPass);
		//Cookie cfduid = new Cookie.Builder("_cfduid", "dbf3fb7709db0d2ab6cec0315fdbdeefa1494221395")
			  //  .domain(".binaryqa12.com")
			   // .path("/")
			    //.build();
			//driver.manage().addCookie(cfduid);
		 webdriver.get("https://"+Constant.devQaServer);
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 webdriver.findElement(By.className("editor_tab ")).click();;
		 Actions action = new Actions(webdriver);
			action.keyDown(Keys.ALT).sendKeys(String.valueOf('\u0054')).build().perform();
		 
	}
	public static WebDriver BrowserStackConfigurations()
	{
		WebDriver driver = null;
		//String USERNAME = "jeanyvessireau1";
		//String AUTOMATE_KEY = "yaCwKpSDnNp7zTxqLzDf";
		String URL = "https://" + Constant.BsUserName + ":" + Constant.BsKey + "@hub-cloud.browserstack.com/wd/hub";
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "58.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("name", Constant.BsTesName);
	    caps.setCapability("browserstack.debug", "false");

	    try {
			driver = new RemoteWebDriver(new URL(URL), caps);
			return driver;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	    
	}
	public String GetDate()
	{
		LocalDateTime localdatetime = LocalDateTime.now();
		int year = localdatetime.getYear();
		int day = localdatetime.getDayOfMonth();
		String month = localdatetime.getMonth().name();
		return String.valueOf(day)+" "+month+", 1999";
	}

}
