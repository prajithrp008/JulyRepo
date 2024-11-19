package Packages;

import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.implementation.bytecode.constant.FieldConstant;

public class Eshtamullasite {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://chatgpt.com/");
		String actualtitle=driver.getTitle();
		String expectedtitle="ChatGPT";
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		String src=driver.getPageSource();
		String expectedsrcc="By messaging";
		if(src.equals(expectedsrcc)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		driver.quit();
	}

}
