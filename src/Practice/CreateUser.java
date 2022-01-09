package Practice;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ObjectRepositories.AdminPage;
import ObjectRepositories.HomePage;
import ObjectRepositories.LoginPage;

public class CreateUser {
	
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://opensource-demo.orangehrmlive.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void test() {
		
		String userName = "Admin";
		String userPassword = "admin123";
		
		LoginPage olp = new LoginPage(driver);
		olp.userNameText().sendKeys(userName);
		olp.passwordText().sendKeys(userPassword);
		olp.loginButton().click();
		
		HomePage hp = new HomePage(driver);
		hp.adminLink().click();
		
		AdminPage adm = new AdminPage(driver);
		adm.addUserButton().click();
		
		String userType = "1";
		WebElement staticDropdown = adm.userRoleScroll();
		Select dropdown1 = new Select(staticDropdown);
		dropdown1.selectByValue(userType);
		
		String employeeName = "Admin A";
		String employeeUserName = "sysadmin1";
		String employeePassword = "admin123";
		String employeeConfirmedPassword = "admin123";
		
		adm.employeeNameTextBox().sendKeys(employeeName);
		adm.employeeUserNameTextBox().sendKeys(employeeUserName);
		adm.employeePasswordTextBox().sendKeys(employeePassword);
		adm.employeeConfirmedPasswordTextBox().sendKeys(employeeConfirmedPassword);
		adm.saveButton().click();
		
		hp.WelcomeLink().click();
		hp.LogoutLink().click();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
