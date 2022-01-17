package methods;

import org.openqa.selenium.By;

public class Authontication extends ChromeDriverLaunch {
	
	public void program() throws InterruptedException {
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	
		
		
		
	}
	
public static void main(String[] args) throws InterruptedException {
		

		
	Authontication ob=new Authontication();
		ob.launchBrowser();
		ob.program();
	}


}
