package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	
	//Webelemnt on webpage
	 @FindBy(id="txtUsername")
	 private WebElement username;
	 
	 @FindBy(xpath="//*[@id='txtPassword']")
	 private WebElement password;
	 
	 @FindBy(xpath="//*[@id='btnLogin']")
	 
	 // Initialized web element
	 private WebElement loginButton;
	 
	 LoginPageClass(WebDriver driver) {
		 
		 PageFactory.initElements(driver, this);
		 
		 
	 }
	 
	 public void login() {
		 
		 username.sendKeys("Admin");
		 password.sendKeys("admin123");
		 loginButton.click();
		 
		 
	 }
	

}
