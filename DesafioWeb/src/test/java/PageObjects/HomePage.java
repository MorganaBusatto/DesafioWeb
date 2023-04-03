package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	
	public WebElement getTextBoasVindas() {

		return driver.findElement(By.className("alert alert-success"));

	}

	public WebElement getBotaoHome() {

		return driver.findElement(By.xpath("//div[@id='navbar']/ul/li/a[text()='Home']"));

	}

	public WebElement getBotaoContas() {

		return driver.findElement(By.xpath("//div[@id='navbar']/ul[@class='nav navbar-nav']/li[2]/a"));

	}

	public WebElement getBotaoCriarMov() {

		return driver.findElement(By.xpath("//div[@id='navbar']/ul[@class='nav navbar-nav']/li[3]/a"));

	}

	public WebElement getBotaoResumoMensal() {

		return driver.findElement(By.xpath("//div[@id='navbar']/ul[@class='nav navbar-nav']/li[4]/a"));

	}

	public WebElement getBotaoSair() {

		return driver.findElement(By.xpath("//div[@id='navbar']/ul[@class='nav navbar-nav']/li[5]/a"));

	}

}
