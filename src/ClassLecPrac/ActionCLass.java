package ClassLecPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCLass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
		   //Step-1
			WebDriver driver=new ChromeDriver();
			
			//step-2
			driver.manage().window().maximize();
			
			//Step-3
			//Open the url using navigate method
			driver.navigate().to("https://vctcpune.com/selenium/practice.html#");
			
			//Step-4
			//scrolling webpage-we require to use javascriptexecutor
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//scrolling down
			js.executeScript("window.scrollBy(0,500)");
			
			//Step-5
			//dropdown using Action class-
			driver.findElement(By.id("dropdown-class-example")).click();
			
			//Object creation of Action class
			Actions act=new Actions(driver);
			
			act.sendKeys(Keys.DOWN).perform();
			act.sendKeys(Keys.DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();
			
		

	}

}
