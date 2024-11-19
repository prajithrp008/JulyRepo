package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Keralaproperty {
	FirefoxDriver driver;
	@BeforeTest
	public void settupp() {
		driver=new FirefoxDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void keraa() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("wqeqrwdydy@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("8089150543@Rp");
		 driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		 Thread.sleep(2000);
		 String exp="https://keralaproperty.in/member/myhome/";
		 String act=driver.getCurrentUrl();
		 if(exp.equals(act)) {
			 System.out.println("pass");
		 }else {
			 System.out.println("fail");
		 }
		
		 
	}

}
