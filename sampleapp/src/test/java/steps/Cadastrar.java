package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import drivers.DriversFactory;
import elementos.Elementos;
import metodos.Metodos;
import pages.HomePage;
import runner.Navegadores;

public class Cadastrar extends DriversFactory {

	HomePage home = new HomePage();
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void iniciarTeste() {
		Navegadores.abrirNavegador();
		home.escolherPage(By.id("nav_automobile"));

	}

	@After
	public void encerrar() {
	Navegadores.fecharNavegador();

	}

	@Test
	public void cadastrar() {
		// Passo Enter Vehicle Data
		metodo.clicar(el.make);
		metodo.clicarPorTexto("option[@value=", "'BMW'");
		metodo.escrever(el.kw, "2");
		metodo.escrever(el.dateOfManufacture, "05/02/2020");
		metodo.clicar(el.numberOfSeats);
		metodo.clicarPorTexto("option[@value=", "'3'");
		metodo.clicar(el.fuelType);
		metodo.clicarPorTexto("option[@value=", "'Petrol'");
		metodo.escrever(el.listPrice, "8000");
		metodo.escrever(el.licensePlateNumber, "0324682");
		metodo.escrever(el.annualMileage, "100.000");
		metodo.clicar(el.btnNext);

		// Passo Enter Insurant Data
		metodo.escrever(el.firstname, "Ellen");
		metodo.escrever(el.lastName, "Santos");
		metodo.escrever(el.birthdate, "07/30/1995");
		metodo.clicar(el.gender);
		metodo.escrever(el.streetAdress, "Rua São João");
		metodo.clicarPorTexto("option[@value=", "'Brazil'");
		metodo.escrever(el.zipCode, "04625050");
		metodo.escrever(el.city, "São Paulo");
		metodo.clicarPorTexto("option[@value=", "'Selfemployed'");
		metodo.clicar(el.hobbies);
		metodo.escrever(el.webSite, "teste.com");
		metodo.escrever(el.pictur,"C:/Users/55119/OneDrive/Área de Trabalho/Imagem do WhatsApp de 2023-08-30 à(s) 18.10.13.jpg");
		metodo.clicar(el.btnNextInsurant);

		// Passo Enter Product Data
		metodo.escrever(el.starDate, "03/26/2025");
		metodo.clicarPorTexto("option[@value=", "'5000000'");
		metodo.clicarPorTexto("option[@value=", "'Super Bonus'");
		metodo.clicarPorTexto("option[@value=", "'Partial Coverage'");
		metodo.clicar(el.optionalProducts);
		metodo.clicarPorTexto("option[@value=", "'No'");
		metodo.clicar(el.btnNextProduct);

		// Passo Select Pric Option
		metodo.clicar(By.xpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[1]/span"));
		metodo.tempoEspera();
		metodo.clicar(el.btnNextSelectPrice);

		// Passo Send Quote
		metodo.escrever(el.email, "teste@tese.com");
		metodo.escrever(el.phone, "5511999999999");
		metodo.escrever(el.username, "Teste");
		metodo.escrever(el.password, "Teste123456");
		metodo.escrever(el.confirmPassword, "Teste123456");
		metodo.clicar(el.btnSend);
	}

}
