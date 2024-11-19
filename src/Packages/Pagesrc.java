package Packages;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Pagesrc {
    static String baseurl="https://www.google.com";
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		String expectedtitle="Gmail";
		if(src.contains(expectedtitle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

	}

}
