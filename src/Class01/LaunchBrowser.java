package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class LaunchBrowser {

    public static void main (String [] args){

        System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxtechs.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title =  driver.getTitle();
        System.out.println(title);


    }

}