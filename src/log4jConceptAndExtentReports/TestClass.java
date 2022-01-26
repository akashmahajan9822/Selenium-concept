package log4jConceptAndExtentReports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class TestClass {
	WebDriver driver;
	
	int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
static	ExtentReports extend;
	@BeforeTest
	public void launchBrowser() throws Exception {
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		 extend = new ExtentReports();
		extend.attachReporter(reporter);
		System.out.println("Before Test");
	
	}
	
		
	
	@Test
	public void verifydashboard() {
		testID = 100;
		System.out.println("Test");
		
			Assert.fail();
		
	}
	
	@Test
	public void verifyorder() {
		testID = 200;
		System.out.println("Test");
		
		Assert.assertEquals(true, true);
		
	}
	
	@AfterMethod
	public void logoutAccount(ITestResult result) throws InterruptedException, IOException {
		if(ITestResult.FAILURE == result.getStatus())
		{
			System.out.println("screenshot method call");
		}
		Thread.sleep(10000);
		System.out.println("After Method");
		
	}
	
	
	@AfterTest
	public void closedBrowser() {
		System.out.println("After Test");
		
		extend.flush();
		
		System.gc();
	}
}
