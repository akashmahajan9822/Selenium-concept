package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandalDroupDownGenericWay extends ChromeDriverLaunch   {
	
	
	//we can used single select class for all droupdown
	
	
	public void genericWay() {
		
		driver.get("");
		WebElement DroupDown1= driver.findElement(By.xpath(""));//read droupdown1
		SelectOPtion(DroupDown1,"value"); //move droupdown1 with
		WebElement DroupDown2= driver.findElement(By.xpath(""));
		SelectOPtion(DroupDown2,"value");
		WebElement DroupDown3= driver.findElement(By.xpath(""));
		SelectOPtion(DroupDown3,"value");
		WebElement DroupDown4= driver.findElement(By.xpath(""));
		SelectOPtion(DroupDown4,"value");
	}
	
	
	
	public static void SelectOPtion(WebElement webelement , String value){
		
		Select droupdown=new Select(webelement);
		
		  List<WebElement>allValue =droupdown.getOptions();
		  for(WebElement selectoption : allValue ) {
			  
			  if(selectoption.equals("matchValue"))
			  {
				  selectoption.click();
				  break;
			  }
			  
			  
		  }
		
		
	}
	
	
	public static void main(String [] args) throws InterruptedException {
		
		HandalDroupDownGenericWay ob=new HandalDroupDownGenericWay();
		ob.launchBrowser();
		
		
	}

}
