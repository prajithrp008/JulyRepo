package testngpkg;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chattrivago {

    WebDriver driver;

    @BeforeTest
    public void test() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.trivago.com.tr/#");
    }

    @Test
    public void datepicker() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[3]/div/div/button[2]/span/span[2]/span[2]")).click();
        datepickermethod("December 2024", "23");
    }

    private void datepickermethod(String expmonth, String expdate) {
        while (true) {
            String month = driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[1]/h3")).getText();
            System.out.println("month=" + month);
            if (month.equals(expmonth)) {
                break;
            } else {
                driver.findElement(By.xpath("/html/body/div[3]/div/section/main/div/div/div/div[2]/div[3]/h3")).click();
            }
        }

        List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div/div/div/button/time"));
        for (WebElement d : dates) {
            String datetext = d.getText();
            if (datetext.equals(expdate)) {
                d.click();
                break;
            }
        }
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
