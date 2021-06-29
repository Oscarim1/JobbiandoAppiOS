package steps;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import iostest.BaseClass;
import pages.RegistroSolicitantePage;

public class RegistroSolicitanteStep extends BaseClass{

	RegistroSolicitantePage page=null;
	MobileElement elemento=null;
 
	@Given("Abrir safari web solicitante")
	public void abrir_safari_web_solicitante() throws Throwable {
		 try{
			 openSafari();
			 
			 page = new RegistroSolicitantePage(elemento);			 

	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);
	         
	     }
	}

	@And("Ir al registro del Solicitante")
	public void ir_al_registro_del_solicitante() throws Throwable {
		 page = new RegistroSolicitantePage(elemento);
		 page.registroSolicitante("https://testing.jobbiando.cl/registroSolicitante");
		 
		 
	} 
	
	@When("Completar el formulario de registro del solicitante")
	public void completar_el_formulario_de_registro_del_solicitante() throws Throwable {
		 page = new RegistroSolicitantePage(elemento);
		 page.enterNombre("Oscar");
		 page.enterApellido("Reyes");
		 page.enterEmail("ooreyes.ro@gmail.com");	
		 page.enterFechaNacimiento("12 de 05 de 1995");
		 page.enterContrasena("Hola1234");
		 page.enterTipoDocumento();
		 page.enterNumeroIdentificador("19007909-0");
		 //page.enterNumeroSerie("123456777");
		
	} 
	@Then("hacer click en boton registrar solicitante")
	public void hacer_click_en_boton_registrar_solicitante() throws Throwable {
		 page = new RegistroSolicitantePage(elemento);	
		 page.clickEntrar();
		 //driver.quit();
	}
}
