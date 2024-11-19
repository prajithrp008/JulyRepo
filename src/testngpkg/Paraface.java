package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paraface {
	EdgeDriver driver;
	@BeforeTest
	public void faceook() {
		driver=new EdgeDriver();
		
	}
	@BeforeMethod
	public void urlll() {
		driver.get("https://www.facebook.com/login.php");
	}
	@Parameters({"username","password"})
	@Test
	public void setest(String username,String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
	}
	
	@Test
	public void settestt() {
		driver.findElement(By.name("login")).click();
	}

}
