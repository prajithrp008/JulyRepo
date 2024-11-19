package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keralasite {
	FirefoxDriver driver;
	@Before
	public void kerala() {
		driver=new FirefoxDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void keralaTest() {
		driver.findElement(By.id("ulogin")).sendKeys("vhvh@bjbc");
		driver.findElement(By.name("upass")).sendKeys("vxhgvcvn77sb");
		driver.findElement(By.id("sub_logbtn")).click();
	}

}
