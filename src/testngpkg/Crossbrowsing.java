package testngpkg;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsing {
      WebDriver driver;
      @Parameters("browser")
      @BeforeTest
      public void edge(String browser) {
    	  if(browser.equalsIgnoreCase("edge")) {
    		  driver=new EdgeDriver();
    	  }
    	  else {
    		  driver=new FirefoxDriver();
			
		}
      }
      @Test
      public void lTest() {
    	  driver.get("https://www.google.com");
      
}}

