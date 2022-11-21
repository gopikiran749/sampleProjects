package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.findElement(By.linkText("Site Map")).click();
		List<WebElement> links=  driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i =0;i<links.size();i++)
		{
			String list = links.get(i).getText();
			System.out.println(list);
		}
		
		}
	
		
	}


