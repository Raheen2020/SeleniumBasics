package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

    public static void main (String [] args){

        System.setProperty("webdriver.chrome.driver","/Users/raheen/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://Amazon.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title =  driver.getTitle();
        System.out.println(title);


    }
}