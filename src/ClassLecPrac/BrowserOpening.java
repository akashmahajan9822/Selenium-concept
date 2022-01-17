package ClassLecPrac;

/* 1. open the browser
   2.Maximize web page
  3.verify Title of web page
  4.learn driver.getTitle();  driver.get("url"); driver.close();
 * */



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpening {

	public static void main(String[] args) throws InterruptedException {
		//Verify web page title 
		
//configuration
System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
		
		
         //Step-1
		//Browser open- by creating 
		ChromeDriver driver =new ChromeDriver();
		  //or
		//WebDriver driver=new ChromeDriver();	
		
		//Step-2
		//maximize the window
		driver.manage().window().maximize();
		
		
		
		//Step-3-open the web page
		driver.get("https://www.google.co.in/");
		
		//Step-4
		//Title verify
		
String title=driver.getTitle();
		
		System.out.println("Current Title is " + title);
		
		if (title.equals("Googghgle")) {
			
			System.out.println("Title Matched- testcase Pass");
			
		}
		else 
		{
			System.out.println("Title not matched -test case failed");
		}
		
		
		//Strp-5
		Thread.sleep(5000);
		driver.close();
		 
 
		
  
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
