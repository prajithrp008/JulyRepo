package Xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Google {
	EdgeDriver driver;
	@Before
	public void gSetup() {
		driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void dSearch() {
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("mobiles",Keys.ENTER);
//		driver.findElement(By.xpath("//input[@value='Google Search']")).sendKeys("");
		}
	

}
