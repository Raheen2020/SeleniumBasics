package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");
        WebDriver driver= new ChromeDriver();
        //launching semple website
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        //get the list of elements with a tag Name-a
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        //get the size
        System.out.println("The numberof Link on page: " + allLinks.size());
        // print the links with a text:
        for (WebElement link:allLinks) {
            if(!link.getText().isEmpty())
                System.out.println(link.getText()+ " :"+ link.getAttribute("href"));
        }
        Thread.sleep(3000);
        driver.quit();
    }
}

