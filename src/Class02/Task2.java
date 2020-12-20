package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_b")).sendKeys("Ahmad");
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_d")).sendKeys("Raheen");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("0700404516");
        Thread.sleep(2000);
        driver.findElement(By.id("password_step_input")).sendKeys("991raheen");
        driver.findElement(By.id("u_1_9")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
