package package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Meridian on 4/25/2017.
 */
public class AutorizacijaStage {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("https://stageberta.plusplus.rs/tarantula/#!home");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        //LOGOVANJE
        driver.findElement(By.xpath(".//*[@id='login']/div[2]/div/div[1]/input[1]")).sendKeys("nenads1979@gmail.com");
        driver.findElement(By.xpath(".//*[@id='login']/div[2]/div/div[1]/input[2]")).sendKeys("Meridian@01");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.top > button:nth-of-type(2)")).click();
        Thread.sleep(3000);
        try {
            if (driver.findElement(By.cssSelector("div.username > div.gwt-Label.title")).isDisplayed()) {
                System.out.println("Logovanje uspešno!!!");
            }
        } catch (NoSuchElementException | ElementNotVisibleException e) {
            System.out.println("Logovanje nije uspešno");
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



        //LIVE TICKET




    }


}









