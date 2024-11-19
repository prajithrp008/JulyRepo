package Xpath;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkcount {
    EdgeDriver driver;
    
    @Before
    public void fbLink() {
        driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
    }
    
    @Test
    public void liCount() {
        List<WebElement> lin = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links = " + lin.size());
        
        for (WebElement link : lin) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) { // Only verify if URL is not null or empty
                System.out.println("Link url: " + url);
                verify(url);  // Correct method name and parameter type
            }
        }
    }
    
    private void verify(String link) {
        try {
            URI ob = new URI(link);
            HttpURLConnection con = (HttpURLConnection) ob.toURL().openConnection();
            con.setRequestMethod("GET"); // Ensure it's a GET request
            con.connect();
            
            int responseCode = con.getResponseCode();
            if (responseCode == 200) {
                System.out.println("Success: Response code 200 ---- " + link);
            } else if (responseCode == 404) {
                System.out.println("Broken link: Response code 404 ---- " + link);
            } else {
                System.out.println("Other response code: " + responseCode + " ---- " + link);
            }
        } catch (Exception e) {
            System.out.println("Error verifying link: " + link + " -> " + e.getMessage());
        }
    }
}
