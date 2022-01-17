package TestNggroup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestNgListenersClass extends screenshotbylistner implements ITestListener{

	
	
	

	@Override
	public void onTestFailure(ITestResult result) {
	
		
		
		System.out.println("1time");
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File source=tsc.getScreenshotAs(OutputType.FILE);
		
		File destination=new File(System.getProperty("user.dir")+"\\Screenshots\\snaps1.png");
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	

}
