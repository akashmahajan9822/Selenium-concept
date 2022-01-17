package methods;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ChromeDriverLaunch  implements GeneralizationCommonProperty{

	
	WebDriver driver;
	// ChromeDriver driver;
	//RemoteWebDriver driver;
	
	public static void main(String[] args) throws InterruptedException ,IOException {
		
		ChromeDriverLaunch  c=new ChromeDriverLaunch();
		c.launchBrowser();

	}


	@Override
	public void launchBrowser() throws InterruptedException {
		
		System.setProperty(set1, path1);
		driver=new  ChromeDriver();
		driver.manage().window().maximize();
		//driver.get(url1);
	}

}
