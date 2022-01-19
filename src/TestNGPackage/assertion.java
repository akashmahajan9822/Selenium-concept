package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assertion {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromeDriverfor96.0\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.google.co.in/");	
		
		System.out.println();
		
		Assert.assertEquals(d.getTitle(), "ggoogle" ,"title fail");
		
		Assert.assertEquals(d.getCurrentUrl(), "https:www.google.co.in" ,"URL fail");
		
		d.close();
    
	}

}
