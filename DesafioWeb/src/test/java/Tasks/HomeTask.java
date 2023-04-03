package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import PageObjects.ContaPage;
import PageObjects.HomePage;
import PageObjects.MovimentacaoPage;
import PageObjects.ResumoMensalPage;
import Validations.ResumoMensalValidation;
import PageObjects.LoginPage;



public class HomeTask {

	private WebDriver driver;
	private HomePage homePage;
	private ContaPage contaPage;
	private MovimentacaoPage movimentacaoPage;
	private ResumoMensalPage resumoMensalPage;
	private ResumoMensalValidation resumoMensalValidation;
	private LoginPage loginPage;
	

	public HomeTask(WebDriver driver) {
		this.driver = driver;
		homePage = new HomePage(this.driver);
		contaPage = new ContaPage(this.driver);
		movimentacaoPage = new MovimentacaoPage(this.driver);
		resumoMensalPage = new ResumoMensalPage(this.driver);
		resumoMensalValidation = new ResumoMensalValidation(this.driver);
		loginPage = new LoginPage(this.driver);
		

	}

	public void criarContas() {
		
        
		homePage.getBotaoContas().click();
		contaPage.getAdicionarConta().click();
		contaPage.getNomeContaTipo().sendKeys("Receita");
		contaPage.getBotaoSalvar().click();
		contaPage.getBotaoContas().click();
		contaPage.getAdicionarConta().click();
		contaPage.getNomeContaTipo().sendKeys("Despesa");
		contaPage.getBotaoSalvar().click();
		homePage.getBotaoContas().click();
		contaPage.getListarConta().click();
			

	}

	public void criarMovContaReceita() {
		

	    homePage.getBotaoCriarMov().click();
		movimentacaoPage.getTipoMov().click();
		movimentacaoPage.getTipoMovReceita().click();
		movimentacaoPage.getDataMovimentacao().sendKeys("20/02/2023");
		movimentacaoPage.getDataPagamento().sendKeys("25/02/2023");
		movimentacaoPage.getDescricao().sendKeys("Testando Receita");
		movimentacaoPage.getInteressado().sendKeys("Jose Maria");
		movimentacaoPage.getValor().sendKeys("200");
		movimentacaoPage.getConta().click();
		movimentacaoPage.getContaReceita().click();
		movimentacaoPage.getStatusPago().click();
		movimentacaoPage.GetBotaoSalvarMov().click();

	}

	public void criarMovContaDespesa() {

		homePage.getBotaoCriarMov().click();
		movimentacaoPage.getTipoMov().click();
		movimentacaoPage.getTipoMovDespesa();
		movimentacaoPage.getDataMovimentacao().sendKeys("25/02/2023");
		movimentacaoPage.getDataPagamento().sendKeys("28/02/2023");
		movimentacaoPage.getDescricao().sendKeys("Testando Despesa");
		movimentacaoPage.getInteressado().sendKeys("Marcela Oliveira");
		movimentacaoPage.getValor().sendKeys("80");
		movimentacaoPage.getConta().click();
		movimentacaoPage.getContaDespesa().click();
		movimentacaoPage.getStatusPago().click();
		movimentacaoPage.GetBotaoSalvarMov().click();

	}
	
    public void ConsultaResumoMensal() {
    	
    	homePage.getBotaoResumoMensal().click();
    	resumoMensalPage.getEscolhaMes().click();
    	resumoMensalPage.getMesMovimentacoes().click();
    	resumoMensalPage.getEscolhaAno().click();
    	resumoMensalPage.getAnoMovimentacoes().click();
    	resumoMensalPage.getBotaoBuscar().click();
    	resumoMensalValidation.ValidationTabResumoMensal();
    	homePage.getBotaoSair().click();
    	
  
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    
    	
    }

}