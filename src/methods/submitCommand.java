package methods;

import org.openqa.selenium.By;

public class submitCommand extends ChromeDriverLaunch    {

	
//	17.	submit() Command
//	without click on log in button no need to inspect and identify element of log in button
//	 take any element attrinute whom value  we have to be enter

	
	public void program() throws InterruptedException {
		
		   driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
           
           //Write your code here
  driver.findElement(By.id("input-email")).sendKeys("arun.selenium@gmail.com");
          
  driver.findElement(By.id("input-password")).sendKeys("Second@123");
          
          Thread.sleep(3000);
          
         
//take any element attrinute from above input-email or input-password.

driver.findElement(By.id("input-email")).submit();

	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		submitCommand ob=new submitCommand();
		ob.launchBrowser();
		ob.program();
		

	}

}
