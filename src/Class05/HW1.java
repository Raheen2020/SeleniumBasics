package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");
        WebDriver driver= new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[contains(@id, 'Password')] ")).sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        Boolean isLogoDisplayed= driver.findElement(By.xpath("//img[contains(@src, '/humanresources/')]")).isDisplayed();
        if(isLogoDisplayed==true){
            System.out.println("the logo is displayed");
        }
        Thread.sleep(2000);
        driver.close();
    }
}