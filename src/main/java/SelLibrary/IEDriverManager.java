package SelLibrary;


import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEDriverManager extends DriverManager{

	@Override
	protected void createWebDriver() {
		// TODO Auto-generated method stub
		//ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.iedriver().driverVersion("21H2").setup();
		this.driver = new InternetExplorerDriver();
	}
	
	

}
