package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaymousehover {
	FirefoxDriver driver;
	@BeforeTest
	public void hover() {
		driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");
	}
   @Test
   public void hovTest() {
//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	   WebElement hover=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[1]/ul/li[3]/a"));
	   Actions hov=new Actions(driver);
	   hov.moveToElement(hover).perform();
	   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[5]/div[1]/div/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
	     
	   driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	   }
}
