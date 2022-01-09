package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By adminLink = By.id("menu_admin_viewAdminModule");
	By pimLink = By.id("menu_pim_viewPimModule");
	By leaveLink = By.id("menu_leave_viewLeaveModule");
	By timeLink = By.id("menu_time_viewTimeModule");
	By recruitmentLink = By.id("menu_recruitment_viewRecruitmentModule");
	By myInfoLink = By.id("menu_pim_viewMyDetails");
	By perfoLink = By.id("menu__Performance");
	By dashboardLink = By.id("menu_dashboard_index");
	By directoryLink = By.id("menu_directory_viewDirectory");
	By maintenanceLink = By.id("menu_maintenance_purgeEmployee");
	By buzzLink = By.id("menu_buzz_viewBuzz");
	By WelcomeLink = By.id("welcome");
	By LogoutLink = By.linkText("Logout");
	
		public WebElement adminLink() {
		return driver.findElement(adminLink);
	}
		public WebElement pimLink() {
		return driver.findElement(pimLink);
	}
		public WebElement leaveLink() {
		return driver.findElement(leaveLink);
	}
		public WebElement timeLink() {
		return driver.findElement(timeLink);
	}
		public WebElement recruitmentLink() {
		return driver.findElement(recruitmentLink);
	}
		public WebElement myInfoLink() {
		return driver.findElement(myInfoLink);
	}
		public WebElement perfoLink() {
		return driver.findElement(perfoLink);
	}
		public WebElement dashboardLink() {
		return driver.findElement(dashboardLink);
	}
		public WebElement directoryLink() {
		return driver.findElement(directoryLink);
	}
		public WebElement maintenanceLink() {
		return driver.findElement(maintenanceLink);
	}
		public WebElement buzzLink() {
		return driver.findElement(buzzLink);
	}
		public WebElement WelcomeLink() {
			return driver.findElement(WelcomeLink);
	}		
		public WebElement LogoutLink() {
			return driver.findElement(LogoutLink);
	}

}
