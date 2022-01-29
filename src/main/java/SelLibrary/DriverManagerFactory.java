package SelLibrary;

public class DriverManagerFactory {

	public enum DriverType {
		CHROME,FIREFOX,EDGE,IE;
	}
	
	public static DriverManager getDriverManager(String browser) {
		DriverManager driverManager;
		switch(browser) {
		case "CHROME":
			driverManager = new ChromeDriverManager();
			break;
		case "FIREFOX":
			driverManager = new FireFoxDriverManager();
			break;
		default:
			driverManager = new IEDriverManager();
			break;
		
		}
		return driverManager;
	}
	
}
