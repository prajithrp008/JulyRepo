package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Keralapptypoibin {
	WebDriver driver;
	@BeforeTest
	public void setterrr() {
	 driver=new EdgeDriver();
	 driver.get("https://keralaproperty.in/member/login/");
		
	}
	@Test
	public void login() throws Exception {
		FileInputStream ob=new FileInputStream("D:\\pi\\p.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("sheet1");
		int r=sh.getLastRowNum();
		for(int i=1;i<=r;i++) {
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys(password);
			
			driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
			driver.navigate().refresh();
			
			
		}
		
		
	}
	

}
