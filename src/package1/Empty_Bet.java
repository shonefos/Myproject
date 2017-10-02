package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

/**
 * Created by Meridian on 4/20/2017.
 */
public class Empty_Bet {

    private static Object element;
    private static Object e;
    private JButton button1;
    private JPanel panel1;

    public Empty_Bet() {
        JButton button1 = new JButton("Click me.");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {





            }




        });
    }

    public static void main(String[] args) throws InterruptedException {

        JFrame frame= new JFrame("eempty");
        frame.setContentPane(new Empty_Bet().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://stageberta.meridianbet.com/tarantula/index.jsp");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='login']/div[2]/div/div[1]/input[1]")).sendKeys("nenads1979@gmail.com");
        driver.findElement(By.xpath(".//*[@id='login']/div[2]/div/div[1]/input[2]")).sendKeys("Meridian@01");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.top > button:nth-of-type(2)")).click();
        Thread.sleep(3500);
        driver.findElement(By.cssSelector("div.buttons > div:nth-of-type(13) > div.gwt-Label")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.content > textarea:nth-of-type(1)")).sendKeys("Slobodna igra automatski");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.content > textarea:nth-of-type(2)")).sendKeys("golovi3+ automatski");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:nth-of-type(1)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        try {
            while (driver.findElement(By.cssSelector("div.popup.loader.bounceInDown")).isDisplayed()) {
               driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
           }

         } catch (NoSuchElementException e) {
           System.out.println(e);
         }

        try {
            if (driver.findElement(By.cssSelector("div.popup.alert.bounceInDown")).isDisplayed())  {
                driver.findElement(By.cssSelector("div.button-wrapper.one > button:first-child")).click();
            }

        } catch (NoSuchElementException e) {
            System.out.println(e);
        }

        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();



        }


}

