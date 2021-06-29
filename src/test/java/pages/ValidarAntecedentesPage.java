package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import iostest.BaseClass;

public class ValidarAntecedentesPage extends BaseClass {
	MobileElement elemento=null;

	By btnCorreo = By.xpath("//input[@id=\"mat-input-0\"]");
	By btnPass = By.xpath("//input[@id=\"mat-input-1\"]");
	By btnEnter = By.xpath("//button[@id=\"btnEntrar\"]");
	By btnBarra = By.xpath("//div[@id=\"container-3\"]/toolbar/div/mat-toolbar/div/div[1]/button");
	By btnRevisarDocumentos = By.xpath("(//fuse-nav-vertical-item[@id=\"barraItem1\"])[3]/a");
	By txtNombre = By.xpath("(//fuse-nav-vertical-item[@id=\"barraItem1\"])[3]/a");
	By btnNext = By.xpath("//div[@id=\"content-lista\"]/div/mat-paginator/div/div/div[2]/button[2]/span");
	By btnBuscarNombre = By.xpath("//div[@id=\"container-3\"]/content/app-filtrar-antecedentes/div/div[1]/div[2]/div/input");
	By btnCertificadoAntecedentes = By.xpath("//div[@id=\"content-lista\"]/div/table/tbody/tr[1]/td[1]");
	By btnRevisarAntecedente = By.xpath("//button[@id=\"btnRevisarAntecedente0\"]");
	By btnVerificar = By.xpath("//mat-dialog-container[@id=\"mat-dialog-0\"]/app-verificar-antecedente/div/div[2]/button[1]");
	By btnSi = By.xpath("//button[@id=\"btnYes\"]");
	
	
	
	public ValidarAntecedentesPage(MobileElement elemento) throws InterruptedException
	{
		this.elemento=elemento;
	}
	public void login(String url) throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(10000);

	}	
	/////////////////////////LOGIN/////////////////////////////////////////
	public void enterCorreo(String correo) throws InterruptedException
	{
		driver.findElement(btnCorreo).sendKeys(correo);
		Thread.sleep(3000);
		
	}
	
	public void enterContrasena(String contrasena) throws InterruptedException
	{
		driver.findElement(btnPass).sendKeys(contrasena);
		Thread.sleep(3000);
	}
	
	public void clickEntrar() throws InterruptedException
	{
		driver.findElement(btnEnter).click();
		Thread.sleep(3000);
	}	
	public void clickRevisarAntecedentes() throws InterruptedException
	{
		driver.findElement(btnBarra).click();
		Thread.sleep(9000);
		while(exist(btnRevisarDocumentos)==null) {
			funcionScrollDown(0.8,0.2);
			
		}
		driver.findElement(btnRevisarDocumentos).click();
		Thread.sleep(9000);
		
	}
	
	public void buscarNombre(String nombre) throws InterruptedException
	{
		
		driver.findElement(btnBuscarNombre).sendKeys(nombre);
		Thread.sleep(9000);
		
	}
	
	public void clickCertificadoAntecedente() throws InterruptedException
	{
		driver.findElement(btnCertificadoAntecedentes).click();
		Thread.sleep(9000);
		
	}
	public void clickRevisarAntecedente() throws InterruptedException
	{
		driver.findElement(btnRevisarAntecedente).click();
		Thread.sleep(9000);
		
	}
	public void clickVerificar() throws InterruptedException
	{
		driver.findElement(btnVerificar).click();
		Thread.sleep(9000);
		
	}
	
	public void clickSi() throws InterruptedException
	{
		driver.findElement(btnSi).click();
		Thread.sleep(9000);
		
	}
	
	
	
}