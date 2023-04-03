package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import PageObjects.ResumoMensalPage;
import Report.Report;
import Report.Screenshot;

public class ResumoMensalValidation {

	private WebDriver driver;
	private ResumoMensalPage resumoMensalPage;

	public ResumoMensalValidation(WebDriver driver) {

		this.driver = driver;
		resumoMensalPage = new ResumoMensalPage(this.driver);

	}

	public void ValidationTabResumoMensal() {

		try {
			Assertions.assertTrue(resumoMensalPage.getTabelaResumoVisivel().isDisplayed());
			Report.log(Status.PASS, "Tabela de resumo mensal está visivel.", Screenshot.captureBase64(driver));

		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));

		}

	}

}
