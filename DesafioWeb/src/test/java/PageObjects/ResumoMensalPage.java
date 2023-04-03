package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResumoMensalPage {

	private WebDriver driver;

	public ResumoMensalPage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getEscolhaMes() {

		return driver.findElement(By.id("mes"));

	}
	public WebElement getEscolhaAno() {
		
		return driver.findElement(By.id("ano"));
			
	}
	public WebElement getMesMovimentacoes() {
		
		return driver.findElement(By.xpath("//form/div/select[@id='mes']/option[@value='02']"));
		
	}
	public WebElement getAnoMovimentacoes() {
		
		return driver.findElement(By.xpath("//form/div/select[@id='ano']/option[@value='2023']"));
		
	}
	public WebElement getBotaoBuscar() {
		
		return driver.findElement(By.xpath("//input[@value='Buscar']"));
		
	}public WebElement getTabelaResumoVisivel() {
		
		return driver.findElement(By.xpath("//table[@id='tabelaExtrato']/tbody/tr"));
		
	}
}
		
		
	
	


