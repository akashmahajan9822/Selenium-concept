package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods extends ChromeDriverLaunch {

	public void practice() throws InterruptedException {

		
		
		//		1.	selectByVisibleText() Command
		 driver.get("http://omayo.blogspot.com/");
		              
		               //Write code here
		              WebElement dropdownField = driver.findElement(By.id("drop1"));
		              Select select = new Select(dropdownField);
		               select.selectByVisibleText("doc 3");
		               Thread.sleep(6000);
	
		       //         2.	selectByIndex() Command	               
		               
		               select.selectByIndex(1);
		               Thread.sleep(6000);
		  	    //           3.	selectByValue() Command        
		 	                   
		               select.selectByValue( "ghi");
		               
		    
//		             5.	getOption() Command
		          //   we can retrieve or get all options of droupdown field on web page.
		          //   It return tpe is list of web elements		               
		         
		               List<WebElement> options = select.getOptions();
		               
		               for(WebElement option : options) {
		                     
		                     System.out.println("get all options: "+ option.getText());
		                      }
          
		               
		               
		               
		               
		               
	           
		               //multiple window
		               
//		       		1.	selectByVisibleText() Command       
		    WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		              Select select2 = new Select(multiSelectionBoxField);
		               select2.selectByVisibleText("Audi");
		      
		               Thread.sleep(6000);
		               
		            //     2.	selectByIndex() Command	  
		               select2.selectByIndex(0);

		               Thread.sleep(6000);
		    //           3.	selectByValue() Command        
		               
		               select2.selectByValue("Hyundaix");
		   
		   //            11.deselectAll () Command              
		               
		               Thread.sleep(6000);
		               select2.deselectAll();
		               
		               
		                       
//	    4.	isMultiple() Command
//	     it show elemnt has multiselection command or not it return true or false
//	     for droup down show false and for multiple selection field show true

		               System.out.println(select.isMultiple());
		                       


//6.	getFirstSelectedOption() Command
//if we select multiple option in multi selection box field in particular order so tu retrieve the option as per the seen in web element page we can used 


		               select2.selectByVisibleText("Audi");

		               select2.selectByVisibleText("Volvo");
		                select2.selectByVisibleText("Hyundai");
		               
		               WebElement element = select2.getFirstSelectedOption();
		                      
		               System.out.println(element.getText());
		               Thread.sleep(7000);
		               select2.deselectAll();
		               
//	  7.	getAllSelectedOption() Command
//	  all selected option retrived.
//	   return type  list of web element
//	               
		               select2.selectByVisibleText("Audi");   Thread.sleep(3000);
		               select2.selectByVisibleText("Volvo");  Thread.sleep(3000);
		               select2.selectByVisibleText("Hyundai");  Thread.sleep(3000);
            
		   List<WebElement> selectedoptions = select2.getAllSelectedOptions();
		               
		           for(WebElement option : selectedoptions) {
		                     
		                 System.out.println(option.getText());
		              }

		           Thread.sleep(7000);
	               select2.deselectAll();
	//	 8.	deselectByVisibleText () Command              
		               
	               select2.selectByVisibleText("Volvo");  Thread.sleep(3000);
	               select2.selectByVisibleText("Hyundai");  Thread.sleep(3000);
	               select2.selectByVisibleText("Audi");  Thread.sleep(3000);
	              
	              Thread.sleep(3000);
	              
	               select2.deselectByVisibleText("Volvo");
	 
	               Thread.sleep(10000);
	               select2.deselectAll();
	               
	       //   9.	deselectByIndex () Command
		               
		               
	               select2.selectByVisibleText("Volvo");  Thread.sleep(3000);
	               select2.selectByVisibleText("Swift");  Thread.sleep(3000);
	               select2.selectByVisibleText("Hyundai");  Thread.sleep(3000);
	               select2.selectByVisibleText("Audi");  
	              
	              Thread.sleep(3000);
	              
	               select2.deselectByIndex(1);
	               Thread.sleep(10000);
	               select2.deselectAll();
		               
	  //        10.   deselectByValue () Command               
		               
	               select2.selectByVisibleText("Volvo");  Thread.sleep(3000);
	               select2.selectByVisibleText("Swift");  Thread.sleep(3000);
	               select2.selectByVisibleText("Hyundai");  Thread.sleep(3000);
	               select2.selectByVisibleText("Audi");  
	              
	              Thread. sleep(3000);
	              
	               select2.deselectByValue("Hyundaix");

	               Thread.sleep(10000);
	               
	               
	               select2.deselectAll();
		               
		               
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		SelectMethods ob=new SelectMethods();
		ob.launchBrowser();
		ob.practice(); 
	}
	
}
