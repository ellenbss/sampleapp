package drivers;

import org.openqa.selenium.WebDriver;

public class DriversFactory {
	
	protected static WebDriver driver;
	
	public static WebDriver driver() {
		return driver;
	}

}
