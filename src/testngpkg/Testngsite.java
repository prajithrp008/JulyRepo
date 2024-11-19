package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngsite {
	EdgeDriver driver;
     @BeforeTest(alwaysRun = true)
     public void setuppp() {
    	driver=new EdgeDriver();
    	
    	
     }
     @BeforeMethod(alwaysRun = true)
     public void urll() {
    	 driver.get("https://www.google.com/");
     }
     @Test
     public void test11() {
    	 driver.findElement(By.id("APjFqb")).sendKeys("hjghjgjh");
    	 
     }
     @Test
     public void test12()
     {
    	 driver.findElement(By.name("btnK")).click();
     }
     @Test(groups = {"smoke","sanity"})
     public void test13() {
    	WebElement logo= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
    	  if (logo.isDisplayed()) {
		        System.out.println("Logo is displayed.");
		    } else {
		        System.out.println("Logo is not displayed.");
		    }
     }
     @AfterTest
     public void asttest() {
    	 driver.quit();
     }
     
}
