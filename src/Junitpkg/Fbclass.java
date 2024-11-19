package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbclass {
	FirefoxDriver driver;
	@Before
	public void fb() {
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fbLogin() {
		driver.findElement(By.id("email")).sendKeys("pajc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("xvhgvgxgzhxxvhc");
		driver.findElement(By.name("login")).click();
		
	}

}
