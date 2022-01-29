package SelLibrary;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void createWebDriver() {
		// TODO Auto-generated method stub
		/*ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\Vikas\\eclipse-workspace\\MyFrame\\drivers\\chromedriver.exe");
		this.driver = new ChromeDriver(options);*/
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().driverVersion("97.0.4692.71").setup();
		this.driver = new ChromeDriver(chromeOptions);
	}
	
	

}
