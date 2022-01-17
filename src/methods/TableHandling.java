package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class TableHandling extends ChromeDriverLaunch {

public void program() throws InterruptedException {
		
	driver.get("http://omayo.blogspot.com");
	List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		
	System.out.println(names.size());
	int j=0;
	
	for(int i=0;i<names.size();i++) {
		System.out.println(names.get(i).getText());
		
		j = i;
		
		if(names.get(i).getText()=="Dheepthi") {
			
			break;
			
		}
		
	}
	System.out.println(j);
	String placeXPath = "//table[@id='table1']/tbody/tr["+j+"]/td[3]";
	
	String location = driver.findElement(By.xpath(placeXPath)).getText();
	
	System.out.println(location);
	driver.quit();
		
	}
	
	
	
public static void main(String[] args) throws InterruptedException {
	
	
		

		
	TableHandling ob=new TableHandling();
		ob.launchBrowser();
		ob.program();
	}
}
