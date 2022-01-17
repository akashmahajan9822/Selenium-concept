package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class order {
  @Test
  public void f() {
	  
	  System.out.println("This @Test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This @Before Method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This @After Method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This @Before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This @After class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("This @Before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This @After test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This @Before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This @After suite annotation");
  }

}
