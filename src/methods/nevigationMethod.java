package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigationMethod {
	
	public static void main(String[] args) throws InterruptedException {


		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
   
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/browser-windows");
      driver.manage().window().maximize();

     		
     		

     		
     		  Thread.sleep(5000);
     		  
     		  driver.navigate().back(); Thread.sleep(5000);
     		  
     		  driver.navigate().forward(); Thread.sleep(5000);
     		  
     		  driver.navigate().refresh();
     		 driver.close();
     		 
	}

}
