package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task3 {

    public static void main (String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//System.out.println(allLinks.size());    // printing the size of all Links
        for(WebElement link : allLinks) {
            String fullLink = link.getAttribute("href");  // getting all links
            // System.out.println(fullLink);                 // printing all links
            String linkText = link.getText();                // getting only links with text
            if(!linkText.isEmpty()) {
                System.out.println(linkText);               // printing text from the links with text
            }
        }
        driver.quit();
    }
}
