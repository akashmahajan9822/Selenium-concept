package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromeDriverfor96.0\\\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin123");
		d.findElement(By.id("btnLogin")).click();
		  // d.findElement(By.linkText("Forgot your password?")).click(); 
/*
		 Thread.sleep(8000);
		d.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click(); 
		
		Thread.sleep(8000);
		d.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click(); 
			
		 Thread.sleep(8000);
		d.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click(); 
		
		
		 Thread.sleep(8000);
			d.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']")).click(); 
			
			Thread.sleep(8000);
			d.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']")).click(); 
				
			 Thread.sleep(8000);
			d.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click(); 
			
			
			 Thread.sleep(8000);
			d.findElement(By.xpath("//a[@id='menu__Performance']")).click(); 
				
				Thread.sleep(8000);
			d.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click(); 
					
				 Thread.sleep(8000);
		d.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click(); 
				
		
				 Thread.sleep(8000);
			d.findElement(By.xpath("//a[@id='menu_maintenance_purgeEmployee']")).click(); 
					
					Thread.sleep(8000);
			d.findElement(By.xpath("//a[@id='menu_buzz_viewBuzz']")).click(); 
						
					 Thread.sleep(8000);

					 d.close();
*/

		d.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click(); 
		
		Thread.sleep(8000);

		d.findElement(By.xpath("//a[@id='menu_leave_assignLeave']")).click(); 
		
		Thread.sleep(8000);

		d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[1]")).click(); 
		 Thread.sleep(800);
		 
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[2]")).click(); 
		 Thread.sleep(800);
		 
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[3]")).click(); 
		 Thread.sleep(800);
		 
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[4]")).click(); 
		 Thread.sleep(800);
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[5]")).click(); 
		 Thread.sleep(800);
		 
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[6]")).click(); 
		 Thread.sleep(800);
		 
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[7]")).click(); 
		 Thread.sleep(800);
		 
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[8]")).click(); 
 Thread.sleep(800);
		 
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[9]")).click(); 
		 Thread.sleep(800);
		 
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[10]")).click(); 
 Thread.sleep(800);
		 
		 d.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']//option[11]")).click(); 
	
		 Thread.sleep(8000);
		 
		 d.close();
		 
	}

}