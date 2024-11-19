package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Siteclass {
	FirefoxDriver driver;
	@BeforeTest
	public void setupp() {
		driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void testt() throws InterruptedException {
		WebElement right=driver.findElement(By.xpath("/html/body/span"));
		Actions actt=new Actions(driver);
		actt.contextClick(right).perform();
		driver.findElement(By.xpath("/html/body/ul/li[1]")).click();
		driver.switchTo().alert().accept();
		WebElement dou=driver.findElement(By.xpath("/html/body/button"));
		actt.doubleClick(dou);
		actt.perform();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	}

}
