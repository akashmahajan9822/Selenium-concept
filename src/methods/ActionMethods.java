package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionMethods extends ChromeDriverLaunch {

	
	
	
	public void program() throws InterruptedException {
		
		// 1.  keyDown() and keyUp() Commands
		System.out.println(" 1.  keyDown() and keyUp() Commands ");
		driver.get("http://omayo.blogspot.com/");
        
        WebElement compediumDevLink = driver.findElement(By.linkText("compendiumdev"));
       
        Actions actions = new Actions(driver);

        		
        // press on element and hold then released
       
        actions.moveToElement(compediumDevLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
     
        Keys.chord(Keys.UP,Keys.UP,Keys.ENTER);
        Keys.chord(Keys.CONTROL,"z");
        Keys.chord(Keys.F1);
        
		
        Thread.sleep(7000);
        
        
        // 2. sendKeys() Command of Actions Class	    // perform keyboard action
       
        System.out.println(" 2. sendKeys() Command of Actions Class ");
        driver.get("http://omayo.blogspot.com/");
        
        driver.findElement(By.name("userid")).sendKeys("arun");
       
     
       
        actions.sendKeys(Keys.TAB).build().perform();
       
        driver.findElement(By.name("pswrd")).sendKeys("motoori");
       
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
    
            Thread.sleep(3000);
		
		//step-6
		//Handle alert
		driver.switchTo().alert().accept();
		
        Thread.sleep(7000);
        
        //handle scrooldown
        driver.navigate().to("https://vctcpune.com/selenium/practice.html#");
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		driver.findElement(By.id("dropdown-class-example")).click();
		
		//Object creation of Action class
		
		
		actions.sendKeys(Keys.DOWN).perform(); Thread.sleep(1000);
		actions.sendKeys(Keys.DOWN).perform();Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();
		
        
		
		Thread.sleep(7000);
		
		 //  3.  chord() Command
		System.out.println(" 3.  chord() Command ");
        
        driver.get("http://omayo.blogspot.com/");
        
        Thread.sleep(1000);
        WebElement usernameField = driver.findElement(By.name("userid"));
       
        usernameField.sendKeys("arun");
       
        Thread.sleep(3000);
       
        usernameField.sendKeys(Keys.chord(Keys.CONTROL,"z"));
        
        Thread.sleep(7000);

        
//  4.  	contextClick()   right click
        
    	System.out.println("  4.  	contextClick()   right click ");
		 driver.get("http://omayo.blogspot.com");
        
         WebElement searchBoxField = driver.findElement(By.name("q"));
        
       actions.contextClick(searchBoxField).build().perform();
       Thread.sleep(7000);

    
       //5.    doubleClick() Command
       System.out.println("  5.    doubleClick() Command ");
       
       driver.get("http://omayo.blogspot.com");
       
       WebElement doubleClickOption = driver.findElement(By.id("testdoubleclick"));
      
  actions.doubleClick(doubleClickOption).build().perform();
  
  
        
	 Thread.sleep(7000);
	
	  // 6.   dragAndDrop() 
	
	 System.out.println("   6.   dragAndDrop()  ");
    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    
    WebElement osloBox = driver.findElement(By.id("box1"));
    WebElement norwayBox = driver.findElement(By.id("box101"));
  
    Thread.sleep(1000);
    actions.dragAndDrop(osloBox, norwayBox).build().perform();

    Thread.sleep(7000);
    
    
  //7.  dragAndDropBy() Command
    
    System.out.println("   7.  dragAndDropBy() Command  ");
    
    driver.get("https://jqueryui.com/draggable/");
    Thread.sleep(1000);
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	
	js1.executeScript("window.scrollBy(0,300)");
	
	WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']")); //Iframe identification
	
	driver.switchTo().frame(frame); //swicthing the frame
	
	
	WebElement dragObject=driver.findElement(By.id ("draggable"));
	
	actions.dragAndDropBy(dragObject, 200,100).perform();
	Thread.sleep(7000);
	
	
   
  
  //8.  moveToElement() Command - move mouse to target element

    System.out.println("  8.  moveToElement() Command   ");
    driver.get("http://omayo.blogspot.com/");
    
    WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
   
    Thread.sleep(5000);
    actions.moveToElement(blogsMenu).build().perform();
    
    
    
    Thread.sleep(7000);

    // validate double and right click
   
   driver.navigate().to("https://demoqa.com/buttons");
 	
 	WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));
 	WebElement rightClickButton=driver.findElement(By.id("rightClickBtn"));
 	
 	actions.doubleClick(doubleClickButton).perform();
 	Thread.sleep(1000);
 	
 	actions.contextClick(rightClickButton).perform();
 	
 	WebElement clickmenu = driver.findElement(By.xpath("//button[text()='Click Me']"));
 	Thread.sleep(3000);
 	   
   actions.moveToElement(clickmenu).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
 
   Thread.sleep(3000);
   
   
   
   //9. clickAndHold() 
   //10.moveByOffset(x offset, y offset)
   // Slider operation 
   
   driver.get("https://jqueryui.com/slider/");
	WebElement frame1=driver.findElement(By.xpath("//*[@class='demo-frame']"));
	
	driver.switchTo().frame(frame1);
	
	//step-6
	WebElement slider=driver.findElement(By.id("slider"));
	
	//Actions class
	Actions act=new Actions(driver);
	act.clickAndHold(slider).moveByOffset(50, 0).release().perform();
	
     // or

   Thread.sleep(1000);
  
   actions.dragAndDropBy( frame1, 10, 0).build().perform();
   Thread.sleep(7000);
   
   
    driver.quit();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		

		
		ActionMethods ob=new ActionMethods();
		ob.launchBrowser();
		ob.program();
	}

}
