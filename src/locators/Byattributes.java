package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byattributes {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
		    ChromeDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
		
		    driver.manage().window().maximize();    ////Step-2maximize the window
				
		    driver.get("https://www.facebook.com/");  //Step-3-open the web page
		    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		    driver.findElement(By.id("pass")).sendKeys("Pass1234");
		    driver.findElement(By.name("login")).click();
      
	
	
	}

}
