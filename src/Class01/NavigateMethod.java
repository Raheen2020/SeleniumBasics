package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/raheen/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://facebook.com");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.quit();

    }
}
