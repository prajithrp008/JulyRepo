package Xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Rediffradio {
    EdgeDriver driver;

    @Before
    public void setup() {
        // Initialize the EdgeDriver
        driver = new EdgeDriver();
        // Open the Rediff registration page
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }

    @Test
    public void checkRadioButton() {
        // Find the male radio button using its XPath (adjust XPath if necessary)
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='m']"));
        WebElement radioButtonn=driver.findElement(By.xpath("//*[@value='f']"));
        
        // Check if the radio button is selected
        if (radioButtonn.isSelected()) {
            System.out.println("Radio button is selected");
        } else {
            System.out.println("Radio button is not selected");
        }
    }
}
