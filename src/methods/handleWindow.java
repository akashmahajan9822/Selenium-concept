package methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class handleWindow extends ChromeDriverLaunch   {

	
	
//	1.	getWindowHandle() capture single window so we can used various.
//	Return string  
//	String firstWindow = driver.getWindowHandle();
//	2.	operation  getWindowHandles(),  capture multiple window so we can used various operation.
//	Return string in set of windows
//	 Set<String> windows = driver.getWindowHandles();
//	3.	switchTo()  to switch window from one window to another 1st we have to capture window.
//	driver.switchTo().window(window);
//	4.	window() Commands
//	5.	  return iteration of window   Iterator<String> itr = windows.iterator();
//	 itr.hasNext()
//	 itr.next();

	public void handling() throws InterruptedException {
		
		  driver.get("http://omayo.blogspot.com/");
          
          //Write code here
         String firstWindow = driver.getWindowHandle();
         
          driver.findElement(By.linkText("Open a popup window")).click();
         
         Thread.sleep(3000);
         
         System.out.println(driver.getTitle());
         
         
         Set<String> windows = driver.getWindowHandles();
         
         Iterator<String> itr = windows.iterator();

         
          while(itr.hasNext()) {
                
                String window = itr.next();
                
              
                
                 driver.switchTo().window(window);
                
                 if(driver.getTitle().equals("Basic Web Page Title")) {
                       driver.close();
                }
                
         }
         
         
         Thread.sleep(3000);
         
          driver.switchTo().window(firstWindow);
         
          driver.findElement(By.name("q")).sendKeys("Arun");

		
		
		
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		handleWindow ob=new handleWindow();
		ob.launchBrowser();
ob.handling();

	}

}
