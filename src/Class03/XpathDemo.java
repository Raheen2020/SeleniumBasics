package Class03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class XPathDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/raheen/eclipse-workspace/SeleniumBasics/Drivers/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
        driver.findElement(By.xpath("//input[contains(@id, 'username')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value = 'Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text() = 'Logout']")).click();
        driver.quit();
    }
}
