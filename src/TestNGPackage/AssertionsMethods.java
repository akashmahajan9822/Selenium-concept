package TestNGPackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionsMethods {
	
	
	
	 @Test
	  public void f() {
		  
		   
		  
		  Assert.fail();
		  Assert.assertEquals(false, true);
		  Assert.assertNotEquals(false,false);
		  Assert.assertTrue(false);
		  Assert.assertFalse(false);
		  Assert.assertNull(false);
		  Assert.assertNotNull(false);
		  Assert.assertNotSame(null, null);
		  Assert.assertSame(null, null);
		  
	  }
	 WebDriver driver;
	 
	 @BeforeTest
		public void launchBrowser() {
			 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
				

			// Step-1
			driver = new ChromeDriver();

			// step-2
			driver.manage().window().maximize();
		}
	 
	 
	 @Test
	 public void testAssertFunctions() {
	 
	 driver.navigate().to("https://www.browserstack.com/");
	 String ActualTitle = driver.getTitle();
	 String verifyAssertNull=null;
	 String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	 Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	 Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Testing Platform | BrowserStack");
	 assertEquals(ExpectedTitle, ActualTitle);
	 assertNotEquals(ExpectedTitle, "browserstack");
	 assertTrue(verifyTitleIsPresent);
	 assertFalse(verifyTitleIsChanged);
	 assertNotNull(verifyTitleIsPresent);
	 assertNull(verifyAssertNull);
	 }
	 

}
