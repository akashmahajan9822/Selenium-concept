package TestNggroup;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Listeners(TestNggroup.TestNgListenerMethods.class)
public class listner {
	 SoftAssert sa;
	@BeforeTest
	public void beforeMethod() {
		
	System.out.println("Before Test ");
		
	}
	
	@Test (groups="Sanity")
	  public void navigate() {
		  
		 System.out.println("Navigate-Statemnt 1 ");
		 
		
		 sa=new SoftAssert();
		 sa.assertEquals(true, true);
		 sa.assertEquals("abc", "xyz");
		
		  System.out.println("fail this test ");
		  
		  sa.assertAll();
		  
	  }
	  
	 @Test ( enabled= false)
	  public void checkDetails() {
		  
		  System.out.println("skip method");
	  }
	 
	  @Test (groups={"Regression", "Sanity"})
	   public void login() {
		  
		  System.out.println("Login test TestClass3 ");
		  
	  }
	@Test  (dependsOnMethods="navigate")
  public void verifyPage() {
		  
		  System.out.println("Verify Page Test");
		  
	  }
  

}
