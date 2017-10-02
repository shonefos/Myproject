package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Meridian on 5/10/2017.
 */
public class Ccx {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://techno-geek.co.uk/SeleniumPractice/Form2.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("John Doe");
        driver.findElement(By.id("password")).sendKeys("John1234");






    }


}
