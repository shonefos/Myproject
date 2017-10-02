package package1;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Meridian on 5/2/2017.
 */
public class Reservation {

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


        //REZERVACIJE
        driver.findElement(By.cssSelector("div.username > div.gwt-Label.title")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.top > div:nth-of-type(1) > div.list > div:nth-of-type(2)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.account-subnav > div:nth-of-type(5)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#provider-payout-transfer-view > div:nth-of-type(2) > input.gwt-TextBox")).click();
        driver.findElement(By.cssSelector("#provider-payout-transfer-view > div:nth-of-type(2) > input.gwt-TextBox")).sendKeys("1");
        driver.findElement(By.cssSelector("#payout-type")).click();
        Select sel1 = new Select(driver.findElement(By.cssSelector("#payout-type")));
        sel1.selectByVisibleText("Payout");
        Thread.sleep(1500);
        Select sel2 = new Select(driver.findElement(By.cssSelector("#provider-payout-transfer-view > div:nth-of-type(3) > select:nth-of-type(2)")));
        sel2.selectByVisibleText("Ljuba");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#provider-payout-transfer-view > div.input-wrapper.double > button.gwt-Button")).click();
        Thread.sleep(1000);
        System.out.println("Poslata rezervacija od 1 EUR");
        driver.findElement(By.cssSelector("div.button-wrapper.one > button:first-child")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#provider-payout-transfer-view > div:nth-of-type(2) > input.gwt-TextBox")).click();
        driver.findElement(By.cssSelector("#provider-payout-transfer-view > div:nth-of-type(2) > input.gwt-TextBox")).sendKeys("2");
        driver.findElement(By.cssSelector("#provider-payout-transfer-view > div.input-wrapper.double > button.gwt-Button")).click();
        Thread.sleep(1000);
        System.out.println("Poslata rezervacija od 2 EUR");
        driver.findElement(By.cssSelector("div.button-wrapper.one > button:first-child")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#provider-payout-transfer-view > div:nth-of-type(2) > input.gwt-TextBox")).click();
        driver.findElement(By.cssSelector("#provider-payout-transfer-view > div:nth-of-type(2) > input.gwt-TextBox")).sendKeys("3");
        driver.findElement(By.cssSelector("#provider-payout-transfer-view > div.input-wrapper.double > button.gwt-Button")).click();
        Thread.sleep(1000);
        System.out.println("Poslata rezervacija od 3 EUR");
        driver.findElement(By.cssSelector("div.button-wrapper.one > button:first-child")).click();




    }
}
