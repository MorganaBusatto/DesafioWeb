package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperation;
import PageObjects.CadastroPage;
import PageObjects.LoginPage;
import Validations.CadastroValidation;
import Validations.GenericValidation;


public class CadastroTask {

	private WebDriver driver;
	private CadastroPage cadastroPage;
	private GenericValidation genericValidation;
	private FakersGeneration fakers;
	private CadastroValidation cadastroValidation;
	private LoginPage loginPage;
	

	public CadastroTask(WebDriver driver) {
		this.driver = driver;
		cadastroPage = new CadastroPage(this.driver);
		loginPage = new LoginPage(this.driver);
		fakers = new FakersGeneration();
		genericValidation = new GenericValidation(this.driver);
		cadastroValidation = new CadastroValidation(this.driver);
	}

	public void preencherForm() {

		String nome = fakers.getFullName();
		String email = fakers.getAdressEmail();
		String senha = fakers.getPasswordSenha();
		FileOperation.setProperties("form", "nome", nome);
		FileOperation.setProperties("form", "email", email);
		FileOperation.setProperties("form", "senha", senha);

		
		//genericValidation.validationPageCadastro();
		cadastroPage.getNameInput().sendKeys(nome);
		cadastroPage.getEmailInput().sendKeys(email);
		cadastroPage.getPasswordInput().sendKeys(senha);
		cadastroValidation.validationForm();
		cadastroPage.getRegisterButton().click();
		
		
		

	}
	public void efetuarLogin() {
		
		cadastroPage.getTextLogin().click();
		//genericValidation.validationPageLogin();
		loginPage.getEmailInput().sendKeys(FileOperation.getProperties("form").getProperty("email"));
		loginPage.getPasswordInput().sendKeys(FileOperation.getProperties("form").getProperty("senha"));
		cadastroValidation.validationForm();
		loginPage.getEnterButton().click();

		
	}
}
