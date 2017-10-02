package package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Meridian on 5/1/2017.
 */
public class Format_odds {
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
        String balance = driver.findElement(By.cssSelector("div.title > div.gwt-Label.value")).getText();
        System.out.println("Trenutno stanje na računu: " + balance);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.title > div.gwt-Label.label")).click();
        Thread.sleep(1000);
        String bonus = driver.findElement(By.cssSelector("div.list > div:nth-of-type(4) > div.balance-wrapper > div.gwt-Label.value")).getText();
        System.out.println("Trenutno stanje na bonus računu: " + bonus);

        System.out.println(" --------- Provera formata kvota --------- ");
        driver.findElement(By.cssSelector("div.img > img")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#price-format-selector > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#price-format-selector > div.dropdown > div:nth-of-type(1) > div.title")).click();
        Thread.sleep(5000);
        String frakcionalne = driver.findElement(By.cssSelector("div.panel.half.live > div.matches > div:first-child > div:nth-of-type(2) > div:first-child > div.games > div:first-child > div.game > div.three > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).getText();
        System.out.println("Frakcione kvote su : " + frakcionalne);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#price-format-selector > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#price-format-selector > div.dropdown > div:nth-of-type(3) > div.title")).click();
        Thread.sleep(5000);
        String americkekvote = driver.findElement(By.cssSelector("div.panel.half.live > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div.games > div:first-child > div.game > div.three > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).getText();
        System.out.println("Americke kvote su : " + americkekvote);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#price-format-selector > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#price-format-selector > div.dropdown > div:nth-of-type(2) > div.title")).click();
        Thread.sleep(5000);
        String decimalne = driver.findElement(By.cssSelector("div.panel.half.live > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div.games > div:first-child > div.game > div.three > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).getText();
        System.out.println("Decimalne kvote su : " + decimalne);







    }
}
