package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesHandling  extends ChromeDriverLaunch{
	
	
	public  void mains() throws InterruptedException {
		
		//1.frame switchto()
		   driver.get("http://omayo.blogspot.com/");
           
           WebElement requiredFrame = driver.findElement(By.id("iframe2"));
           
            driver.switchTo().frame(requiredFrame);
           
            driver.findElement(By.linkText("Chapter3")).click();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            Thread.sleep(5000);
          
          //parentFrame();  
            driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
            
            driver.switchTo().frame("iframeResult");
            driver.switchTo().frame(0);
           
           System.out.println(driver.findElement(By.xpath("//h1")).getText());
           
            driver.switchTo().parentFrame();
           
           System.out.println(driver.findElement(By.xpath("//p")).getText());
           
           Thread.sleep(5000);
           System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
           
         //  defaultContent();
           
           driver.get("http://omayo.blogspot.com/");
           
           driver.switchTo().frame("iframe2");
          
           driver.findElement(By.linkText("Chapter2")).click();
          
           driver.switchTo().defaultContent();
          
           driver.findElement(By.name("q")).sendKeys("Arun");
           Thread.sleep(5000);
            driver.close();
            
            
            
	
	}
	

	
	public static void main(String[] args) throws InterruptedException {
		FramesHandling ob=new FramesHandling();
		ob.launchBrowser();
		ob.mains();
	}
	
	
}
