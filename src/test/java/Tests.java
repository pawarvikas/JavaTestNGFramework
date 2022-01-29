import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SelLibrary.DriverManager;
import SelLibrary.DriverManagerFactory;



public class Tests {
	DriverManager driverManager;
	WebDriver driver;
	
  @Test
  public void navigateToGoogleTest() {
	  driverManager = DriverManagerFactory.getDriverManager("FIREFOX");
	  driver = driverManager.getWebDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	 // Assert.assertEquals("Google",driver.getTitle());
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  driver.findElement(By.id("btnLogin")).click();
	  
	  
	  
	  
  }
}
