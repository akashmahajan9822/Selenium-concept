package ClassLecPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
		   //Step-1
			WebDriver driver=new ChromeDriver();
			
			//step-2
			driver.manage().window().maximize();
			
			//Step-3
			//Open the url using navigate method
			driver.navigate().to("https://demoqa.com/buttons");
			
			//Action class
			Actions act=new Actions(driver);
			
			WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));
			WebElement rightClickButton=driver.findElement(By.id("rightClickBtn"));
			
			act.doubleClick(doubleClickButton).perform();
			
			act.contextClick(rightClickButton).perform();
			
			WebElement clickmenu = driver.findElement(By.xpath("//button[text()='Click Me']"));
		 	Thread.sleep(3000);
		 	   
		 	act.moveToElement(clickmenu).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		    
		

	}

}
