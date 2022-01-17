package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecute extends ChromeDriverLaunch  {
	
public void practice() throws InterruptedException {
	
	// 1.perform click option
	
		driver.get( "https://the-internet.herokuapp.com/add_remove_elements/");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		 WebElement element = driver.findElement(By.xpath("//button[text()='Add Element']"));
				
		
		js1.executeScript("arguments[0].click();", element);
		
		 Thread.sleep(6000);
	//send key
		 
		driver.get( "https://the-internet.herokuapp.com/inputs");
		 WebElement element2 = driver.findElement(By.xpath("//input[@type='number']"));
			
		
		js1.executeScript("arguments[0].value='1234';", element2);

		//get value
		
		driver.get( " https://www.selenium.dev/");
		 WebElement element3 = driver.findElement(By.xpath("//div//h2[@class='selenium text-center']"));
	
		 System.out.println(js1.executeScript("return arguments[0].innerHTML;", element3));
		 Thread.sleep(6000);
		 //scrolled down and up
		 js1.executeScript("window.scrollBy(0,500)");
 
		 Thread.sleep(6000);
		
	//	alert
		//  driver.get( "http://omayo.blogspot.com/");
		
		  js1.executeScript("alert('Akash');");
		  Thread.sleep(5000);
		  driver.switchTo().alert().accept();
		  
		//  executeAysncScript() Command
		  Thread.sleep(6000);
		  
		  js1.executeAsyncScript("window.setTimeout(function(){alert('world');},4000);alert('Hello');");
		 
	//drag  and droup
		 // driver.get( "https://the-internet.herokuapp.com/drag_and_drop");
		
		  
		  Thread.sleep(60000);
		  driver.quit();
}






public static void main(String[] args) throws InterruptedException {
	
	
	JavaScriptExecute ob=new JavaScriptExecute();
ob.launchBrowser();
ob.practice();
}

}
