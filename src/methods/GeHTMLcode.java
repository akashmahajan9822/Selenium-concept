package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeHTMLcode {
	
	

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
   
    driver.get( "http://omayo.blogspot.com/");
   
   WebElement button = driver.findElement(By.id("alert1"));
   
   String htmlCodeOfWebElement = button.getAttribute( "outerHTML");
   
   System.out.println( htmlCodeOfWebElement);
   
    driver.close();

}}
