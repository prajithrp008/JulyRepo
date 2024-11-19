package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createloginpage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"reg_pages_msg\"]/a")
    WebElement create;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div/div/span/a")
    WebElement signup;

    public Createloginpage(WebDriver driver2) {
        this.driver = driver2;  // Use driver2 here
        PageFactory.initElements(driver, this);
    }

    public void process() {
        create.click();
        String src = driver.getPageSource();
        if (src.contains("Create a new account")) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }
        signup.click();
    }
}
