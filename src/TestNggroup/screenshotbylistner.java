package TestNggroup;


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


@Listeners(TestNggroup.TestNgListenersClass.class)
public class screenshotbylistner {
	
	// create global object so we can used object in all methods.
 public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			

		// Step-1
		driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();
	}

	@Test (priority=1 )
	public void navigateToPage() {
		driver.get("https://www.facebook.com/");

	}
	@Test (priority=2 )
	public void CheckPageTitle() {
		
		String extitle="Facebook – log in or sign up";
		
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, extitle);

	}


	@Test (priority=3)
	
	public void login() throws InterruptedException {
		
		
		WebElement emailBox=driver.findElement(By.id("email"));
	    emailBox.sendKeys("akash");
	    
	    WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("akash558");
		
		//Step-6
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();

		Assert.assertEquals(true, false);
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}
	
}
