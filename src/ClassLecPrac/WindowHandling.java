package ClassLecPrac;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;







public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {


		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
   
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
        
    //1.Handle New Window
        
        String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		
	 driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		
		for (String id : allWindow) {
			
			if (!parentWindow.equalsIgnoreCase(id)) {

				driver.switchTo().window(id);
				Thread.sleep(5000);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				// driver.close();
				Thread.sleep(5000);
				driver.quit();
			} }
		
		System.out.println("*******************");
		

		
		

	}

}
