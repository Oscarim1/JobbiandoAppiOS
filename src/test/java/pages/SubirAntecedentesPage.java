package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import iostest.BaseClass;

public class SubirAntecedentesPage extends BaseClass {
	MobileElement elemento=null;
	By btnNext = By.xpath("(//XCUIElementTypeOther[@name=\"Next\"])[4]");
	By btnDone = By.xpath("(//XCUIElementTypeOther[@name=\"Done\"])[4]");
	By btnCorreo = By.xpath("//XCUIElementTypeOther[@name=\"Email \"]");
	By btnPass = By.xpath("//XCUIElementTypeOther[@name=\"Contraseña \"]");
	By btnIntro = By.xpath("//XCUIElementTypeButton[@name=\"Return\"]");
	By btnLogin = By.xpath("//XCUIElementTypeOther[@name=\"Login\"]");
	By btnOcultarTeclado=By.xpath("");
	By btnPermitirUbicacionE=By.xpath("");
	By btnNoPermitirUbicacion=By.xpath("//XCUIElementTypeButton[@name=\"Don’t Allow\"]");
	By btnEntrarCuenta =By.xpath("//XCUIElementTypeOther[@name=\" Cuenta\"]");
	By btnAntecedentes =By.xpath("//XCUIElementTypeOther[@name=\" Antecedentes de la cuenta\"]");	
	By btnTipoDocumento =By.xpath("//XCUIElementTypeOther[@name=\" Seleccionar tipo documento : \"]");
	By btnDocumento =By.xpath("(//XCUIElementTypeOther[@name=\"Certificado de antecedentes\"])");
	By btnImagen =By.xpath("//XCUIElementTypeOther[@name=\"Tipo Documento  Certificado de antecedentes Documento: Subir Antecedentes\"]/XCUIElementTypeOther[2]");
	By btnPermitirImagen=By.xpath("//XCUIElementTypeButton[@name=\"Allow Access to All Photos\"]");
	By btnPermitirImagenCamara=By.xpath("");
	
	
	By btnElegirFuenteImagen =By.xpath("//XCUIElementTypeButton[@name=\"Tomar una Foto\"]");
	By btnElegirFoto =By.xpath("//XCUIElementTypeButton[@name=\"elegir desde el dispositivo\"]");
	By btnFoto =By.xpath("//XCUIElementTypeImage[@name=\"Photo, March 30, 2018, 12:14 PM\"]");
	By btnSubirAntecedentes =By.xpath("(//XCUIElementTypeOther[@name=\"Subir Antecedentes\"])[2]");
	
	By btnSi =By.xpath("//XCUIElementTypeOther[@name=\"si, subir\"]");
	By btnOk =By.xpath("(//XCUIElementTypeOther[@name=\"ok\"])[1]");
	

	
	public SubirAntecedentesPage(MobileElement elemento) throws InterruptedException
	{
		this.elemento=elemento;
	}
	public void recorreTutorial() throws InterruptedException
	{
		if(exist(btnNext)!=null) {
			int i =0;
			for(i=1; i<=8; i++) {
				driver.findElement(btnNext).click();
				Thread.sleep(5000);
			}
			driver.findElement(btnDone).click();
			Thread.sleep(5000);
		}
		
		

	}
	
	/////////////////////////LOGIN/////////////////////////////////////////
	public void enterCorreo(String correo) throws InterruptedException
	{
		driver.findElement(btnCorreo).sendKeys(correo);
		Thread.sleep(3000);
		driver.findElement(btnIntro).click();
		Thread.sleep(3000);
	}
	
	public void enterContrasena(String contrasena) throws InterruptedException
	{
		driver.findElement(btnPass).sendKeys(contrasena);
		Thread.sleep(3000);
		driver.findElement(btnIntro).click();
		Thread.sleep(3000);
	}
	
	public void clickEntrar() throws InterruptedException
	{
		driver.findElement(btnLogin).click();
		Thread.sleep(3000);
	}	
	public void ubicacionNo() throws InterruptedException
	{
		driver.findElement(btnNoPermitirUbicacion).click();
		Thread.sleep(9000);
		
	}
	public void clickPerfil() throws InterruptedException
	{
		driver.findElement(btnEntrarCuenta).click();
		Thread.sleep(9000);
		
	}
	
	public void clickAntecedentes() throws InterruptedException
	{
		while(exist(btnAntecedentes)==null) {
			this.funcionScrollDown(0.9, 0.1);
		}
		driver.findElement(btnAntecedentes).click();
		Thread.sleep(5000);
		
	}
	public void clickTipoDocumento() throws InterruptedException
	{
		driver.findElement(btnTipoDocumento).click();
		Thread.sleep(15000);
		
	}
	
	public void clickDocumento() throws InterruptedException
	{
		driver.findElement(btnDocumento).click();
		Thread.sleep(15000);
	}
	
	public void clickImagen() throws InterruptedException
	{
		driver.findElement(btnImagen).click();
		Thread.sleep(15000);
	}
	
	public void clickFuenteImagen() throws InterruptedException
	{
		driver.findElement(btnElegirFoto).click();
		Thread.sleep(15000);
	}
	public void clickPermitirImagen() throws InterruptedException
	{
		driver.findElement(btnPermitirImagen).click();
		Thread.sleep(15000);
	}
	
	
	public void clickFoto() throws InterruptedException
	{
		driver.findElement(btnFoto).click();
		Thread.sleep(15000);
	}
	
	public void clickSubirAntecedentes() throws InterruptedException
	{
		driver.findElement(btnSubirAntecedentes).click();
		Thread.sleep(5000);
		driver.findElement(btnSi).click();
		Thread.sleep(5000);
		driver.findElement(btnOk).click();
		Thread.sleep(5000);
	}
	
}