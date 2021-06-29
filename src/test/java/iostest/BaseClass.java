package iostest;


import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class BaseClass{
	public static AppiumDriver<MobileElement> driver;
	
	public static String CorreoPrestador = "randomail600@gmailnator.com";
	public static String CorreoSolicitante = "randomail601@gmailnator.com";
	public static String Contrasena = "Hola1234";
	public static String CorreoAdministrador = "camilatoro200@gmail.com";
	public static String ContrasenaAdministrador = "190858111";
	
	
	@BeforeTest 
	public void openApp() throws Exception {

		
		try {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("platformName", "iOS");
			desiredCapabilities.setCapability("platformVersion", "14.5");
			desiredCapabilities.setCapability("deviceName", "iPhone 8 Plus");
			desiredCapabilities.setCapability("automationName", "XCUITest");
			desiredCapabilities.setCapability("app", "/Users/oscarim/Downloads/easyjobPrestador.app");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
			
			Thread.sleep(5000);
			
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	public void openSafari() throws Exception {

		
		try {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("platformName", "iOS");
			desiredCapabilities.setCapability("platformVersion", "14.5");
			desiredCapabilities.setCapability("deviceName", "iPhone 8 Plus");
			desiredCapabilities.setCapability("browserName", "Safari");
			
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
			
			Thread.sleep(5000);
			
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}

	public MobileElement exist(By element) {
		try {
			return driver.findElement(element);
		} catch (Exception e) {
			return null;
		}

	}
	public void funcionScrollDown(Double height_start, Double height_end) throws InterruptedException {
		driver.manage().window().getSize();
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.1);
		int start_y = (int) (dimension.height * height_start);

		int end_x = (int) (dimension.width * 0.1);
		int end_y = (int) (dimension.height * height_end);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(3000);
	}
	public void funcionScrollUp(Double height_start, Double height_end) throws InterruptedException {
		driver.manage().window().getSize();
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.1);
		int start_y = (int) (dimension.height * height_start);

		int end_x = (int) (dimension.width * 0.1);
		int end_y = (int) (dimension.height * height_end);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(3000);
	}
	
}
