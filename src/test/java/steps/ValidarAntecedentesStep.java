package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import iostest.BaseClass;
import pages.ValidarAntecedentesPage;

public class ValidarAntecedentesStep extends BaseClass{

	
	ValidarAntecedentesPage page=null;
	MobileElement elemento=null;

	@Given("Abrir el navegador")
	public void abrir_el_navegador() throws Throwable {
		 try{
			 openSafari();
			 Thread.sleep(15000);
			 page = new ValidarAntecedentesPage(elemento);

			 Thread.sleep(10000); 

	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);
	          
	     }
		 page.login("https://testing.jobbiando.cl/login");
		 page.enterCorreo(BaseClass.CorreoAdministrador);
		 page.enterContrasena(BaseClass.ContrasenaAdministrador);	
		 page.clickEntrar();
		 
	}

	@And("Ir a revisar antecedentes")
	public void ir_a_revisar_antecedentes() throws Throwable {
		page.clickRevisarAntecedentes();
	}

	@When("Seleccionar al usuario al que se le validaran los antecedentes")
	public void seleccionar_al_usuario_al_que_se_le_validaran_los_antecedentes() throws Throwable {
		page.buscarNombre("Oscar");
		page.clickCertificadoAntecedente();
	}

	@When("hacer click en validar antecedentes")
	public void hacer_click_en_validar_antecedentes() throws Throwable {
	    
		page.clickRevisarAntecedente();
		page.clickVerificar();
		page.clickSi();
	}

	@Then("Salir del navegador")
	public void salir_del_navegador() throws Throwable {
	   driver.quit();
	}

}
