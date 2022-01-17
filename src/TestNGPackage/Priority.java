package TestNGPackage;

import org.testng.annotations.Test;


/*  1. priority  -ve , no priority , zero , +priority
 * 2. in no priority and zero priority depend on alphabetical order
 * 3. in no priority and positive execute  no priority 1st using alphabetical order
 * 
*/

public class Priority {
	
	  @Test (priority=-1)
	  public void launch() {
		  
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
