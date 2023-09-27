package Utilities;

import io.cucumber.core.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static io.cucumber.core.logging.Logger.*;

public class DriverClass {

    private static WebDriver driver;

    public static WebDriver getDriver(){


        if (driver == null) {

            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void quitDriver(){
        driver.quit();
        driver = null;


       // System.out.println();
    }
}


