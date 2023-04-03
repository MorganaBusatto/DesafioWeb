package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContaPage {

	private WebDriver driver;

	public ContaPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getBotaoContas() {

		return driver.findElement(By.xpath("//div[@id='navbar']/ul[@class='nav navbar-nav']/li[2]/a"));
	}

	public WebElement getAdicionarConta() {

		return driver.findElement(By.xpath("//a[@href='/addConta']"));
		
	}public WebElement getListarConta() {

		return driver.findElement(By.xpath("//a[@href='/contas']"));
	}

	public WebElement getNomeContaTipo() {

		return driver.findElement(By.id("nome"));
	}

	public WebElement getBotaoSalvar() {

		return driver.findElement(By.xpath("//button[text()='Salvar']"));
	}

	public WebElement getListarContaClick() {

		return driver.findElement(By.xpath("//li[@class='dropdown open']/ul[@class='dropdown-menu']/li[2]"));

	}

	

}
