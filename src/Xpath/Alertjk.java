package Xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertjk {
	EdgeDriver driver;
	@Before
	public void aleSetup() {
		driver=new EdgeDriver();
		driver.get("file:///C:/Users/ASUS/OneDrive/Desktop/pandas/alert.html");
	}
    @Test
    public void alert() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/input[1]")).click();
    	Alert a=driver.switchTo().alert();
    	String text=a.getText();
    	System.out.println("text "+text);
    	a.accept();
    //	a.dismiss(); //to cancel alert
    	driver.findElement(By.name("firstname")).sendKeys("bxjbjbhjhc");
    	driver.findElement(By.name("lastname")).sendKeys("gjjhx");
    	
    }
}

