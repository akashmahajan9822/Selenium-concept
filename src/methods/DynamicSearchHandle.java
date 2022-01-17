package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DynamicSearchHandle {
	
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
	  WebDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
	
	    driver.manage().window().maximize(); 
	    driver.get("https://www.google.co.in/");
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing t");
//	    Actions action=new  Actions(driver);
//	    
//	    action.sendKeys(Keys.DOWN);
	   
	  List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li//div//div//div[@class='wM6W7d']//b"));
	    
	  System.out.println(list.size());
	  for (int i=1; i<=list.size(); i++) {
		  
		  System.out.println(list.get(i).getText());
		  
	  }
}

}