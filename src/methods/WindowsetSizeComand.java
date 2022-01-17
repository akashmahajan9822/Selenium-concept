package methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

public class WindowsetSizeComand extends ChromeDriverLaunch {

	// 1. Dimension class used for setSize() , getSize();
	// 2. point class used for set position of window set position()
	// 3.get position();

	public void demo() throws InterruptedException {

		driver.get("http://tutorialsninja.com/demo/");

		driver.manage().window().maximize(); //// Step-2maximize the window
		Thread.sleep(3000);

		driver.manage().window().fullscreen();
		Thread.sleep(6000);


		Dimension d = new Dimension(300, 650);
		driver.manage().window().setSize(d);

		Thread.sleep(6000);

		Dimension size = driver.manage().window().getSize();

		System.out.println("Height of window is: " + size.height);
		System.out.println("Width of window is: " + size.width);

		Thread.sleep(6000);

		Point p = new Point(100, 100);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		// zooming and zoomout
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// Zoomin
		jse.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(6000);
		// Zoomout
		jse.executeScript("document.body.style.zoom='50%'");

		Thread.sleep(10000);
		driver.manage().window().minimize(); // we can not minimize it will close automatically if we give minimize
		// command
		Thread.sleep(6000);

		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {

		WindowsetSizeComand ob = new WindowsetSizeComand();
		ob.launchBrowser();
		ob.demo();

	}

}
