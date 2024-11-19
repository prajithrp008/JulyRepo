package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
      @BeforeTest
      public void setup() {
    	  System.out.println("before test,browse open");
    	  
      }
      @BeforeMethod
      public void mthd() {
    	  System.out.println("url loading");
      }
      @Test(priority = 2,invocationCount = 3,dependsOnMethods = {"test2"})
      public void test1() {
    	  System.out.println("test1");
      }
      @Test(priority = 4)
      public void test2() {
    	  System.out.println("test2");
      }
      @Test(priority = 1,enabled = false)
      public void test3() {
    	  System.out.println("test 3"); 
      }
      @Test(priority = 3)
      public void test4() {
    	  System.out.println("test 4");
      }
      @AfterMethod
      public void aftmthd() {
    	  System.out.println("after method");
      }
      @AfterTest
      public void afttest() {
    	  System.out.println("after test");
      }
}
