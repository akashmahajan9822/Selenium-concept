package ClassLecPrac;

/*1.verify the URL of webpage
 2. learn  driver.getCurrentUrl();

 * 
 * */


import org.openqa.selenium.chrome.ChromeDriver;

public class URlverify {

	public static void main(String[] args) throws InterruptedException {
	//configuration
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
	    ChromeDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
	
	    driver.manage().window().maximize();    ////Step-2maximize the window
			
	   driver.get("https://www.google.co.in/");  //Step-3-open the web page
	
	   driver.getCurrentUrl();
	   
	
	  // .verify the URL 
	   
	   System.out.println("Current URL is " + driver.getCurrentUrl());
	   
	   if (driver.getCurrentUrl().equals("https://www.google.co.in/")) {
			
			System.out.println("URL Matched- testcase Pass");
			
		}
		else 
		{
			System.out.println("URL not matched -test case failed");
		}
	   
	   
	   //OR
	   
 /*
     String url=driver.getCurrentUrl();
    System.out.println("Current URL is " + url);
    
    if (url.equals("https://www.google.co.in/")) {
			
			System.out.println("URL Matched- testcase Pass");
			
		}
		else 
		{
			System.out.println("URL not matched -test case failed");
		}
   
  * */
	   
	   
	   
	      Thread.sleep(5000);   //Strp-5
	 		driver.close();
	}

}
