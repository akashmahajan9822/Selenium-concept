package methods;

import org.openqa.selenium.By;

public class locatorMethod extends ChromeDriverLaunch {
	
	
	public void findlocators() throws InterruptedException{
		
		driver.get( "http://omayo.blogspot.com/");
		  driver.findElement(By.id("alert1"));
		  Thread.sleep(8000);	
		  driver.findElement(By.name("q"));
		  Thread.sleep(8000);
		  driver.findElement(By.className("classone"));
		  Thread.sleep(8000);
		  driver.findElement(By.linkText("compendiumdev"));
		  Thread.sleep(8000);
		  driver.findElement(By.partialLinkText("Tutorial"));
		  Thread.sleep(8000);
		  driver.findElement(By.cssSelector("button[value='LogIn']"));
		  Thread.sleep(8000);
		  
//		  tagname#id
//		  tagname.class
//		  tagname[atrritbute='value']
//				  tagname#id[atrritbute='value']
						  
		  driver.close();
	} 
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		locatorMethod ob=new locatorMethod();
    	ob.launchBrowser();
		ob.findlocators();
		  

	}

}
