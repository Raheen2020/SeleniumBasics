package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        String url="http://www.uitestpractice.com/Students/Contact";
        driver.get(url);
        driver.manage().window().maximize();
        String mainpagehandle=driver.getWindowHandle();
        WebElement linkbttn=driver.findElement(By.xpath("//a[@href='/Students/_P1']"));
        linkbttn.click();
        driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
        WebElement ptext=driver.findElement(By.xpath("//div[@class='ContactUs']"));
        System.out.println(ptext.getText());
        driver.quit();
    }
}
