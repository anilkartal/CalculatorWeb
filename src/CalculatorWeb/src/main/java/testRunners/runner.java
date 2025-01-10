package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;


@CucumberOptions(
        features = {"src/test/java/features/Calculate.feature"},
        glue = {"stepDefinitions" , "util"},
        monochrome = true,
        publish = true
)
public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();


}