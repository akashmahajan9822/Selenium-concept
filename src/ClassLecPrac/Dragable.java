package ClassLecPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		 
			WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
			driver.get("https://jqueryui.com/draggable/");
			
			Thread.sleep(5000);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,300)");
			
		
			WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
			
			driver.switchTo().frame(frame);
			
			
			WebElement dragObject=driver.findElement(By.id ("draggable"));
			
			Actions act=new Actions(driver);
			act.dragAndDropBy(dragObject, 200,100).perform();
			Thread.sleep(5000);
			
			driver.close();

	}

}
