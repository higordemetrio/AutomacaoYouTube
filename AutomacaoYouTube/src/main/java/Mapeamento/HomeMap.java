package Mapeamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeMap {

	private WebDriver driver;
	public WebElement campoPesquisa;
	public WebElement btnPesquisa;
	
	public HomeMap(WebDriver driver) {
		this.driver = driver;
		campoPesquisa = driver.findElement(By.xpath("//input[@id='search']"));
		btnPesquisa = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		
	}
	
}
