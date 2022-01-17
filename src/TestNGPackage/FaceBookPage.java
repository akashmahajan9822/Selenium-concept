package TestNGPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class FaceBookPage {
	//run through suite
	
	// create global object so we can used object in all methods.
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			

		// Step-1
		driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();
	}

	@Test (priority=1 ,groups={"Sanity", "Regression" ,"module1"})
	public void navigateToPage() {
		driver.get("https://www.facebook.com/");

	}

	@Test (priority=2 ,groups={"Sanity", "Regression","module1"})
	public void CheckPageTitle() {
		
		String extitle="Facebk";
		
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, extitle);

	}
	@Test (priority=3, groups={"Sanity", "Regression","module1"})
	@Parameters( {"inputEmail", "inputPass"})
	public void login(String email, String pass) throws InterruptedException {
		
		
		WebElement emailBox=driver.findElement(By.id("email"));
	    emailBox.sendKeys(email);
	    
	    WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys(pass);
		
		//Step-6
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();

	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}
	
}
