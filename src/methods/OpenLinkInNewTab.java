package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class OpenLinkInNewTab  extends ChromeDriverLaunch{
	
	public void program() {
		
		driver.get("https://www.nopcommerce.com/en/demo");
		String send=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("(//a[text()='Partners'])[1]")).sendKeys(send);
		
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {

		OpenLinkInNewTab ob=new OpenLinkInNewTab();
		ob.launchBrowser();
		ob.program();

	}

}
