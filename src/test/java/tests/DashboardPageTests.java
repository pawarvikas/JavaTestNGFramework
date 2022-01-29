package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.LoginPage;
import SelLibrary.DriverManager;
import SelLibrary.DriverManagerFactory;

public class DashboardPageTests {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	DriverManager driverManager;
	
	
	
	
	
	@BeforeTest
	public void startUp() {
		
		 //driverManager = DriverManagerFactory.getDriverManager("CHROME");
		 
			driver = driverManager.getWebDriver();
			  driver.get("https://opensource-demo.orangehrmlive.com/");	
		
	}
	
	
	@Test
	public void checkHeaders() {
		loginPage.login("Admin", "admin123");
		
		
	}

}
