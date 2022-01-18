package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserProfile {
	

		public static void main(String[] args) {


			
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
	    // we can give condition while running chrome driver
	//Handling Push Notifications in Chrome Browser using Selenium

	    ChromeOptions options=new ChromeOptions();    
	          options.addArguments("start-maximized");   // open with maximum
	        options.addArguments("--disable-notifications");  // disable browser notification like allow or save password
	        options.addArguments("--incognito");   // open in incognito mode

	        WebDriver driver = new ChromeDriver(options);
	        driver.navigate().to(" https://www.irctc.co.in/nget/train-search");
	        
	       

		}

}
