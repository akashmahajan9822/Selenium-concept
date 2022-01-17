package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertHandlingMethod extends ChromeDriverLaunch {

	
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	//driver.switchTo().alert().getText();
	//driver.switchTo().alert().sendkey(text);
	//alertIsPresent() Command
	
	public void program() throws InterruptedException {
		
   driver.get("http://www.omayo.blogspot.com");
		
	
		driver.findElement(By.id("alert1")).click();
		
	    Alert alerts = driver.switchTo().alert();
	    
	    String worning = alerts.getText();
	    
	    System.out.println(worning);
	    
	    Thread.sleep(5000);
	    
	    alerts.accept();

	    
	    // using this we can switch to main window
	    driver.switchTo().defaultContent();
	    Thread.sleep(5000);
	    driver.close();
	    Thread.sleep(10000);
	    
	    
	    
	    
	    driver.navigate().to("https://vctcpune.com/selenium/practice.html#");

		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scrolling down
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		
		//Step-5
		WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alert.click();
		Thread.sleep(3000);
		
		//step-6
		//Handle alert
		driver.switchTo().alert().accept();
		Thread.sleep(8000);
		
		//Step-7
		String name="Sachin";
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		Thread.sleep(3000);
		
		//Step-8
		//Click on confirm button
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(3000);
		
		//Strp-9
		//Alert text get and compare
		String details=driver.switchTo().alert().getText();
		System.out.println(details);
		
		if (details.contains(name)) {
			
			driver.switchTo().alert().accept();
			
		}
		else
			driver.switchTo().alert().dismiss();
		
		
		Thread.sleep(5000);
		driver.close();
	
		//alertIsPresent() Command
		
		  driver.navigate().to("http://omayo.blogspot.com/");
          
          driver.findElement(By.id("alert1")).click();
         
         WebDriverWait wait = new WebDriverWait(driver,10);  // wait for 10 sec 
         
          wait.until(ExpectedConditions.alertIsPresent());
         
          driver.switchTo().alert().accept();
        
          
          Thread.sleep(5000);
  		driver.close();
  	
  		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		alertHandlingMethod ob=new alertHandlingMethod();
		ob.launchBrowser();
		ob.program();
	}

}
