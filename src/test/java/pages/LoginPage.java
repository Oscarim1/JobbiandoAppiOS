package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import iostest.BaseClass;

public class LoginPage extends BaseClass {
	MobileElement elemento=null;
	By btnNext = By.xpath("(//XCUIElementTypeOther[@name=\"Next\"])[4]");
	By btnDone = By.xpath("(//XCUIElementTypeOther[@name=\"Done\"])[4]");
	By btnCorreo = By.xpath("//XCUIElementTypeOther[@name=\"Email \"]");
	By btnPass = By.xpath("//XCUIElementTypeOther[@name=\"Contraseña \"]");
	By btnIntro = By.xpath("//XCUIElementTypeButton[@name=\"Return\"]");
	By btnLogin = By.xpath("//XCUIElementTypeOther[@name=\"Login\"]");
	
	
	public LoginPage(MobileElement elemento) throws InterruptedException
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
	
}