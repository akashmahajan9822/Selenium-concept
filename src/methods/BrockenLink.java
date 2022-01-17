package methods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/// not completed

public class BrockenLink extends ChromeDriverLaunch {
	
	
	static	int  countBrockenLink;
	
	public  void mains() throws InterruptedException, IOException {
		
		driver.get("http://www.deadlinkcity.com/");
		
	List<WebElement>	 alllinks = driver.findElements(By.tagName("a"));
	
	
   List<String>urlarray=new ArrayList<String>();  //make array list of element
		for(WebElement e:alllinks) {
			
			
			
			String url1=e.getAttribute("href");
			
			if(url1==null|| url1.isEmpty()) {
				
				System.out.println(url1+  "url is impty");
				continue;
			}
			else {
			
			
			URL url=new URL(url1);   // obj of url class
			
			//1. create type cast of HttpURLConnection
			//2.used openconnection() methd
			//3.connect() method
			
			HttpURLConnection httpcon= (HttpURLConnection) url.openConnection();
			httpcon.connect();
			if(httpcon.getResponseCode()>=400) {
				System.out.println(httpcon.getResponseCode()+" is broken link");
				countBrockenLink++;
			}
			else {
				System.out.println(httpcon.getResponseCode()+" is valid link");
			}
			
			}}
		
		System.out.println(countBrockenLink+" total broken link");
	}
		
	
		
		
		
		
		
		
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		BrockenLink ob=new BrockenLink();
		ob.launchBrowser();
		ob.mains();
	}

}
