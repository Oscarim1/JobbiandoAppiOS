package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import iostest.BaseClass;
import pages.LoginPage;
import pages.SubirAntecedentesPage;

public class AgregarCategoriaStep extends BaseClass{

	
	SubirAntecedentesPage page=null;
	MobileElement elemento=null;

	@Given("Para categorias Completar Login y entrar")
	public void para_categorias_Completar_Login_y_entrar() throws Throwable {
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

	@When("Hacer click en Agregar")
	public void hacer_click_en_Agregar() throws Throwable {
	    aqui quede jejeje
	}

	@Then("Seleccionar una categoria")
	public void seleccionar_una_categoria() throws Throwable {
	   
	}

}
