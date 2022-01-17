package ClassLecPrac;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
/*1. scrolling down page and up page 
 *  1.droupdown using select method
 * 
 * */
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;






public class droupdownHandling {

	
	public static void main(String[] args) throws InterruptedException {
		
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		
	    ChromeDriver driver =new ChromeDriver();    ////Step-1 Browser open- by creating
	
	    driver.manage().window().maximize();    ////Step-2maximize the window
			

		
		driver.navigate().to("https://vctcpune.com/selenium/practice.html#"); //Step-3 Open the url using navigate method
		
	
		//scrolling webpage-we require to use javascriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;   	//Step-4
		//scrolling down
		js.executeScript("window.scrollBy(0,500)");
		
	    
		WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
	
		//b-Create object of select class
		Select sel=new Select(dropDown);
		
		//c-now select the option
		sel.selectByIndex(2);
		Thread.sleep(2000);	
		sel.selectByVisibleText("Option3");
	
		Thread.sleep(2000);	
		
		List<WebElement> list =sel.getOptions();
		
		for (WebElement ele:list) {
			
			System.out.println("Different drop down text " + ele.getText());
			Thread.sleep(2000);	
			System.out.println("Value of dropdown is "+ ele.getText());
				sel.selectByVisibleText(ele.getText());
			}
	    
		Thread.sleep(2000);	
	    
	    driver.close();
	    
	}
}
