package Validations;

import org.junit.jupiter.api.Assertions;


import org.openqa.selenium.WebDriver;
import Framework.Utils.FileOperation;
import PageObjects.CadastroPage;
import PageObjects.LoginPage;


public class CadastroValidation {

	private WebDriver driver;
	private CadastroPage cadastroPage;
	private LoginPage loginPage;

	public CadastroValidation(WebDriver driver) {

		this.driver = driver;
		cadastroPage = new CadastroPage(this.driver);
		loginPage = new LoginPage(this.driver);

	}

	public void validationForm() {
		
		Assertions.assertFalse(cadastroPage.getPasswordInput().getAttribute("value").equalsIgnoreCase(" "));
	}
	
}  

		
	
