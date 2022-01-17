package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathByaxces {
	
	//  to see vedio :   https://www.youtube.com/watch?v=aAWvwGFkySI
	
	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 
		  WebDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
		
		    driver.manage().window().maximize();    ////Step-2maximize the window
				
		    driver.get("https://www.moneycontrol.com");  //Step-3-open the web page
		    
		    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		    
		    JavascriptExecutor js= (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//table[@class='rhsglTbl']//a[contains(text(),'Reliance')]//self::a[1]")));
		    
		 //self   
		  
		 String text=   driver.findElement(By.xpath("//table[@class='rhsglTbl']//a[contains(text(),'Reliance')]//self::a[1]")).getText();	
		 //   String text=   driver.findElement(By.xpath("(//a[contains(text(),'Reliance')])[2]")).getText();		    
		    
		 System.out.println(text);
		 
		 //following-sibling
//		  
//		    driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("ruksana@gmail.com");
//		//child to parent
//		    
//		    driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]/parent::div"));
//	
//		    
//		    //preceding-sibling
//		    
//		    driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input"));
//	
//	//child
//		    driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text']"));
//		 
//		    
//		 
//		    driver.findElement(By.xpath(" //div[@class='container']/descendant::button"));
//		    
//		    
//		    driver.findElement(By.xpath(" //div[@class='buttons']/ancestor-or-self::div"));
//		    
//		    
//		    driver.findElement(By.xpath(" //label[text()='Password']/following::input[1]"));
//		  
		  
	
	}

}
