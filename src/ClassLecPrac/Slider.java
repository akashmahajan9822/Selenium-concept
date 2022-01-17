package ClassLecPrac;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Slider {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
		   //Step-1
			WebDriver driver=new ChromeDriver();
			
			//step-2
			driver.manage().window().maximize();
			
			//Step-3
			//Open the url using navigate method
			driver.get("https://jqueryui.com/slider/");
			
			Thread.sleep(5000);
			//WebElement radio1=driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']//input[@value='Male']"));
			
		
			//Step-4
			//Iframe identification
			WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
			
			//Step-5
			//swicthing the frame
			driver.switchTo().frame(frame);
			
			//step-6
			WebElement slider=driver.findElement(By.id("slider"));
			
			//Actions class
			Actions act=new Actions(driver);
			act.clickAndHold(slider).moveByOffset(50, 0).release().perform();
			
			//TakeScreenShot
			TakesScreenshot tsc=(TakesScreenshot)driver;
			
			File source=tsc.getScreenshotAs(OutputType.FILE);
			
			File destination=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Katraj-Sept-11-2021\\Screenshots\\snap.png");
			
			FileHandler.copy(source, destination);
			
			Thread.sleep(5000);
			driver.close();
			
			

	}

}
