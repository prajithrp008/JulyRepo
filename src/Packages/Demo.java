package Packages;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();//to open firefox browser
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("pass");
		}else {
			System.out.println("fail");
			
		}
		driver.quit();

	}

}
