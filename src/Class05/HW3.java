package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");
        WebDriver driver= new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input[id^='txtU'] ")).sendKeys("Admin");
        driver.findElement(By.id("btnLogin")).click();
        boolean isErrorDisplayed= driver.findElement(By.cssSelector("span[id='spanMessage']")).isDisplayed();
        if( isErrorDisplayed){
            System.out.println("Password cannot be empty text is displayed");
        }
    }

}
