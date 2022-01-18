package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPAge {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");

		// Step-1
		WebDriver driver = new ChromeDriver();

		// step-2
		driver.manage().window().maximize();

		// Step-3
		// Open the url using navigate method
//		driver.navigate().to("https://vctcpune.com/selenium/practice.html#");
//
//		// Step-4
//		// scrolling webpage-we require to use javascriptexecutor
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		// scrolling down
//		js.executeScript("window.scrollBy(0,700)");
//		Thread.sleep(8000);
//
//		js.executeScript("window.scrollBy(0,-100)");
//
//		Thread.sleep(8000);

		driver.get("http://omayo.blogspot.com/");

		Thread.sleep(3000);

		//Scrolluntil webelement found
		WebElement myButton = driver.findElement(By.id("myBtn"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("myBtn")));
               //or

	//	jse.executeScript("arguments[0].scrollIntoView(true);", myButton);

		Thread.sleep(8000);

		driver.close();

	}

}
