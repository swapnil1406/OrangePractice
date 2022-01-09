package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
	
	WebDriver driver;
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	By adminLink = By.id("menu_admin_viewAdminModule");
	By userRoleScroll = By.id("systemUser_userType");
	By addUserButton = By.id("btnAdd");
	By employeeNameTextBox = By.id("systemUser_employeeName_empName");
	By employeeUserNameTextBox = By.id("systemUser_userName");
	By employeePasswordTextBox = By.id("systemUser_password");
	By employeeConfirmedPasswordTextBox = By.id("systemUser_confirmPassword");
	By saveButton = By.id("btnSave");
	
	public WebElement adminLink() {
		return driver.findElement(adminLink);	
	}

	public WebElement addUserButton() {
		return driver.findElement(addUserButton);	
	}
	
	public WebElement userRoleScroll() {
		return driver.findElement(userRoleScroll);	
	}
	
	public WebElement employeeNameTextBox() {
		return driver.findElement(employeeNameTextBox);	
	}
	
	public WebElement employeeUserNameTextBox() {
		return driver.findElement(employeeUserNameTextBox);	
	}
	
	public WebElement employeePasswordTextBox() {
		return driver.findElement(employeePasswordTextBox);	
	}
	
	public WebElement employeeConfirmedPasswordTextBox() {
		return driver.findElement(employeeConfirmedPasswordTextBox);	
	}
	
	public WebElement saveButton() {
		return driver.findElement(saveButton);	
	}

}