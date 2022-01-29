package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.LoginPageTests;
import utility.utility;

public class DashboardPage {
	WebDriver driver;
	utility myutil = new utility();
	
	public DashboardPage() {
		// TODO Auto-generated constructor stub
	this.driver = LoginPageTests.driver;
	}
	
	//elements locator 
	private By welcomeLogo = By.id("welcome");
	
	
	public boolean IsDashboardDisplayed() {
		
		if(myutil.isElementVisible(welcomeLogo) == true)
		
							return true;
		else
				return false;
		
	}
	
	
	
	
	

}
