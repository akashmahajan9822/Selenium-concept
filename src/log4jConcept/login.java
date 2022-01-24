package log4jConcept;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class login {
	 ChromeDriver driver;
	
	 
	@BeforeClass
	public void setup() {
		 Logger log = Logger.getLogger(login.class);
		  PropertyConfigurator.configure("log4j.properties");  // configure log4j.properties file
		 // DOMConfigurator.configure("log4j.xml");       //// configure log4j.xml file
		  
		  
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
		     driver =new ChromeDriver();    ////Step-1 Browser open- by creating
		
		    driver.manage().window().maximize();
		    ////Step-2maximize the window
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		    driver.get("https://classic.freecrm.com/index.html"); 
		
	}
@Test
public void validatTitle() {
	String tt = driver.getTitle();
	Assert.assertEquals(driver.getTitle(), tt,"home page title fail");
	
}
	
@Test
public void validatURL() {
	
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://classic.freecrm.com/index.html","home page URl fail");
	
}
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
}
