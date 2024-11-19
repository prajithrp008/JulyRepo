package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	EdgeDriver driver;
	@BeforeTest
	public void settet() {
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void Filer() {

//		Actions act=new Actions(driver);
	    driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\ASUS\\OneDrive\\Documents");
	    driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
	    String u=driver.getTitle();
	    String exp="Submit";
	    if(u.equalsIgnoreCase(exp)) {
	    	System.out.println("correct");
	    }else {
	    	System.out.println("incorrect");
	    }
	    
	    
	 
       
	}

}
