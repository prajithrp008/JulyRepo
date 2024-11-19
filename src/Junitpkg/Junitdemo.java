package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junitdemo {
     FirefoxDriver driver;
     @Before
     public void setUp() {
    	 driver=new FirefoxDriver();
    	 driver.get("https://www.google.com");
     }
     @Test
     public void titletest() {
    	 String act=driver.getTitle();
    	 String exp="Google";
    	 if(act.equals(exp)) {
    		 System.out.println("pass");
    	 }else {
    		 System.out.println("fail");
    	 }
    	 String act2=driver.getPageSource();
    	 String exp2="Google";
    	 if(act2.contains(exp2)) {
    		 System.out.println("pass");
    	 }else {
    		 System.out.println("fail");
    	 
     }
//     @After
//     public void tearDown() {
//    	 driver.quit();
//     }
}
     }

