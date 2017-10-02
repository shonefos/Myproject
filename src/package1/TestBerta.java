package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Meridian on 4/26/2017.
 */
public class TestBerta {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("http://testberta.plusplus.rs/tarantula/#!home");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        //Logovanje

        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div/div[1]/input[1]")).sendKeys("nenads1979@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div/div[1]/input[2]")).sendKeys("1234");
        driver.findElement(By.cssSelector("div.top > button:nth-of-type(2)")).click();
        Thread.sleep(2000);
        String balance = driver.findElement(By.cssSelector("div.title > div.gwt-Label.value")).getText();
        System.out.println(balance);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div.match > div.games > div:first-child > div.game > div.three > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(2000);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.button-wrapper.one > button:first-child")).click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        System.out.println(balance);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div.match > div.games > div:first-child > div.game > div.three > div:nth-of-type(3) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        System.out.println(balance);





    }


}