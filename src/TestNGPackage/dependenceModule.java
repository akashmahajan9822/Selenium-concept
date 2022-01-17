package TestNGPackage;

import org.testng.annotations.Test;

public class dependenceModule {

	  @Test (priority=-1)
	  public void launch() {
		  
		  System.out.println("This launch test annotation");
	  }
	  
	@Test  
	  public void login()  {
		  
		  System.out.println("This login test");
		  
		  }
	  @Test (priority=0 , dependsOnMethods="login")
	  public void checkDetails() {
		  
		  System.out.println("This checkDetails test annotation");
	  }
	    // bz of dependsOnMethod 
//  even if checkButton has priority=4 and clickbutton has priority=5 , clickbutton execute 1st.
// used priority alwayse to define flow of execution if depend on other then used depends on	
	 
	  @Test (  priority=4)
	  public void checkButton() {
		  
		  System.out.println("This checkButton test annotation");
	  }
	  @Test  (priority=5)
	  public void clickbutton() {
		  
		  System.out.println("This clickbutton test annotation");
	  }

}
 