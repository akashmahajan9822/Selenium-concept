package locators;

import org.openqa.selenium.By;

public class info_xpath {
	
	
	
	
	/* absolute Xpath   and relative path

	•	/html/body/p[1] - locates the first p tag
	•	/html/body/p[2] - locates the second p tag


	*/
	  
	/*
	  •	All p tags having id 'para1' - /html/body/p[@id='para1']
	  •	All p tags having id 'para2' - /html/body/p[@id='para2']
	 	•	All p tags having class 'main' - /html/body/p[@class='main']
	 	•	All p tags having class 'sub' - /html/body/p[@class='sub']
	 	•	All p tags having id as 'para1' and class as 'main' - /html/body/p[@id='para1'][@class='main']


	Relative find xpath

	  •	//p[@id='para1'] - locates the paragraph having the id attribute value as 'para1'
	  •	//p[@id='para2'] - locates the paragraph having the id attribute value as 'para2'
	  •	//p[@class='main'] - locates the paragraph having the class attribute value as 'main'
	  •	//p[@class='sub'] - locates the paragraph having the class attribute value as 'sub'
	  •	//p[@id='para1'][@class='main'] - locates all the p tags having id as 'para1' and class as 'main'

          driver.findElement(By.xpath("//p[@id='para1']"));


	*/

}
