package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/raheen/Documents/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='tab-content']//p[2]//a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(@class, 'fade active')]//div[1]//a[1]")).click();
        driver.findElement(By.xpath("//form[contains(@id,'input')]//div[1]//input")).sendKeys("Mete");
        driver.findElement(By.xpath("//form[contains(@id,'input')]//button[1]")).click();
        Thread.sleep(3000);
        driver.close();
        }
        }
