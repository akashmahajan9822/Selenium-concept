package TestNGPackage;


import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
 
public class enable {
	
	  @Test (priority=-1)
	  public void launch() {
		  
		  System.out.println("This launch test annotation");
	  }
	  
	
//	@Test  
//	  public void login() throw  new SkipException("login skip test")  {
//		  
//		  System.out.println("This login test");
//		  
//		  }
	
	
	//folowing test case skip out of 5 only 4 execute
	  @Test (priority=0 , enabled= false)
	  public void checkDetails() {
		  
		  System.out.println("This checkDetails test annotation");
	  }
	
	  @Test (priority=4)
	  @Ignore
	  public void checkButton() {
		  
		  System.out.println("This checkButton test annotation");
	  }
	  @Test  (priority=5)
	  public void clickbutton() {
		  
		  System.out.println("This clickbutton test annotation");
	  
}
}