package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class FilreFoxBrowserProfile {
	WebDriver driver;
	@Test(priority=2)
	public  void DownloadFileWithoutAnyToolForFireFox() throws InterruptedException {
		
		   
	    System.setProperty("webdriver.gecko.driver", "C:\\Selenium jar\\firefoxDriver\\geckodriver.exe");
			 
		 FirefoxProfile profile =new  FirefoxProfile();
	 profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain"); // set MIME types
	 profile.setPreference("browser,download.manager.showWhenStarting",false);
	 
	 FirefoxOptions option=new FirefoxOptions();
	 option.setProfile(profile);
	 driver = new FirefoxDriver(option);

	/**A MIME type is a label used to identify a type of data. It is used so software can know how to handle the data. It serves the same purpose on the Internet that file extensions do on Microsoft Windows.
	So if a server says "This is text/html" the client can go "Ah, this is an HTML document, I can render that internally", while if the server says "This is application/pdf" the client can go "Ah, I need to launch the FoxIt PDF Reader plugin that the user has installed and that has registered itself as the application/pdf handler."
	You'll most commonly find them in the headers of HTTP messages (to describe the content that an HTTP server is responding with or the formatting of the data that is being POSTed in a request) and in email headers (to describe the message format and attachments).						 

	**/						 
		driver.manage().window().maximize();

		    driver.get("http://demo.automationtesting.in/FileDownload.html");  //Step-3-open the web page
		
		    driver.findElement(By.id("textbox")).sendKeys("sample Download file");
		 WebElement download=   driver.findElement(By.xpath("//button[@id='createTxt']"));
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		    js.executeScript("arguments[0].scrollIntoView(true);", download);

		    download.click();
		    Thread.sleep(5000);
		    driver.findElement(By.id("link-to-download")).click();
		    Thread.sleep(6000);
	/*****************************generate pdf file ********************************************************************************
		     * */	    	    
		    
		    Thread.sleep(2000);
		    // 
		    
		    driver.findElement(By.id("pdfbox")).sendKeys("sample pdf file Download ");
			 WebElement downloadpdf=   driver.findElement(By.xpath("//button[@id='createPdf']"));
			    
			  
			    js.executeScript("arguments[0].scrollIntoView(true);", downloadpdf);
		
			    downloadpdf.click();
			    Thread.sleep(5000);
			    driver.findElement(By.id("pdf-link-to-download")).click();
			    Thread.sleep(8000);
			    driver.quit();
			    
			    
			
		    
		    
		    
	}
}
