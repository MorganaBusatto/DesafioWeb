package Tasks;

import org.openqa.selenium.WebDriver;



import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import Validations.GenericValidation;
import Validations.CadastroValidation;

public class LoginTask {

	private WebDriver driver;
	private LoginPage loginPage;
	private FakersGeneration fakers;
	private GenericValidation genericValidation;
	private CadastroValidation cadastroValidation;

	public LoginTask(WebDriver driver) {

		this.driver = driver;
		loginPage = new LoginPage(this.driver);
		fakers = new FakersGeneration();
		genericValidation = new GenericValidation(this.driver);
		

	}

	public void efetuarRegistro() {

		//genericValidation.validationPageLogin();
		loginPage.getBotaoNovoUsuario().click();
		//genericValidation.validationPageCadastro();

	}

}
 