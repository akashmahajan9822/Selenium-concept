package TestNGPackage;

import org.testng.annotations.Test;

public class inocationCounts {
	@Test 
	  public void login()  {
		  
		  System.out.println("This login test");
		  
		  }
	  @Test (priority=2)
	  public void checkDetails() {
		  
		  System.out.println("This checkDetails test annotation");
	  }
	  @Test (priority=1, invocationCount=3)
	  public void launch() {
		  
		  System.out.println("This launch test annotation");
	  }
	  @Test (priority=4)
	  public void checkButton() {
		  
		  System.out.println("This checkButton test annotation");
	  }
	  @Test (priority=5)
	  public void checktab() {
		  
		  System.out.println("This checktab test annotation");
	  }
}
