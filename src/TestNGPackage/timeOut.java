package TestNGPackage;

import org.testng.annotations.Test;

public class timeOut {
	  @Test (priority=-1 ,timeOut=3000)
	  public void launch() throws InterruptedException {
		  Thread.sleep(5000);
		  System.out.println("This launch test annotation");
	  }
	  
	@Test  
	  public void login()  {
		  
		  System.out.println("This login test");
		  
		  }
	  @Test (priority=0)
	  public void checkDetails() {
		  
		  System.out.println("This checkDetails test annotation");
	  }
	
	  @Test (priority=4)
	  public void checkButton() {
		  
		  System.out.println("This checkButton test annotation");
	  }
	  @Test  (priority=5)
	  public void clickbutton() {
		  
		  System.out.println("This clickbutton test annotation");
	  }  
}
