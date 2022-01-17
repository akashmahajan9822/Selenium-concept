package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class webdriverMethods extends ChromeDriverLaunch  {

	
	public  void mains() throws InterruptedException {
		
//		18.	getSize() Command
//		  
//		we can get the size of any element of web element  also by window
		  
		   driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		
		Dimension d = driver.findElement(By.name("search")).getSize();
        
        System.out.println("Height of search box field is: "+d .height);
        System.out.println("Width of search box field is: "+d .width);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        Thread.sleep(5000);
        
        driver.get("http://omayo.blogspot.com/");
//        
//        19.	getLocation() Command
//        we can get the location of any element on web page

        Point point = driver.findElement(By.id("ta1")).getLocation();
        
        System.out.println("Height of the text area field is: "+point.x);
        
        System.out.println("Width of the text area field is: "+point.y);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        Thread.sleep(5000);
        
       
        
//        20.	getCSSValue() Command
//        get css property of web elements under the style tag in dom structure.
//         
                      
                       //Write code here
   String lineHeight = driver.findElement(By.id("home")).getCssValue("line-height");
                      
                     System.out.println(lineHeight);

                     
   String fontweight = driver.findElement(By.id("home")).getCssValue("font-weight");
                     
                     System.out.println(fontweight);
                    
  String textalign = driver.findElement(By.id("home")).getCssValue("text-align");
                     
                     System.out.println(textalign);
            
                     
                     
                   
                      System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
                      Thread.sleep(5000);
                      
                      
                      
                      
                      
                      
//21.	getClass() Command
//
//1.	Returns the runtime class of this Object. The returned Class object is the object that is locked by static synchronized methods of the represented class.
//2.	 which class object, the driver object referring is return in the form of class
//3.	getSimpleName();    It return in the form of string
//4.	.getClass() no of method we used with class 

                      String className = driver.getClass().getSimpleName();
                      
                      System. out.println(className);
                      Thread.sleep(10000);
                      
                      driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		webdriverMethods ob=new webdriverMethods();
		ob.launchBrowser();
		ob.mains();
	}

}
