package Xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Rediff2 {
	EdgeDriver driver;
	@Before
	
	public void rSetup() {
		driver=new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		
	}
	@Test
	public void rediff() {
		 WebElement logo = driver.findElement(By.xpath("/*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		    
		    if (logo.isDisplayed()) {
		        System.out.println("Logo is displayed.");
		    } else {
		        System.out.println("Logo is not displayed.");
		    }
		}
	}


