package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggetiveDroupDownWindow extends ChromeDriverLaunch {

	
	public void program() throws InterruptedException {
		
		
		driver.get("https://www.makemytrip.com/");
		
		Actions a = new Actions(driver);
		
		
 a.moveToElement(driver.findElement(By.xpath("//img[@alt='Make My Trip']"))).click().build().perform();;
		
		driver.findElement(By.id("fromCity")).click();
		
		Thread.sleep(2000);
		
WebElement fromTextField = driver.findElement(By.xpath("//input[@placeholder='From']"));
		
		fromTextField.click();
		
		fromTextField.sendKeys("nas");
		
		for(int i=0;i<3;i++) {
			Thread.sleep(2000);
			fromTextField.sendKeys(Keys.DOWN);
			}
		
		Thread.sleep(2000);
		
		fromTextField.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(10000);
		
		System.out.println("/////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		driver.get("http://www.leafground.com/pages/autoComplete.html");

		WebElement textField = driver.findElement(By.id("tags"));

		textField.sendKeys("a");

		Thread.sleep(2000);

		Actions actions = new Actions(driver);

		actions.sendKeys(textField, Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		driver.quit();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		

		
		AutoSuggetiveDroupDownWindow ob=new AutoSuggetiveDroupDownWindow();
		ob.launchBrowser();
		ob.program();
	}
	
}
