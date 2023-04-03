package Validations;

import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import PageObjects.CadastroPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import Report.Report;
import Report.Screenshot;


public class GenericValidation {
	
	private WebDriver driver;
    private CadastroPage cadastroPage;
    private LoginPage loginPage;
    private HomePage homePage;
    
    public GenericValidation(WebDriver driver) {
        
        this.driver=driver;
        cadastroPage = new CadastroPage(this.driver);
        loginPage = new LoginPage(this.driver);
        homePage= new HomePage(this.driver);
    }
    public void validationPageLogin() {
        
        String text = loginPage.getBotaoLogin().getText();
        Assertions.assertEquals("Login", text);
    }
    public void validationPageCadastro() {
        
        String text = cadastroPage.getTextNovoUsuario().getText();
        Assertions.assertEquals("Novo usuário?", text);
    }
    public void validationPageHome() {
    	
    	String text = homePage.getTextBoasVindas().getText();
        Assertions.assertEquals("Bem vindo,", text);
    }
    
}
       
    
    
