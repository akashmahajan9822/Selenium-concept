package ClassLecPrac;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) throws InterruptedException {


		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
   
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.redbus.in/");
        
//    //1.Handle New Window
//        
//        String parentWindow = driver.getWindowHandle();
//		System.out.println(parentWindow);

		
	 driver.findElement(By.xpath("//div[@class='fl search-box clearfix']//input[@id='src']")).sendKeys("pune");
	
	 
	 driver.findElement(By.xpath("//div[@class='fl search-box']//input[@id='dest']")).sendKeys("nashik");
	
	 driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	 
	 driver.findElement(By.xpath("//table//td[@class='wd day'][1]")).click();
	
	 driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
	 
	 
//		Set<String> allWindow = driver.getWindowHandles();
//		System.out.println(allWindow);
//		
//		
//		for (String id : allWindow) {
//			
//			if (!parentWindow.equalsIgnoreCase(id)) {
//
//				driver.switchTo().window(id);
//				Thread.sleep(5000);
//				driver.manage().window().maximize();
//				Thread.sleep(5000);
//				// driver.close();
//				Thread.sleep(5000);
//				driver.quit();
//			} }
	}
	
	
	//https://jqueryui.com/droppable/

}
