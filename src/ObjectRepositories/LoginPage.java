package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	By userNameText = By.id("txtUsername");
	By passwordText = By.id("txtPassword");
	By loginButton = By.id("btnLogin");
	
	public WebElement userNameText() {
		return driver.findElement(userNameText);	
	}

	public WebElement passwordText() {
		return driver.findElement(passwordText);	
	}
	
	public WebElement loginButton() {
		return driver.findElement(loginButton);	
	}

}