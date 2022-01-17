package ClassLecPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromeDriverfor96.0\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.google.co.in/");	
		Thread.sleep(3000);
    d.navigate().to("https://opensource-demo.orangehrmlive.com/");
	   d.navigate().refresh();
	    Thread.sleep(3000);
	   d.navigate().back(); 
	    Thread.sleep(3000);
	   d.navigate().forward(); 
	    d.close();
    d.manage().window().minimize();
	}

}
