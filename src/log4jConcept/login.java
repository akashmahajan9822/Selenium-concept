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
	 Logger log ;
	 
	@BeforeClass
	public void setup() {
		  log = Logger.getLogger(login.class);
		  PropertyConfigurator.configure("log4j.properties");  // configure log4j.properties file
		 // DOMConfigurator.configure("log4j.xml");       //// configure log4j.xml file
		  log.info("****************************** Starting test cases execution  *****************************************");
			  
		  
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		 log.info("launching chrome broswer");
		     driver =new ChromeDriver();    ////Step-1 Browser open- by creating
		
		    driver.manage().window().maximize();
		    ////Step-2maximize the window
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		    driver.get("https://classic.freecrm.com/index.html"); 
		
		    
		    
		    driver.get("https://classic.freecrm.com/index.html");
			log.info("entering application URL");
			log.warn("Hey this just a warning message");
			log.fatal("hey this is just fatal error message");
			log.debug("this is debug message");
	}
@Test
public void validatTitle() {
	log.info("****************************** starting test case *****************************************");
	log.info("****************************** freeCrmTitleTest *****************************************");
	String tt = driver.getTitle();
	log.info("login page title is--->"+ tt);
	Assert.assertEquals(driver.getTitle(), tt,"home page title fail");
	log.info("****************************** freeCrmTitleTest closed*****************************************");
}
	
@Test
public void validatURL() {
	log.info("****************************** freeCrmURLTest *****************************************");
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://classic.freecrm.com/index.html","home page URl fail");
	log.info("****************************** freeCrmURLTestclosed *****************************************");
	log.info("****************************** ending test case *****************************************");
}
	@AfterClass
	public void teardown() {
		
		driver.quit();
		log.info("****************************** Browser is closed *****************************************");
	}
}
