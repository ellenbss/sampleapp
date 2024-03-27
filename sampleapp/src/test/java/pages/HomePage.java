package pages;

import org.openqa.selenium.By;

import metodos.Metodos;
import runner.Navegadores;

public class HomePage extends Navegadores{

	Metodos metodo = new Metodos ();
	 
	
	
	
	
			
	
	public void escolherPage(By elemento) {
		metodo.clicar(elemento);
	}
	
	
	
	
	
}
