package Xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Swaglabs {
     EdgeDriver driver;
     @Before
     public void SauceSetup() {
    	 driver=new EdgeDriver();
    	 driver.get("https://www.saucedemo.com/");
    	 driver.manage().window().maximize();
    	 }
     @Test
     public void swag() throws InterruptedException {
    	 WebElement username= driver.findElement(By.xpath("//div[@class='form_group']/input"));
    	 username.sendKeys("standard_user");
    	 WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
    	 password.sendKeys("secret_sauce");
    	 Thread.sleep(3000);
    	 driver.findElement(By.id("login-button")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click(); //addtocart
    	 driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.id("checkout")).click();
    	 WebElement firstname= driver.findElement(By.id("first-name"));
    	 firstname.sendKeys("Groot");
    	 WebElement lastname=driver.findElement(By.id("last-name"));
    	 lastname.sendKeys("Rp");
    	 driver.findElement(By.id("postal-code")).sendKeys("690517");
    	 Thread.sleep(3000);
    	 driver.findElement(By.id("continue")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.id("finish")).click();
    	 
//    	 driver.findElement(By.id("back-to-products")).click();
    	 
     }
}
