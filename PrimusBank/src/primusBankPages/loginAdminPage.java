package primusBankPages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilitrs.launchApp;

public class loginAdminPage extends launchApp
{
	@Test 
	public static void adminlogin(String uid,String pwd) {
		
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
	}
	
	
	
	
	
}
