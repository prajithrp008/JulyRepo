package Xpath;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screeshot {
    EdgeDriver driver;
    @Before
    public void scr() {
    	driver=new EdgeDriver();
    	driver.get("https://www.facebook.com");
    }
    @Test
    public void screen() throws Exception {
    	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileHandler.copy(s, new File("C:\\Users"));
    	WebElement button=driver.findElement(By.name("login"));
    	File s1=button.getScreenshotAs(OutputType.FILE);
    	FileHandler.copy(s1, new File("./Screenshot/buttonscreeshott.png"));
    	
    }
}
