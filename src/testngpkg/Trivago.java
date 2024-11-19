package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago{
	
	FirefoxDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.booking.com/index.en-gb.html?aid=2336990;label=en-in-booking-desktop-LVoY5i6snT76B3xr29egoAS652804038422:pl:ta:p1:p2:ac:ap:neg:fi:tikwd-11485468118:lp9040212:li:dec:dm;ws=&gclid=Cj0KCQjwj4K5BhDYARIsAD1Ly2okZA1OVuEYaaH763xjtFXCj13JP7OR8dlZgp8TPJYO15nth1YMoiIaAn2BEALw_wcB");
	}
	
	@Test
	public void datepicker()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div[2]/div/div[1]/button[1]/span")).click();
		datepickermethod("December 2024","23");
		
	}
	
	private void datepickermethod(String expmonth,String expdate) {
		while(true) {
	String month=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div[2]/div/div[2]/div/nav/div[2]/div/div[1]/div/div[1]/h3")).getText();
	System.out.println("month="+expmonth);
	if(month.equals(expmonth))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div[2]/div/div[2]/div/nav/div[2]/div/div[1]/button/span/span/svg/path")).click();
	}
		}
		
		List<WebElement> date= driver.findElements(By.xpath("/html/body/div[3]/div[2]/div/form/div/div[2]/div/div[2]/div/nav/div[2]/div/div[1]/div/div[2]/table/tbody/tr/td/span"));
		for(WebElement d:date)
		{
			String datetext=d.getText();
			if(datetext.equals(expdate))
			{
				d.click();
				break;
			}
		}
	
	}

}