package TestCases;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Report.Report;
import Report.ReportType;
import Report.Screenshot;
import Tasks.CadastroTask;
import Tasks.HomeTask;
import Tasks.LoginTask;


public class RealizarTarefasComSucessoTest extends TestBase {

	private WebDriver driver = getDriverManager();

	CadastroTask cadastroTask = new CadastroTask(driver);
	LoginTask loginTask = new LoginTask(driver);
	HomeTask homeTask = new HomeTask(driver);
	

	@Test
	public void realizarTarefas() {
		    Report.createTest("Realizar tarefas com sucesso", ReportType.SINGLE);
		    loginTask.efetuarRegistro();
			cadastroTask.preencherForm();
			cadastroTask.efetuarLogin();
			homeTask.criarContas();
			homeTask.criarMovContaReceita();
			homeTask.criarMovContaDespesa();
			homeTask.ConsultaResumoMensal();
			
			
			

	}
}
