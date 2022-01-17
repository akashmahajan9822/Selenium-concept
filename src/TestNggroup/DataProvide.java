package TestNggroup;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	
	@BeforeTest
	public void beforeMethod() {
		
	System.out.println("Before Test ");
		
	}
	  
	  @Test (dataProvider="TestData")
	   public void login(String value) {
		  
		  System.out.println("Login test TestClass3 " + "DataProvider Value :" + value);
		  
	  }
	  
	  @DataProvider(name="TestData")
	  public String[] getData(){
		  
		  String[] data=new String[4];
		  data[0]="One";
		  data[1]="Second";
		  data[2]="Third";
		  data[3]="Fourth";
		  
		  return data;
		  
	  }

}
