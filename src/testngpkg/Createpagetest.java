package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Createpagetest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
    @Test
    public void testerr() {
    	Createloginpage ob=new Createloginpage(driver);
    	ob.process();
    }
}
