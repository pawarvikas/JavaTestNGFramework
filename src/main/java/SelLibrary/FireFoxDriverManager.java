package SelLibrary;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxDriverManager extends DriverManager  {
	@Override
	protected void createWebDriver() {
		// TODO Auto-generated method stub
	

		FirefoxOptions firefoxoptions = new FirefoxOptions();
		WebDriverManager.firefoxdriver().driverVersion("96.0.1").setup();
		this.driver = new FirefoxDriver(firefoxoptions);
	}
}
