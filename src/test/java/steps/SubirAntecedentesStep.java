package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import iostest.BaseClass;
import pages.LoginPage;
import pages.SubirAntecedentesPage;

public class SubirAntecedentesStep extends BaseClass{

	
	SubirAntecedentesPage page=null;
	MobileElement elemento=null;

	@Given("Completar login y entrar")
	public void completar_login_y_entrar() throws Throwable {
		 try{
			 openApp();
			 Thread.sleep(15000);
			 page = new SubirAntecedentesPage(elemento);

			 Thread.sleep(10000); 

	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);
	         
	     }
		 page.recorreTutorial();
		 page.enterCorreo(BaseClass.CorreoPrestador);
		 page.enterContrasena(BaseClass.Contrasena);	
		 page.clickEntrar();
		 
	}

	@And("Hacer click en pestana Cuenta")
	public void hacer_click_en_pestana_Cuenta() throws Throwable{
		page = new SubirAntecedentesPage(elemento);
		page.ubicacionNo();
		page.clickPerfil();
		
		
	}

	@And("Hacer click en pestana Enviar Antecedentes")
	public void hacer_click_en_pestana_Enviar_Antecedentes() throws Throwable {
	    page = new SubirAntecedentesPage(elemento);
	    page.clickAntecedentes(); 	
	    page.clickTipoDocumento(); 
	    page.clickDocumento();
	}

	@When("Hacer click en Selecionar Imagen")
	public void hacer_click_en_Selecionar_Imagen() throws Throwable {
		page = new SubirAntecedentesPage(elemento);
		page.clickImagen(); 
		page.clickFuenteImagen();
		page.clickPermitirImagen();		
	
	}
	@And("Hacer click en Imagen")
	public void hacer_click_en_Imagen() throws Throwable{
		page.clickFoto(); 		
	}
	@Then("Hacer click en boton Subir Antecedentes")
	public void hacer_click_en_boton_Subir_Antecedentes() throws Throwable {
		page = new SubirAntecedentesPage(elemento);
		page.clickSubirAntecedentes(); 	 
		//driver.quit();
	}

}
