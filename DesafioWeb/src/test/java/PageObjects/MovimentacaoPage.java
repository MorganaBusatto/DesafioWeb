package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MovimentacaoPage {

	private WebDriver driver;

	public MovimentacaoPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTipoMov() {
		return driver.findElement(By.id("tipo"));
	}

	public WebElement getTipoMovReceita() {
		return driver.findElement(By.xpath("//option[@value='REC']"));
	}

	public WebElement getTipoMovDespesa() {
		return driver.findElement(By.xpath("//option[@value='DESP']"));
	}

	public WebElement getDataMovimentacao() {
		return driver.findElement(By.id("data_transacao"));
	}

	public WebElement getDataPagamento() {
		return driver.findElement(By.id("data_pagamento"));
	}

	public WebElement getDescricao() {
		return driver.findElement(By.id("descricao"));
	}

	public WebElement getInteressado() {
		return driver.findElement(By.id("interessado"));
	}

	public WebElement getValor() {
		return driver.findElement(By.id("valor"));
	}

	public WebElement getConta() {
		return driver.findElement(By.id("conta"));
	}

	public WebElement getContaReceita() {
		return driver.findElement(By.xpath("//select[@id='conta']/option[text()='Receita']"));
	}

	public WebElement getContaDespesa() {
		return driver.findElement(By.xpath("//select[@id='conta']/option[text()='Despesa']"));
	}

	public WebElement getStatusPago() {
		return driver.findElement(By.id("status_pago"));
	}

	public WebElement getStatusPendente() {
		return driver.findElement(By.id("status_pendente"));
	}

	public WebElement GetBotaoSalvarMov() {

		return driver.findElement(By.xpath("//button[text()='Salvar']"));
	}

}
