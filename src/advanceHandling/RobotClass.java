package advanceHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**Methods to implement the Robot class
To implement the Robot class, we require a few methods that help in easy execution of test scripts. We have: 

KeyPress()  robot.keyPress(keyEvent.VK_UP);
KeyRelease() robot.keyRelease(keyEvent.VK_CAPS_LOCK);
MouseMove()  robot.mouseMove(coordinates.get.X(),coordinates.get.Y());
MousePress()  robot.mousePress(InputEvent.BUTTON1_MASK);
MouseRelease() robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK) 

**/

public class RobotClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {	
     
//		 System.setProperty("webdriver.gecko.driver", "C:\\Selenium jar\\firefoxDriver\\geckodriver.exe");
//			 driver = new FirefoxDriver();	
//        driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
//        driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	
//     
//        Robot robot = new Robot();  // Robot class throws AWT Exception	
//        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
//     
//        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
//        
//        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
//        robot.keyPress(KeyEvent.VK_TAB);	
//        Thread.sleep(2000);	
//        robot.keyPress(KeyEvent.VK_TAB);	
//        Thread.sleep(2000);	
//        robot.keyPress(KeyEvent.VK_TAB);	
//        Thread.sleep(2000);	
//        robot.keyPress(KeyEvent.VK_ENTER);	
//    // press enter key of keyboard to perform above selected action	
       
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
			
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
         
        //Enter username 
        driver.findElement(By.name("email")).sendKeys("Selenium123@gmail.com");
         
        //create object of Robot class
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_SHIFT);  
         
        //Enter password
        driver.findElement(By.name("pass")).sendKeys("Selenium123");
         
        //Hit Enter of keyboard using Robot Class
         r.keyPress(KeyEvent.VK_ENTER);
         
        //Release Enter
         r.keyRelease(KeyEvent.VK_ENTER);
         
         
 
        }
   

}
