package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robotic {
	EdgeDriver driver;
	@BeforeTest
	public void robotrrrr() {
		driver=new EdgeDriver();
		
	}
      @Test
      public void test() throws AWTException {
    	  driver.get("https://www.ilovepdf.com/word_to_pdf");
    	  driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
    	  fileupload("C:\\Users\\ASUS\\OneDrive\\Documents\\codefoss.docx");
    	  
      }
	public void fileupload(String p) throws AWTException {
		StringSelection strselSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselSelection, null);
		
		Robot robot=new Robot();
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
