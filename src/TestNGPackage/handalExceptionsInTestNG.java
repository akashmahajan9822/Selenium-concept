package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handalExceptionsInTestNG {
	WebDriver driver;
 
	@Test (expectedExceptions = Runtime.class  )
  public void f() {
		int a= 10/0;
		
  }
	
	@Test 
	  public void a() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		String Textboxvalue = ""; 
		  Textboxvalue = driver.findElement(By.xpath("//textarea[@cols='30']")).getText();
		  System.out.println(Textboxvalue);
		if(!Textboxvalue.isEmpty()) {
	String	message="Pass";}
		
		// check checkbox
		
	
	boolean checkBox =  driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected();
	
	if(checkBox) {
		System.out.println("Checkbox  has been selected" );

	
	
		}

		
		
		
			
			
	  }
}
