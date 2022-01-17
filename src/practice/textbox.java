package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class textbox {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
		    ChromeDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
		
		    driver.manage().window().maximize();    ////Step-2maximize the window
		
		    driver.get("https://demoqa.com/text-box");  //Step-3-open the web page
	
		    
		    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("akash mahajana"); //Step-8-
			Thread.sleep(500);

		    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("akash23@gmail.com"); //Step-8-
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("find me"); //Step-8-
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("find me"); //Step-8-
			Thread.sleep(500);
			
			
			//TakeScreenShot
			TakesScreenshot tsc=(TakesScreenshot)driver;
			
			File source=tsc.getScreenshotAs(OutputType.FILE);
			
			File destination=new File("G:\\VELOCITY\\WORK\\Eclips_project\\Selenium_concept\\Screenshots\\snap.png");
			
			FileHandler.copy(source, destination);
			 
			
			
//			driver.findElement(By.xpath("//button[@id='submit']")).click(); //Step-8-
//			Thread.sleep(500);
//			
	}


}
