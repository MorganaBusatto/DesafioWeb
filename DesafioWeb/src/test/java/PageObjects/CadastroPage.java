package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPage {

	private WebDriver driver;

	public CadastroPage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getTextNovoUsuario() {

		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a"));

	}
    
	public WebElement getNameInput() {

		return driver.findElement(By.id("nome"));

	}

	
	public WebElement getEmailInput() {

		return driver.findElement(By.id("email"));

	}

	
	public WebElement getPasswordInput() {

		return driver.findElement(By.id("senha"));

	}

	
	public WebElement getRegisterButton() {

		return driver.findElement(By.xpath("//input[@class='btn btn-primary']"));

	}
	public WebElement getTextLogin() {

		return driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a"));
		

	}

}
