package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");	
		
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://omayo.blogspot.com/");  //Step-3-open the web page
 driver.findElement(By.xpath("//input[@name='q'] [@class='gsc-input']")).sendKeys("akash"); 

     Thread.sleep(50000);
		//driver.close();
     
     
    /* 
     * example of find path in DOm if we not identify element 
 	driver.findElement(By.xpath("//tbody//tr//td//table//td//label//div//input[@id='send_email']")).click();
	
	*/
     
	
	}

}
