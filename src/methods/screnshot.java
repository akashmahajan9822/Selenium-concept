package methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screnshot   {
	
	
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();


	  driver.get("https://demoqa.com/text-box");
	
		
		//TakeScreenShot
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File source=tsc.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("G:\\VELOCITY\\WORK\\Eclips_project\\Selenium_concept\\Screenshots\\snap.png");
		
	//	or way to define adrees
		//File destination=new File(System.getProperty("user.dir")+"\\Screenshots\\snap.png");	
		
		
		FileHandler.copy(source, destination);
	}

}
