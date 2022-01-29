package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.LoginPage;
import SelLibrary.DriverManager;
import SelLibrary.DriverManagerFactory;



public class LoginPageTests {
	DriverManager driverManager;
	public static WebDriver driver;
	LoginPage loginPage;
	DashboardPage homePage;
	
	@BeforeClass
	public void setUp() {
		 driverManager = DriverManagerFactory.getDriverManager("CHROME");
		 driver = driverManager.getWebDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	@BeforeTest
	public void startUp() {
		 // this.driver = driverManager.getWebDriver();
		  //driver.get("https://opensource-demo.orangehrmlive.com/");	
	}
	
	
	

	
	
	
	@Test
	public void loginTest() {
		loginPage = new LoginPage(driver);
		loginPage.login("Admin", "admin1234");
		assertEquals(loginPage.getLoginErrorMessage(),"Invalid credentials");		
	}
	

	@Test
	public void validLoginTest() {
		loginPage = new LoginPage(driver);
		loginPage.login("Admin", "admin123");
		//assertEquals(loginPage.getLoginErrorMessage(),"Invalid credentials");	
		homePage = new DashboardPage();
		assertEquals(homePage.IsDashboardDisplayed(),true);
		
		
	}
	
	
	
	@AfterTest
	public void KillDriver() {
		driver.quit();
	}
	
	
}
