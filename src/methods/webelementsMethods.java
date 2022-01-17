package methods;

import org.openqa.selenium.By;

public class webelementsMethods extends ChromeDriverLaunch   {

	
	//we get or retrieve the value of attribute
	
	public void methods() throws InterruptedException{
		
		 driver.get( "http://omayo.blogspot.com/");
		 
		 
		 
	//	 9.	getAttribute() Command 
        
 String textOnButton = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("value");
         
         System.out.println(textOnButton); 

  String textOnButton1 = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("title");
         System.out.println(textOnButton1); 

         String textOnButton2 = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("type");
                System.out.println(textOnButton2); 
       	
                String textOnButton3 = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("class");
                System.out.println(textOnButton3); 
       	
                String html = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("outerHTML");
             
                System.out.println(html); 
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");     
        //getTagName() Command   we can get or retrieve the tagname of any element of web page 
                
                Thread.sleep(5000);
             String tagName = driver.findElement(By.id("alert1")).getTagName();
                
                System.out.println(tagName);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
                
                
//11.	isDisplayed() Command
      // it show element on webpage is hidden or displayed 
         //       it show true or false only
                Thread.sleep(5000);
                boolean a = driver.findElement(By.id("but2")).isDisplayed();
                boolean b = driver.findElement(By.id( "hbutton")).isDisplayed();
               System.out.println(a );
               System.out.println(b );
               System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
               
               Thread.sleep(5000);
	//12.	isEnabled() Command  some buttons or elements are enable or disable  we can checked it return true or false.
               
 System.out.println(driver.findElement(By.xpath("//*[@id='but1']")).isEnabled());      
 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
 
 Thread.sleep(5000);
 
// 13.	isSelected() Command
// if 2 checkbox then which check box selected or not we can a identify 
// it return true or false

 System.out.println(driver.findElement(By.id("checkbox1")).isSelected());   
 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
 Thread.sleep(5000);
 
 
// 15.	getPageSource() Command
// to retrieve the source code of particular web page. We get html code on console.
//Return in the form of string so deta type string used
 driver.get("http://compendiumdev.co.uk/selenium/basic_web_page.html");
 String pageSource = driver.getPageSource();
 System.out.println(pageSource);

 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
 Thread.sleep(10000);
 driver.quit();
	
 
 
 
 
 
	
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {

		webelementsMethods ob=new webelementsMethods();
		ob.launchBrowser();
		ob.methods();
		
		
		
	}

}
