package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

 public static void main (String[]Args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");
     WebDriver driver = new ChromeDriver();
     driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
     driver.findElement(By.xpath("//input[@name = 'txtUsername']")).sendKeys("Admin");
     driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys("Hum@nhrm123");
     driver.findElement(By.xpath("//input[@id = 'btnLogin']")).click();
     Thread.sleep(1000);
     WebElement logo = driver.findElement(By.cssSelector("img[src $='syntax.png']"));
     boolean isLogoDisplayed = logo.isDisplayed();
     System.out.println(isLogoDisplayed);
     driver.quit();
 }
}
