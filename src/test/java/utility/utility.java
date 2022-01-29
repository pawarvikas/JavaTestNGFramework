
package utility;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.LoginPageTests;


public class utility {
	WebDriver driver = LoginPageTests.driver;
	
	
	public WebElement getWebElement(By userNameTextBox){
		
		return driver.findElement(userNameTextBox);
		
	}
	
	public boolean isElementVisible(By userNameTextBox) {
		return driver.findElement(userNameTextBox).isDisplayed();
	}
	
	

}
