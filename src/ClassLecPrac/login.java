package ClassLecPrac;


/* 1.log into facebook 
 * 2. learn locator concept
  */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
		    ChromeDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
		
		    driver.manage().window().maximize();    ////Step-2maximize the window
				
		    driver.get("https://www.facebook.com/");  //Step-3-open the web page
		
		 
		    
		    WebElement emailBox=driver.findElement(By.id("email"));  //Step-4-
			emailBox.sendKeys("abc@gmail.com");  //Step-5-
		         
		    //or
		
	 //  driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
	 
	         Thread.sleep(500);
			
		
			
			WebElement password=driver.findElement(By.id("pass")); //Step-6-
			password.sendKeys("Pass1234");        //Step-7-
		             //or
			
		//	 driver.findElement(By.id("pass")).sendKeys("Pass1234");
				
			
			
			Thread.sleep(500);
			
			WebElement log=driver.findElement(By.name("login")); //Step-8-
			log.click();        //Step-9-
			
	                        //or
			
	 //     driver.findElement(By.name("login")).click();
				

	      

			System.out.println("**********************************************");      
	      
	 Thread.sleep(500);
	      
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(500);
	  
	  driver.manage().window().maximize();
	  
	  WebElement forgetPasswordLink=driver.findElement(By.xpath("//*[@class='_6ltj']"));
		forgetPasswordLink.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("9028292307");
		driver.findElement(By.xpath("//button[@id='did_submit']")).click();
		Thread.sleep(2000);
		
		//step-10
		driver.findElement(By.xpath("//tbody//tr//td//table//td//label//div//input[@id='send_email']")).click();
		
	  
	  
	 System.out.println("**********************************************"); 
	      
	      
	      
	      
	      
			Thread.sleep(50000);
			driver.close();
		
		

	}

}
