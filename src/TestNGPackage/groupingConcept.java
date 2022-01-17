package TestNGPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupingConcept {
	
	@BeforeTest
	public void beforeMethod() {
		
	System.out.println("Before Test ");
		
	}
	
  @Test (groups={"Sanity", "Regression"})
  public void testCase1() {
	  
	  System.out.println("This is my first test case ");
	  
  }
  
  @Test   (groups="Regression")
   public void testCase2() {
	  
	  System.out.println("This is my 2 test case ");
	  
  }
  @Test  (groups="Sanity")
   public void testCase3() {
		  
		  System.out.println("This is my 3 test case ");
		  
	  }
}
