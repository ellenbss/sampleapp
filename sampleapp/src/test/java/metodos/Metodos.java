package metodos;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By elemento, String texto) {
		driver().findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver().findElement(elemento).click();

	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver().findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);

	}

	public void mouseOver(By elemento, String passo) {
		WebElement element = driver.findElement(elemento);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public void clicarPorTexto(String atributo, String texto) {

		driver.findElement(By.xpath("//" + atributo + texto + "]")).click();
	}

	
	public void tempoEspera () {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
