package steps;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import iostest.BaseClass;
import pages.RegistroPrestadorPage;

public class RegistroPrestadorStep extends BaseClass{

	
	RegistroPrestadorPage page=null;
	MobileElement elemento=null;
 
	@Given("Abrir safari prestador")
	public void abrir_safari_prestador() throws Throwable {
		 try{
			 openSafari();
			 
			 page = new RegistroPrestadorPage(elemento);			 

	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);
	         
	     }
	}

	@And("Ir al registro del Prestador")
	public void ir_al_registro_del_prestador() throws Throwable {
		 page = new RegistroPrestadorPage(elemento);
		 page.registroPrestador("https://testing.jobbiando.cl/registroPrestador");
		 
		 
	} 
	
	@When("Completar el formulario de registro del prestador")
	public void completar_el_formulario_de_registro_del_prestador() throws Throwable {
		 page = new RegistroPrestadorPage(elemento);
		 page.enterNombre("Oscar");
		 page.enterApellido("Reyes");	
		 page.enterFechaNacimiento("12 de 05 de 1995");
		 page.enterEmail("ooreyes.ro@gmail.com");
		 page.enterContrasena("Hola1234");
		 page.enterTipoDocumento();
		 page.enterNumeroIdentificador("19007909-0");
		 page.enterNumeroSerie("123456777");
		
	} 
	@Then("click en boton registrar prestador")
	public void click_en_boton_registrar_prestador() throws Throwable {
		 page = new RegistroPrestadorPage(elemento);	
		 page.clickEntrar();
		 //driver.quit();
	}
}
