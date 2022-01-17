package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceform {
	
	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
	    ChromeDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
	
	    driver.manage().window().maximize();    ////Step-2maximize the window
	
	    driver.get("https://demoqa.com/automation-practice-form");  //Step-3-open the web page
		
	
	    driver.findElement(By.id("firstName")).sendKeys("akash"); //Step-8-
		Thread.sleep(500);
		driver.findElement(By.id("lastName")).sendKeys("mahajan"); //Step-8-
		Thread.sleep(500);
	    

	    driver.findElement(By.id("userEmail")).sendKeys("akash852@gmail.com"); //Step-8-
		Thread.sleep(500);
	 
	    
	  
	    driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][3]")).click(); //Step-8-
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][2]")).click(); //Step-8-
		Thread.sleep(2000);   
		
		driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][1]")).click(); //Step-8-
		Thread.sleep(2000); 
		
		driver.findElement(By.id("userNumber")).sendKeys("1234567890"); //Step-8-
		Thread.sleep(500);
	  
		driver.findElement(By.id("dateOfBirthInput")).click(); //Step-8-
		Thread.sleep(500);
		
		 WebElement yrdroupdown = driver.findElement(By.className("react-datepicker__year-select"));
		 Select select = new Select(yrdroupdown);
		 select.selectByValue("2012");
		 Thread.sleep(1000);
		
		 WebElement monthdroupdown = driver.findElement(By.className("react-datepicker__month-select"));
		 Select select2 = new Select(monthdroupdown);
		 select2.selectByVisibleText("March");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class=\"react-datepicker__week\"]//div[text()='15']")).click(); //Step-8-
			Thread.sleep(200);
		  
		 
			driver.findElement(By.xpath("//div[@class=\"custom-control custom-checkbox custom-control-inline\"][1]")).click(); //Step-8-
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//div[@class=\"custom-control custom-checkbox custom-control-inline\"][2]")).click(); //Step-8-
			Thread.sleep(2000);   
			
			driver.findElement(By.xpath("//div[@class=\"custom-control custom-checkbox custom-control-inline\"][3]")).click(); //Step-8-
			Thread.sleep(2000); 
			
			driver.findElement(By.id("//div[@class='subjects-auto-complete__control css-yk16xz-control']")).sendKeys("find me"); //Step-8-
			Thread.sleep(500);
		
			
	}

}
