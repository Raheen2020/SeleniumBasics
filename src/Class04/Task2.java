package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {

    public static void main (String[]args){

        System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement links : allLinks) {
            String a = links.getAttribute("href");
            String b = links.getText();
            if (!b.isEmpty()) {
                System.out.println(a + "      " + b);
            }
        }
    }
}
