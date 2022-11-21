package primusbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pbankTest {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.linkText("Site Map")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
