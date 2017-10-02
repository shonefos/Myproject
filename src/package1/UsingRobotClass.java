package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;


/**
 * Created by Meridian on 4/17/2017.
 */
public class UsingRobotClass {

    public static void main (String[] args) throws InterruptedException, AWTException {



        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Robot robot = new Robot();
        driver.get("https://meridianbet.rs");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.login-top > span:nth-of-type(2) > input:nth-of-type(1)")).sendKeys("nenads1979@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#password-input")).sendKeys("jardel16");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.button.signin")).click();
        // kretanje misa
        //robot.mouseMove(400, 305);
        //Thread.sleep(3000);
        //robot.mousePress(InputEvent.BUTTON1_MASK);
        //robot.mouseRelease(InputEvent.BUTTON1_MASK);













    }


}
