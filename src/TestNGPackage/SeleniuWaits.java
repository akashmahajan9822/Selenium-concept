package TestNGPackage;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniuWaits {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Slenium Jar\\Chrome_96\\chromedriver.exe");

		// Step-1
		driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();
		
		//Adding implicitly waits.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	

	@Test (priority=1)
	public void navigateToPage() {
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

	}
	@Test (priority=2)
	public void checkAlert() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='alert'] ")).click();
		
		//Adding webDriverWait and explicitwait
		
		WebDriverWait wait=new WebDriverWait(driver,12);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
	}
	
	@Test (priority=2)
	public void buttonVisibilty() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='display-other-button'] ")).click();
	
		//Adding FluentWait
		
	
		FluentWait<WebDriver>fwait=new FluentWait<WebDriver> (driver);
		fwait.withTimeout(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
 // fwait.withTimeout(12,TimeUnit.SECONDS).pollingEvery(50, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		
		WebElement button=driver.findElement(By.id("hidden"));
		
	fwait.until(ExpectedConditions.visibilityOf(button));
		
		
		button.click();
		
	}
	

	

}
