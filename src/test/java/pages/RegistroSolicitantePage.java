package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import iostest.BaseClass;

public class RegistroSolicitantePage extends BaseClass {
	MobileElement elemento=null;
	By btnNombre = By.xpath("//input[@id=\"mat-input-0\"]");
	By btnApellido = By.xpath("//input[@id=\"mat-input-1\"]");
	//By txtFechaNacimiento = By.xpath("//input[@name=\"123\"]");
	By btnFechaNacimiento = By.xpath("//mat-datepicker-toggle[@id=\"fechaNacimiento\"]/button");
	By btnAnioNacimiento = By.xpath("//mat-calendar[@id='mat-datepicker-0']/div/mat-multi-year-view/table/tbody/tr[4]/td[4]/div");
	By btnMesNacimiento = By.xpath("//mat-calendar[@id='mat-datepicker-0']/div/mat-year-view/table/tbody/tr[3]/td/div");
	By btnDiaNacimiento = By.xpath("//mat-calendar[@id='mat-datepicker-0']/div/mat-month-view/table/tbody/tr[3]/td[5]/div");
	By btnEmail = By.xpath("//input[@id=\"mat-input-2\"]");
	By btnContrasena = By.xpath("//input[@id=\"password\"]");	
	By btnContrasena2 = By.xpath("//input[@id=\"mat-input-5\"]");
	By btnTipoDocumento = By.xpath("//mat-select[@id=\"selectTipo\"]");
	By btnTipoDocumentoSelect = By.xpath("//mat-option[@id='optionTipo0']/span");
	By btnNumeroIdentificador = By.xpath("//input[@id=\"mat-input-6\"]");
	//By btnNumeroSerie = By.xpath("//input[@id=\"numero_serie\"]");
	//By btnIntro = By.xpath("//XCUIElementTypeButton[@name=\"Return\"]");
	By btnLogin = By.xpath("//button[@id=\"btnSaveRegistro\"]");
	
	
	public RegistroSolicitantePage(MobileElement elemento) throws InterruptedException
	{
		this.elemento=elemento;
	}
	public void registroSolicitante(String url) throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(10000);
	}
	
	/////////////////////////FORMULARIO/////////////////////////////////////////
	public void enterNombre(String nombre) throws InterruptedException
	{
		
		while(exist(btnNombre)==null) {
			
			Thread.sleep(10000);
		}
		driver.findElement(btnNombre).sendKeys(nombre);
		Thread.sleep(5000);
		
	}
	public void enterApellido(String apellido) throws InterruptedException
	{
		driver.findElement(btnApellido).sendKeys(apellido);
		Thread.sleep(10000);
		
	}
	public void enterFechaNacimiento(String fecha_nacimiento) throws InterruptedException
	{
		driver.findElement(btnFechaNacimiento).click();
		Thread.sleep(10000);
		driver.findElement(btnAnioNacimiento).click();
		Thread.sleep(10000);
		driver.findElement(btnMesNacimiento).click();
		Thread.sleep(10000);
		driver.findElement(btnDiaNacimiento).click();
		Thread.sleep(10000);
		
	}
	
	public void enterEmail(String email) throws InterruptedException
	{
		driver.findElement(btnEmail).sendKeys(email);
		Thread.sleep(3000);
		
	}
	
	public void enterContrasena(String contrasena) throws InterruptedException
	{
		while(exist(btnContrasena)==null) {
			funcionScrollDown(0.4,0.2);
		}
		driver.findElement(btnContrasena).sendKeys(contrasena);
		Thread.sleep(3000);
		driver.findElement(btnContrasena2).sendKeys(contrasena);
		Thread.sleep(3000);
		
	}
	public void enterTipoDocumento() throws InterruptedException
	{
		driver.findElement(btnTipoDocumento).click();
		Thread.sleep(3000);
		driver.findElement(btnTipoDocumentoSelect).click();
		Thread.sleep(3000);
		
		
		
	}
	public void enterNumeroIdentificador(String numero_identificador) throws InterruptedException
	{
		driver.findElement(btnNumeroIdentificador).sendKeys(numero_identificador);
		Thread.sleep(3000);
		
	}
	/*public void enterNumeroSerie(String numero_serie) throws InterruptedException
	{
		driver.findElement(btnNumeroSerie).sendKeys(numero_serie);
		Thread.sleep(3000);
		
	}*/
	public void clickEntrar() throws InterruptedException
	{
		driver.findElement(btnLogin).click();
		Thread.sleep(3000);
	}	
	
}