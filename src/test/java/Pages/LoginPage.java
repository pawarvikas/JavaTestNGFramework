package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.utility;


public class LoginPage {
WebDriver driver;
utility myutil = new utility();
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//elements locator 
	private By userNameTextBox = By.id("txtUsername");
	private By userPasswordTextBox = By.id("txtPassword");
	private By userLoginButton = By.id("btnLogin");
	private By userLoginErrorMessage = By.id("spanMessage");
	
	
	
	//perform login
	public void login(String userName,String password) {
		this.setUserName(userName);
		this.setPassword(password);
		this.clickLogin();
		
	}
	
	
	public void setUserName(String userName) {
		//driver.findElement(userNameTextBox).sendKeys(userName);
		myutil.getWebElement(userNameTextBox).sendKeys(userName);
		
		
	}
	
	public void setPassword(String password) {
		//driver.findElement(userPasswordTextBox).sendKeys(password);
		myutil.getWebElement(userPasswordTextBox).sendKeys(password);
	}
	
	public void clickLogin() {
		//driver.findElement(userLoginButton).click();
		myutil.getWebElement(userLoginButton).click();
		//DashboardPage dashboardPage = new DashboardPage();
		
	}
	
	public String  getLoginErrorMessage() {
		//return driver.findElement(userLoginErrorMessage).getText();
		return myutil.getWebElement(userLoginErrorMessage).getText();
	}
	

}
