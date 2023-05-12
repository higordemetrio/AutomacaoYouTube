package Page;

import org.openqa.selenium.WebDriver;

import Configuracao.DSL;
import Mapeamento.HomeMap;

public class HomePage {
	private DSL dsl;
	private HomeMap homeMap;
	
	public HomePage(WebDriver driver){
		dsl = new DSL(driver);
		homeMap = new HomeMap(driver);
	}
	
	public void pesquisarVideo(String nomeVideo) {
		dsl.escrever(homeMap.campoPesquisa, nomeVideo);
		dsl.clicar(homeMap.btnPesquisa);
	}
}
