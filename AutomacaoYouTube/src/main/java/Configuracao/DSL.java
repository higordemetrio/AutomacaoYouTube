package Configuracao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL{
	private WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver,10);
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	
	public void acessar(String url) {
		driver.get(url);
	}

	public void escrever(WebElement element, String texto) {
		//element.
		element.sendKeys(texto);
	}

	public void clicar(WebElement element) {
		element.click();
		
	}
}
