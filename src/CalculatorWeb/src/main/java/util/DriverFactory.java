package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import util.ConfigReader;

public class DriverFactory {


    static WebDriver driver;
    static Properties properties;
    private static String browser;


    public static WebDriver initialize_Driver(String browser){
        browser = browser;
        return getDriver();
    }

    public static WebDriver getDriver(){
        if(driver == null){
            new ConfigReader();

            browser = System.getProperty("browser","Chrome");
            switch (browser)
            {
                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case  "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "Safari":
                    driver = new SafariDriver();
                default:
                    throw new IllegalArgumentException("Desteklenmeyen tarayıcı: " + browser);

            }
            String url = System.getProperty("url");
            int impWait = Integer.parseInt(System.getProperty("implicityWait"));
            int pageWait = Integer.parseInt(System.getProperty("pageLoadTimeout"));
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(impWait, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(pageWait, TimeUnit.SECONDS);

        }
        return driver;
    }


}