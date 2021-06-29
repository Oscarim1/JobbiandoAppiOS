package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import iostest.BaseClass;
import pages.LoginPage;

public class LoginStep extends BaseClass{

	
	LoginPage page=null;
	MobileElement elemento=null;

	@Given("Abrir la app del prestador")
	public void abrir_la_app_del_prestador() throws Throwable {
		 try{
			 openApp();
			 Thread.sleep(15000);
			 page = new LoginPage(elemento);

			 Thread.sleep(10000); 
 
			
			 

	     }catch(Exception exp) {
	         System.out.println(exp.getMessage());
	         exp.printStackTrace();
	         Thread.sleep(5000);
	         
	     }
	}

	@And("Recorrer el tutorial")
	public void recorrer_el_tutorial() throws Throwable {
		 page = new LoginPage(elemento);
		 page.recorreTutorial();
		 
	}
	
	@Then("Realizar el login")
	public void realizar_el_login() throws Throwable {
		 page = new LoginPage(elemento);
		 page.enterCorreo(BaseClass.CorreoPrestador);
		 page.enterContrasena(BaseClass.Contrasena);	
		 page.clickEntrar();
		 //driver.quit();
	}

}
