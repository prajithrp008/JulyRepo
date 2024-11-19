package Xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook2 {
	EdgeDriver driver;
	@Before
	public void setup() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
		
		
	}
	@Test
	public void fbTest() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vhvh@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vhvh@gmail.com");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	

}
