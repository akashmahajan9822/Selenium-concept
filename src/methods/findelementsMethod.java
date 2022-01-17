package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class findelementsMethod extends ChromeDriverLaunch {
	
	
	public void practice() throws InterruptedException {
		
		driver.get( "http://omayo.blogspot.com/");
		 WebElement textArea = driver.findElement(By.id( "ta1"));
		 
		System.out.println(textArea);
		
		System.out.println("end ");
		
		// list all button tagname element
		
		//List<WebElement>   return type of web elements are list
		//so this data type we can used to store the elements
		
		
      //  List<WebElement> elements = driver.findElements(By.tagName("a"));
        List<WebElement> elements1 = driver.findElements(By.xpath("//a"));
        
        System.out.println(elements1.size());
        for(WebElement element : elements1) {
              
              System.out.println(element.getText());
}    
        
        Thread.sleep(6000);
        driver.close();

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		
		
		findelementsMethod ob=new findelementsMethod();
	ob.launchBrowser();
ob.practice();
	}

}
