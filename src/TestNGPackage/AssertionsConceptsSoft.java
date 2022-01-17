package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsConceptsSoft {
	
	 SoftAssert sa;
  @Test
  public void f() {
	  
	   
	  System.out.println("before asertion ");
	  
	  
	     sa=new SoftAssert();
		 sa.assertEquals(false, true);
		
		 
		  
	
	  
	  
	  System.out.println("after asertion ");
	  
	  sa.assertAll();
  }
  @Test
  public void g() {
	  
	  
	  System.out.println("g execute ");
	  	 
	  
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
  public void softAssert() {
 
  SoftAssert softAssert = new SoftAssert();
  
  driver.navigate().to("https://www.browserstack.com/");
  String getActualTitle = driver.getTitle();
  Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
  softAssert.assertEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
  softAssert.assertNotEquals(getActualTitle, "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
  softAssert.assertNull(verifyTitle);
  softAssert.assertNotNull(verifyTitle);
  softAssert.assertTrue("BrowserStack".equals("Browserstack"), "First soft assert failed");
  softAssert.assertFalse("BrowserStack".equals("BrowserStack"), "Second soft assert failed");
  softAssert.assertAll(); 
  }
}
