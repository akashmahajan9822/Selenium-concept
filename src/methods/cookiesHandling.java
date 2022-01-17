package methods;

import java.util.Set;

import org.openqa.selenium.Cookie;

public class cookiesHandling  extends ChromeDriverLaunch{
	
	
	public void program() throws InterruptedException{
		
		 driver.get("http://tutorialsninja.com/demo/");
   
		 
		 // 1.  Set<Cookie> cookies = driver.manage().getCookies();      // get all cookies
        
		 
		 Set<Cookie> cookies = driver.manage().getCookies();    
        
         for(Cookie cookie : cookies ) {
               
        	 //Iterate cookies
        	 
                System.out.println("Cookie Name: " +cookie.getName());
                System.out.println("Cookie Value: " +cookie.getValue());
                System.out.println("Cookie Domain: " +cookie.getDomain());
                System.out.println("Cookie Path: " +cookie.getPath());
                System.out.println("Cookie Expiry Date: " +cookie.getExpiry());
                System.out.println("------------------" );
               
         }
		 
         //2  .getCookieNamed("OCSESSID");  get particular cookies 
         
         
         Cookie cookie = driver.manage().getCookieNamed("OCSESSID");
         
         System.out.println("Cookie Name: "+cookie .getName());
         System.out.println ("Cookie Value: "+cookie .getValue());
         System.out.println ("Cookie Domain: "+cookie .getDomain());
         System.out.println ("Cookie Path: "+cookie .getPath());
         System.out.println ("Cookie Expiry Date: "+cookie .getExpiry());
        
	
         //3. addCookie() Command     add cookie in browser
         
         //1st. create cookies manually
         Cookie cookie1 = new Cookie("akash","maa");   
         
         driver.manage().addCookie(cookie1);
         
         //4.deleteCookieNamed();
         
         driver.manage().deleteCookieNamed("language");
         
         
       ///5.  deleteCookie() Command
         
         driver.manage().deleteCookie(cookie);
         
     //6.   deleteAllCookies() Command
         driver.manage().deleteAllCookies();
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		cookiesHandling ob=new cookiesHandling();
		ob.launchBrowser();
		ob.program();
		
	}

}
