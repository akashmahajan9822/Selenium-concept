package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateHandler {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/resources/demos/datepicker/other-months.html");
		
		
		//open the calender
		WebElement datePicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
		datePicker.click();
		Thread.sleep(5000);
		
		
		//change the month value backward
		while(true) {
			
			String monthValue=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println("Cuurent Month title is " + monthValue);
			
			if(!monthValue.equalsIgnoreCase("May 2020"))  {
				
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
			}
			else {
				break;
				
			}}
			
		
			//select the day value
		    int date=15;
			driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+date+"']")).click();
		
			
			
			
			Thread.sleep(5000);
			
		
		
		

	//change the month value backward
			
			
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	while(true) {
		
		String monthValue=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println("Cuurent Month title is " + monthValue);
		
		
		if(!monthValue.equalsIgnoreCase("May 2022"))  {
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		else {
			break;
			
		}}
		
	
		//select the day value
	    
		driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+date+"']")).click();
		Thread.sleep(5000);
		}}
