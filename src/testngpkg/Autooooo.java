package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autooooo {
	EdgeDriver driver;
	@BeforeTest
	public void set() {
		driver=new EdgeDriver();
		
	}
    @SuppressWarnings("deprecation")
	@Test
    public void autor() throws IOException, Exception {
    	driver.get("https://www.ilovepdf.com/word_to_pdf");
    	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
    	Thread.sleep(2000);
    	Runtime.getRuntime().exec("C:\\Users\\ASUS\\OneDrive\\Documents\\t01.exe");
     	Thread.sleep(3000);
    }
}
