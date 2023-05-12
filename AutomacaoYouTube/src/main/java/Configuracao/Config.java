package Configuracao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.HomePage;

public class Config {
	private WebDriver driver;
	private DSL dsl;
	private HomePage homePage;

	@Before
	public void inicializar() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		//dsl = new DSL(driver);
		homePage = new HomePage(driver);
	}

	@After
	public void finalizar() {
		driver.quit();
	}

	@Test
	public void abrirYouTube() throws InterruptedException {
		homePage.pesquisarVideo("NBA");
		

		Thread.sleep(5000);

		//System.out.println(getDriver().getTitle());
		
		
		//Assert.assertEquals("YouTube", getDriver().getTitle());
	}

	
	
}
