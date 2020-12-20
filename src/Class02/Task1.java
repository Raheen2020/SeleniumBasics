package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class HomeWork {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("http://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.partialLinkText("Register")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Ahmad");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Raheen");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("10 clover ct");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Manassas");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20109");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("7038659594");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.ssn")).sendKeys("0000000000");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).sendKeys("Tester");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.password")).sendKeys("Test123");
        Thread.sleep(2000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("Test123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
        Thread.sleep(2000);
        driver.close();


    }
}