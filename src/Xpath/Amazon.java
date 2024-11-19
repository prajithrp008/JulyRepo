package Xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
    EdgeDriver driver;
    @Before
    public void fSetup() {
    	driver=new EdgeDriver();
    	driver.get("https://www.amazon.in");
    	driver.manage().window().maximize();
    }
    @Test
    public void fTest() {
    	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("smart mobiles");
    	driver.findElement(By.xpath("//input[@value='Go']")).click();
     	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
     	driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/div/span")).click();
     	driver.navigate().back();
     	driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]/div/span")).click();
     	driver.navigate().back();
     	driver.findElement(By.xpath("//div[@id='navSwmHoliday']/a")).click();   	
     	driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
     	
    	
    	
    }
}
