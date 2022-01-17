package ClassLecPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.navigate().to("https://tcpune.com/selenium/practice.html#");

		
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//scrolling down
			js.executeScript("window.scrollBy(0,700)");
			Thread.sleep(3000);
			
			//Step-5
			WebElement alert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
			alert.click();
			Thread.sleep(3000);
			
			//step-6
			//Handle alert
			driver.switchTo().alert().accept();
			Thread.sleep(8000);
			
			//Step-7
			String name="Sachin";
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
			Thread.sleep(3000);
			
			//Step-8
			//Click on confirm button
			driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
			Thread.sleep(3000);
			
			//Strp-9
			//Alert text get and compare
			String details=driver.switchTo().alert().getText();
			System.out.println(details);
			
			if (details.contains(name)) {
				
				driver.switchTo().alert().accept();
				
			}
			else
				driver.switchTo().alert().dismiss();
			
			
			Thread.sleep(5000);
			driver.close();
			
	}

}
