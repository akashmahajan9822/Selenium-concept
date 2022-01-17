package methods;

import org.openqa.selenium.By;

public class quitCommand extends ChromeDriverLaunch  {


	public void program() throws InterruptedException{
		
		 driver.get( "http://omayo.blogspot.com/");
         
         driver.findElement(By.linkText("Open a popup window")).click();
         Thread.sleep(5000);
        driver.close();
        Thread.sleep(5000);
         driver.quit();

		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		quitCommand ob=new quitCommand();
		ob.launchBrowser();
		ob.program();
		
	}

}
