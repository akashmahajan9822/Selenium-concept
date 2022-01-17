package methods;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BootstrapDropDown extends ChromeDriverLaunch {
	
	public void handlingBootstrapDropDown() throws InterruptedException {
		
  driver.get("https://www.hdfcbank.com/");
  
  
  driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
          
     List<WebElement> alloption= driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));    
        
	for(WebElement eachOption :alloption)	{
		
		if(eachOption.getText().equals("Home Insurance")) {
		eachOption.click();
      
		break;
		}
	}
     
     Thread.sleep(5000);
     driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		BootstrapDropDown ob=new BootstrapDropDown();
		ob.launchBrowser();
ob.handlingBootstrapDropDown();

	}
}
