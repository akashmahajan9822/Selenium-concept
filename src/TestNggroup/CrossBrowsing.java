package TestNggroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


 


public class CrossBrowsing {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserValue) {
		
		if(browserValue.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
				
		// Step-1
		driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();
		}
		else if(browserValue.equalsIgnoreCase("firefox")) {
			
				System.setProperty("webdriver.gecko.driver", "C:\\Selenium jar\\firefoxDriver\\geckodriver.exe");
				
			// Step-1
			driver = new FirefoxDriver();

			// step-2
			driver.manage().window().maximize();
			
		}
			
	}

	@Test (priority=1)
	public void navigateToPage() {
		driver.get("https://www.facebook.com/");

	}

	@Test (priority=2)
	public void CheckPageTitle() {
		
		String extitle="Facebook – log in or sign up";
		
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, extitle);

	}
	@Test (priority=3)
	@Parameters( {"inputEmail", "inputPass"})
	public void login(String email, String pass) throws InterruptedException {
		
		
		WebElement emailBox=driver.findElement(By.id("email"));
	    emailBox.sendKeys(email);
	    
	    WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys(pass);
		
		//Step-6
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();
		
		Thread.sleep(10000);

	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}
}
