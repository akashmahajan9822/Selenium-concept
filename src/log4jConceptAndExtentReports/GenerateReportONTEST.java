package log4jConceptAndExtentReports;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.LogStatus;




@Listeners(extendReport.ExtentTestNGIReporterListener.class)
public class GenerateReportONTEST {
	
	static ExtentReports extent;
	static	ExtentHtmlReporter reporter;
	static	ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
			extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host Name", "Akash ");
		extent.setSystemInfo("User Name", "Akash Mahajan");
		extent.setSystemInfo("Environment", "QA");
	}
	
	@Test
	public void testcase1() {
		
		Assert.assertEquals(false, true);
		
	}
	@Test
public void testcase2() {
		
		Assert.assertEquals(true, true);
	}
	@Test
public void testcase3() {
	
	Assert.assertEquals(false, false);
}
	@Test
public void testcase4() {
	
	Assert.assertEquals(false, true);
}
	@Test
public void testcase5() {
	
	Assert.assertEquals(false, false);
}
	@AfterMethod
	public void MonitorResult(ITestResult result) {
		System.out.println(result.getStatus());
		
		if(result.getStatus()==ITestResult.FAILURE){  
			//test.log(LogStatus.FAIL, "Test Case SKIPPED IS " + result.getName());
		
		
			
		}
		//else {test.log(LogStatus.PASS, "Test Case SKIPPED IS " + result.getName());}
		
	
	}

	@AfterTest
	public void end() {
		
		extent.flush();
	}
}
