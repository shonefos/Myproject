package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Meridian on 3/31/2017.
 */
public class Meridianbet {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Firefox driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://meridianbet.rs/");
        Thread.sleep(3500);
        driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[3]/div[1]/div[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[3]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='header']/div[2]/div[2]/div[1]/div[1]/span[2]/input[1]")).sendKeys("nenads1979@gmail.com");
        Thread.sleep(3500);
        driver.findElement(By.xpath(".//*[@id='password-input']")).sendKeys("passss");
        Thread.sleep(3500);
        driver.findElement(By.xpath(".//*[@id='header']/div[2]/div[2]/div[1]/div[1]/span[2]/button")).click();





    }

}
