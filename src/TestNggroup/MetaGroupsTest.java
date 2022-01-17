package TestNggroup;

import org.testng.annotations.Test;

public class MetaGroupsTest {
	
	@Test(groups = {"Group1"}) 
	public void m1() 
	{ 
	  System.out.println("m1-Group1"); 
	} 
	@Test(groups = "Group1") 
	public void m2()
	{ 
	   System.out.println("m2-Group1"); 
	 } 
	@Test(groups = {"Group2"}) 
	public void m3()
	{ 
	   System.out.println("m3-Group2"); 
	} 
	@Test(groups = {"Group3"}) 
	public void m4()
	{ 
	   System.out.println("m4-Group3"); 
	  } 

}
