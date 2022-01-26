package log4jConceptAndExtentReports;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;





public class GenerateReportONTEST {
	
	static ExtentReports extent;
	static	ExtentHtmlReporter reporter;
	static	ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
			extent=new ExtentReports();
		extent.attachReporter(reporter);
		
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
			
			System.out.println("take screenshot");
		}
		
		
//		if(result.getStatus()==ITestResult.FAILURE){
//			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
//			test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
//			
//		//	String screenshotPath = FreeCRMTest.getScreenshot(driver, result.getName());
//		//	test.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
//			//extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
//		}
//		else if(result.getStatus()==ITestResult.SKIP){
//			test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
//		}
//		else if(result.getStatus()==ITestResult.SUCCESS){
//			test.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
//		
	}

	@AfterTest
	public void end() {
		
		extent.flush();
	}
}
