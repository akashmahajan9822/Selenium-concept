package advanceHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class UploadDownloadFileUsingSikuli {
	static WebDriver driver;

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
	     driver =new ChromeDriver();    ////Step-1 Browser open- by creating
	
	    driver.manage().window().maximize();    ////Step-2maximize the window
			
	    driver.get("http://demo.automationtesting.in/Register.html");  //Step-3-open the web page
	
         driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
      String  imagesFilepath="C:\\Users\\Admin\\Pictures\\Screenshots";
		
		Screen s=new Screen();  // import from org.sikuli.script.Screen
	}

}
