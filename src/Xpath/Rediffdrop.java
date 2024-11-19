package Xpath;

import org.jspecify.annotations.Nullable;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdrop {
     EdgeDriver driver;
     @Before
     public void rSetupp() {
    	 driver=new EdgeDriver();
    	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    	 }
     @Test
     public void redi() {
    	WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
    	Select ob=new Select(day);
    	ob.selectByValue("22");
    	WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
    	Select ob2=new Select(month);
    	ob2.selectByValue("08");
    	WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
    	Select ob3=new Select(year);
    	ob3.selectByValue("2002");
    	
     }
     @Test
     public void reddiiii() {
    	 String brd=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
    	 if(brd.equals("Check availability")) {
    		 System.out.println("pass");
    	 }else {
    		 System.out.println("fail");
    	 }
    	 
     }
}  
