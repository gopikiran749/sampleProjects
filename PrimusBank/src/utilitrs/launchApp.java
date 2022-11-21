package utilitrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchApp{

	public static WebDriver driver;
	@Test
	public static void appOpen() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.primusbank.qedgetech.com/");
		
	}
	@Test
	public static void appclose() {
		
		driver.close();
	}
	
	
}
