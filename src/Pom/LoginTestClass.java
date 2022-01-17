package Pom;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTestClass {
	String url="https://opensource-demo.orangehrmlive.com/";
	
	LoginPageClass lpg;
	
	public WebDriver driver;
	
	@BeforeSuite
	public void initalization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
		
		// Step-1
		driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		lpg=new LoginPageClass(driver);
		
	}
	
	@Test 
	public void navigate() {
		
		driver.get(url);
		
	}
	
	@Test (dependsOnMethods="navigate")
	public void login() {
		
		lpg.login();
		
	}

	@AfterSuite 
	public void closed() {
		
		driver.quit();
		
	}
	
}
