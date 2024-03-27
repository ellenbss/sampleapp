package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegadores extends DriversFactory {

	public static void abrirNavegador() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com");
		driver.manage().window().maximize();
}

	public static void fecharNavegador() {
		driver.close();
	}
	
}
