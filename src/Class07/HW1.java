package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        String url="https://demoqa.com/browser-windows";
        driver.get(url);
        driver.manage().window().maximize();
        String mainpagehandle= driver.getWindowHandle();
        System.out.println("Parent "+mainpagehandle);
        System.out.println("===========================================================================================");
        WebElement newtab= driver.findElement(By.id("tabButton"));
        newtab.click();
        Thread.sleep(1000);
        Set<String> st=driver.getWindowHandles();
        Iterator<String> it=st.iterator();
        while (it.hasNext())
        {
            String childhandle=it.next();
            if (!childhandle.equals( mainpagehandle )) {
                driver.switchTo().window(childhandle);
                System.out.println("Child : "+childhandle);
                driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
                WebElement title1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
                System.out.println("information : "+title1.getText());
                driver.close();
            }}
        Thread.sleep(1000);
        driver.switchTo().window(mainpagehandle);
        System.out.println("====================================================================================");
        WebElement newwindw= driver.findElement(By.id("windowButton"));
        newwindw.click();
        Thread.sleep(1000);
        Set<String> st2=driver.getWindowHandles();
        Iterator<String> it1=st2.iterator();
        while (it1.hasNext())
        {
            String childhandle1=it1.next();
            if (!childhandle1.equals( mainpagehandle )) {
                driver.switchTo().window(childhandle1);
                System.out.println("Child : "+childhandle1);
                driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
                WebElement title2 = driver.findElement(By.id("sampleHeading"));
                System.out.println("information : "+title2.getText());
                driver.close();
            }}
        Thread.sleep(1000);
        driver.switchTo().window(mainpagehandle);
        System.out.println("============================================================================================");
        WebElement newwindowpage= driver.findElement(By.id("messageWindowButton"));
        newwindowpage.click();
        Set<String> st3=driver.getWindowHandles();
        Iterator<String> it3=st3.iterator();
        while (it3.hasNext())
        {
            String childhandle3=it3.next();
            if (!childhandle3.equals( mainpagehandle )) {
                driver.switchTo().window(childhandle3);
                System.out.println("Child : "+childhandle3);
                driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
                WebElement title3 = driver.findElement(By.xpath("//body"));
                System.out.println("information : "+title3.getText());
                driver.quit();
            }}
        Thread.sleep(1000);
        driver.switchTo().window(mainpagehandle);
    }
}
