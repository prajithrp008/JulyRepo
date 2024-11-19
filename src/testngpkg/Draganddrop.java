package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	EdgeDriver driver;
	@BeforeTest
	public void dra() {
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void drag() {

		Actions act=new Actions(driver);
		WebElement dr=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));
		WebElement am=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
        act.dragAndDrop(dr, am).perform();
        WebElement dr1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
        WebElement ac=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
        act.dragAndDrop(dr1, ac).perform();
        WebElement ac1=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
        WebElement dr2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
        act.dragAndDrop(ac1, dr2).perform();
        WebElement am1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement dr3=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
        act.dragAndDrop(am1, dr3).perform();
   	 WebElement logo = driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	    
	    if (logo.isDisplayed()) {
	        System.out.println("Perfect is present");
	    } else {
	        System.out.println("not present");
	    }
		
	}

}
