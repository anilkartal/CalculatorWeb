package util;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {

    WebDriver driver;
    Properties properties;
    @Before
    public void before() {
        //driver = DriverFactory.initialize_Driver(browser);
    }

    @After
    public void after() {
        //driver.quit();
    }
}