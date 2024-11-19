package Xpath;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Rediff {
   EdgeDriver driver;
   @Before
   public void rSetup() {
	   driver=new EdgeDriver();
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
   }
   @Test
   public void rTest1() {
	   List<WebElement>li=driver.findElements(By.tagName("a"));
	   System.out.println("ttl links ="+li.size());
	   for(WebElement cnt: li) {
		   if(li.size()==30) {
			   System.out.println("verified");
		   }else {
			   System.out.println("not verified");
		   }
		   
	   }
	   }
   @Test
   public void rTest2() {
	   String src=driver.getPageSource();
	   String expectedtitle="Create a Rediffmail account";
		if(src.contains(expectedtitle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	   
   }
}
