package ClassLecPrac;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
		   
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
        
    //1.Handle New Tab
        
        String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
	
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
			Thread.sleep(5000);
		 
		 driver.switchTo().window(parentWindow);
			Thread.sleep(6000);
			Set<String> allWindow = driver.getWindowHandles();
			
			for (String id : allWindow) {
			if (!parentWindow.equalsIgnoreCase(id)) {
				
								driver.switchTo().window(id);
								Thread.sleep(5000);
								driver.manage().window().maximize();
								
								
								Thread.sleep(5000);
								driver.close();
							} }
			
			
			

	}

}
