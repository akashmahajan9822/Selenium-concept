package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
		  WebDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
		
		    driver.manage().window().maximize();    ////Step-2maximize the window
				
		    driver.get("https://www.facebook.com/");  //Step-3-open the web page
		    
		    WebElement forgetPasswordLink=driver.findElement(By.linkText("Forgotten password?"));
			forgetPasswordLink.click();
			
			Thread.sleep(1000);
			
			WebElement cancle=driver.findElement(By.className("_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy"));
			cancle.click();
			
			 driver.get("https://www.facebook.com/");  	
	}

}
