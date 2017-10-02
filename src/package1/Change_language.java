package package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Meridian on 5/2/2017.
 */
public class Change_language {

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

        //PROMENA JEZIKA

        driver.navigate().refresh();
        System.out.println("PROMENA JEZIKA");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.language > div.dropdown > div:first-child > div.title")).click();
        Thread.sleep(5000);
        String jezik1 = driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).getText();
        String fudbaldanas1 = driver.findElement(By.cssSelector("div.buttons > div:nth-of-type(6) > div.gwt-Label")).getText();
        System.out.println(jezik1 + ":" + fudbaldanas1);
        driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.language > div.dropdown > div:nth-of-type(3) > div.title")).click();
        Thread.sleep(5000);
        String jezik2 = driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).getText();
        String fudbaldanas2 = driver.findElement(By.cssSelector("div.buttons > div:nth-of-type(6) > div.gwt-Label")).getText();
        System.out.println(jezik2 + ":" + fudbaldanas2);
        driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.language > div.dropdown > div:nth-of-type(4) > div.title")).click();
        Thread.sleep(5000);
        String jezik3 = driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).getText();
        String fudbaldanas3 = driver.findElement(By.cssSelector("div.buttons > div:nth-of-type(6) > div.gwt-Label")).getText();
        System.out.println(jezik3 + ":" + fudbaldanas3);
        driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.dropdown > div:nth-of-type(5) > div.title")).click();
        Thread.sleep(5000);
        String jezik4 = driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).getText();
        String fudbaldanas4 = driver.findElement(By.cssSelector("div.buttons > div:nth-of-type(6) > div.gwt-Label")).getText();
        System.out.println(jezik4 + ":" + fudbaldanas4);
        driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.dropdown > div:nth-of-type(6) > div.title")).click();
        Thread.sleep(5000);
        String jezik5 = driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).getText();
        String fudbaldanas5 = driver.findElement(By.cssSelector("div.buttons > div:nth-of-type(6) > div.gwt-Label")).getText();
        System.out.println(jezik5 + ":" + fudbaldanas5);
        driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.dropdown > div:nth-of-type(10) > div.title")).click();
        Thread.sleep(5000);
        String jezik6 = driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).getText();
        String fudbaldanas6 = driver.findElement(By.cssSelector("div.buttons > div:nth-of-type(6) > div.gwt-Label")).getText();
        System.out.println(jezik6 + ":" + fudbaldanas6);
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.language > div.dropdown > div:nth-of-type(2) > div.title")).click();
        Thread.sleep(6000);









    }
}

