package package1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Meridian on 3/31/2017.
 */
public class Screenshot {

    public static void main (String[] args) throws IOException {

        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Firefox driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.mobile.de/");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile,new File("C:\\Selenium\\slika.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
