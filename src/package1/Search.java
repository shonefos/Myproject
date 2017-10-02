package package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Meridian on 5/2/2017.
 */
public class Search {

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


        //PRETRAGA
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("div.search > input.gwt-TextBox")).click();
        driver.findElement(By.cssSelector("div.search > input.gwt-TextBox")).sendKeys("arsen");
        driver.findElement(By.cssSelector("div.search-icon")).click();
        Thread.sleep(2000);
        if (driver.findElement(By.cssSelector("div.match.live")).getText().contains("ARSENAL"))
        {
            System.out.println("Pretraga rivala uspesno realizovana!!!");
        }
        else {
            System.out.println("Pretraga rivala neuspesna :(");
        }



    }
}

