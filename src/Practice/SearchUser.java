package Practice;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import ObjectRepositories.AdminPage;
import ObjectRepositories.HomePage;
import ObjectRepositories.LoginPage;

@SuppressWarnings("unused")
public class SearchUser {
	
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
		String searchUserName = "Admin";
		adm.userNameTextBox().sendKeys(searchUserName);
		adm.searchButton().click();
				
		WebElement tableInPage = driver.findElement(By.id("tableWrapper"));
		WebElement userResult = tableInPage.findElement(By.cssSelector("td:nth-child(2)"));
		AssertJUnit.assertEquals(userResult.getText(), userName);
		
		hp.WelcomeLink().click();
		hp.LogoutLink().click();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
