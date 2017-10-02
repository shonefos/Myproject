package package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Meridian on 4/26/2017.
 */
public class Stage1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("https://stageberta.plusplus.rs/tarantula/#!home");
        driver.manage().window().maximize();
        Thread.sleep(8000);

        //LOGOVANJE
        driver.findElement(By.xpath(".//*[@id='login']/div[2]/div/div[1]/input[1]")).sendKeys("nenads1979@gmail.com");
        driver.findElement(By.xpath(".//*[@id='login']/div[2]/div/div[1]/input[2]")).sendKeys("Meridian@01");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.top > button:nth-of-type(2)")).click();
        Thread.sleep(4000);
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



        //SINGL TIKET
        System.out.println("SINGL TIKET");
        driver.findElement(By.cssSelector("div.matches > div:first-child > div:nth-of-type(2) > div:first-child > div.games > div:nth-of-type(2) > div.game > div.two > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(2000);
        String stake = driver.findElement(By.xpath("//*[@id=\"ticket\"]/div[6]/div[1]/div[2]")).getText();
        System.out.println("Singl tiket odigran za: " + stake);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(3000);
        String balance1 = driver.findElement(By.cssSelector("div.title > div.gwt-Label.value")).getText();

        //PROVERA STANJA RACUNA
        double x = Double.parseDouble(balance.split(" ")[0]);
        double y = Double.parseDouble(balance1.split(" ")[0]);
        System.out.println("Razlika na računu: "+(y-x));
        Thread.sleep(2000);

        //TIKET SA BONUS RACUNA
        System.out.println("TIKET SA BONUS RACUNA");
        driver.findElement(By.cssSelector("div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div.games > div:nth-of-type(2) > div.game > div.two > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        String bonusstake = driver.findElement(By.xpath("//*[@id=\"ticket\"]/div[6]/div[1]/div[2]")).getText();
        System.out.println("Bonus tiket odigran za: " + bonusstake);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.bonus > span.gwt-RadioButton.type > input")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.title > div.gwt-Label.label")).click();
        Thread.sleep(1000);
        String bonus1 = driver.findElement(By.cssSelector("div.list > div:nth-of-type(4) > div.balance-wrapper > div.gwt-Label.value")).getText();

        //PROVERA STANJA BONUS RACUNA
        double z = Double.parseDouble(bonus.split(" ")[0]);
        double w = Double.parseDouble(bonus1.split(" ")[0]);
        System.out.printf("Razlika na bonus računu: " + "%.2f", (w-z));
        Thread.sleep(2000);
        System.out.println("Bonus OK!!!");

        //TIKET 2 PARA
        System.out.println("TIKET 2 PARA");
        Thread.sleep(500);
        jse.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div.games > div:first-child > div.game > div.three > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(3) > div.games > div:first-child > div.game > div.three > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.value > div:nth-of-type(2)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(1500);

        //TIKET 3 PARA
        System.out.println("TIKET 3 PARA");
        driver.findElement(By.cssSelector("div.matches > div:first-child > div:nth-of-type(2) > div:first-child > div.games > div:nth-of-type(2) > div.game > div.two > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div.games > div:first-child > div.game > div.three > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(3) > div.games > div:first-child > div.game > div.three > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(1000);

        //SISTEMSKI TIKET BEZ BANKERA
        System.out.println("SISTEMSKI TIKET BEZ BANKERA");
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:first-child > div.games > div:first-child > div.game > div.three > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div.games > div:first-child > div.game > div.three > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(3) > div.games > div:first-child > div.game > div.three > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(4) > div.games > div:first-child > div.game > div.three > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.header > div:nth-of-type(3)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.multibet-wrapper > div:nth-of-type(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.value > div:nth-of-type(2)")).click();
        driver.findElement(By.cssSelector("div.value > div:nth-of-type(2)")).click();
        driver.findElement(By.cssSelector("div.value > div:nth-of-type(2)")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(1000);

        //SISTEMSKI TIKET SA BANKEROM
        System.out.println("SISTEMSKI TIKET SA BANKEROM");
        driver.findElement(By.cssSelector("div.matches > div:first-child > div:nth-of-type(2) > div:first-child > div.games > div:nth-of-type(2) > div.game > div.two > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div.games > div:first-child > div.game > div.three > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(3) > div.games > div:first-child > div.game > div.three > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(4) > div.games > div:first-child > div.game > div.three > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(5) > div.games > div:first-child > div.game > div.three > div:nth-of-type(2) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.header > div:nth-of-type(3)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.games > div:first-child > div.game.even > div.gwt-Label.banker")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.games > div:nth-of-type(2) > div.game.odd > div.gwt-Label.banker")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.multibet-wrapper > div:nth-of-type(2)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.value > input.gwt-TextBox")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.value > input.gwt-TextBox")).sendKeys("3.6");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(2000);

        // PROVERA TIKETA
        System.out.println("PROVERA TIKETA");
        driver.findElement(By.cssSelector("div.button.ticket-check > div.gwt-Label.time.tablet-hidden")).click();
        driver.findElement(By.cssSelector("div.content > input.gwt-TextBox")).sendKeys("1153625160145");
        driver.findElement(By.cssSelector("button.enabled")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("div.button-wrapper.one > div:first-child")).click();
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,-250)", "");

        //SLOBODNA IGRA
        System.out.println("SLOBODNA IGRA");
        driver.findElement(By.cssSelector("div.buttons > div:nth-of-type(13) > div.gwt-Label")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.content > textarea:nth-of-type(1)")).sendKeys("Slobodna igra automatski");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.content > textarea:nth-of-type(2)")).sendKeys("golovi3+ automatski");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:nth-of-type(1)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(4000);

        //SLOBODNA IGRA - CEKANJE AUTORIZACIJE
        WebDriverWait cekalica = new WebDriverWait(driver, 3000);
        Object o = cekalica.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.popup.alert.bounceInDown")));
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.button-wrapper.one > button:first-child")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(1500);

        //KENO
        System.out.println("KENO");
        driver.findElement(By.cssSelector("div.buttons > div:nth-of-type(9) > div.gwt-Label")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.keno-wrapper > div:first-child > div.button > div.ball")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.button.submit")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(1500);

        //LOTTO TIKET
        System.out.println("LOTTO");
        driver.findElement(By.cssSelector("div.button.lotto > div.gwt-Label")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.drawing > div:first-child")).click();
        driver.findElement(By.cssSelector("div.drawing > div:nth-of-type(12)")).click();
        driver.findElement(By.cssSelector("div.gwt-Label.button.submit")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(2000);

        //TIKET SA 4 PARA
        System.out.println("TIKET 4 PARA");
        jse.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.matches > div:first-child > div:nth-of-type(2) > div:first-child > div.games > div:nth-of-type(2) > div.game > div.two > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        driver.findElement(By.cssSelector("div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div.games > div:nth-of-type(2) > div.game > div.two > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(3) > div.games > div:first-child > div.game > div.three > div:nth-of-type(3) > div > div:nth-of-type(2) > div.gwt-Label")).click();
        driver.findElement(By.cssSelector("div > div:nth-of-type(2) > div.matches > div:first-child > div:nth-of-type(2) > div:nth-of-type(4) > div.games > div:first-child > div.game > div.three > div:first-child > div > div:nth-of-type(2) > div.gwt-Label")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.actions.two > a:nth-of-type(2)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.button-wrapper.two > button:first-child")).click();
        Thread.sleep(1000);
        jse.executeScript("window.scrollBy(0,-250)", "");
        Thread.sleep(3500);

        // PROMENA FORMATA KVOTA

        System.out.println("PROMENA FORMATA KVOTA");
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
        driver.findElement(By.cssSelector("div.language > div.chosen > div.gwt-Label.value")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.language > div.dropdown > div:nth-of-type(2) > div.title")).click();
        Thread.sleep(6000);

        // PRETRAGA RIVALA
        System.out.println("PRETRAGA RIVALA");
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

        //REZERVACIJE
        System.out.println("REZERVACIJE");
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


        //PROMENA PODATAKA
        System.out.println("PROMENA PODATAKA");
        driver.findElement(By.cssSelector("div.username > div.gwt-Label.title")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("div.top > div:nth-of-type(1) > div.list > div:nth-of-type(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.account-subnav > div:first-child")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#postal-code")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#postal-code")).clear();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("12111");
        driver.findElement(By.cssSelector("div.wrapper > div:nth-of-type(1)")).click();
        Thread.sleep(3000);

        if (driver.findElement(By.cssSelector("div.content > div.gwt-HTML")).getText().contains("Data changed")) {
            System.out.println("Promena podataka uspesna !!!");
        }
        else {
            System.out.println("Promena podataka nije uspesna");
        }
        driver.findElement(By.cssSelector("div.button-wrapper.one > button:first-child")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.img > img")).click();
        Thread.sleep(3000);

        //TURBO ISPLATA
        System.out.println("TURBO ISPLATA");
        driver.findElement(By.cssSelector("div.username > div.gwt-Label.title")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.account-subnav > div:nth-of-type(6)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.gwt-Label.submit")).click();
        Thread.sleep(1000);
        //jse.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.cssSelector("div.tickets > div:nth-of-type(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.gwt-Label.button.turbo")).click();
        WebDriverWait waittt = new WebDriverWait(driver,3000);
        Object nh = waittt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.popup.alert.bounceInDown")));
        driver.findElement(By.cssSelector("div.button-wrapper.one > button:first-child")).click();
        Thread.sleep(1000);
        //jse.executeScript("window.scrollBy(0,-250)", "");





























    }

}