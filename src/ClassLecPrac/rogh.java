package ClassLecPrac;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rogh {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
		    ChromeDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
		
		    
		    driver.get("https://www.path2usa.com/travel-companions");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			Thread.sleep(10000);
			
			driver.findElement(By.id("travel_date")).click();
			
			while(!driver.findElement(By.className("datepicker-switch")).getText().contains("December")) {
				
				driver.findElement(By.className("next")).click();
				
			}
			
			List<WebElement> days = driver.findElements(By.xpath("//td[@class='active day' or @class='day']"));
			
			for(int i=0;i<days.size();i++) {
				
				if(days.get(i).getText().equals("15")) {
					
					days.get(i).click();
					break;
					
				}
				
			}
	
			//keyDown() and keyUp() Commands
			 
	      
			
			
			
		  
	
	    
	}
	


}
