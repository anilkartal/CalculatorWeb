package stepDefinitions;

import Pages.CalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import util.DriverFactory;
import static org.junit.Assert.*;
public class CalculatorPageStepDefinitions {
    CalculatorPage page ;
    @Given("Calculate")
    public void calculate() {
         page  = new CalculatorPage(DriverFactory.getDriver());
        page.calculate();
    }
    @When("ResultCheckTrue {int}")
    public void resultCheckTrue(Integer int2) {

       var result = page.GetResult();
        var resultInteger = Integer.parseInt(result);
        assertEquals("Hesaplanan değer beklenenle uyuşmuyor." , resultInteger, (int)int2);


    }
    @When("ResultCheck {int}")
    public void resultCheck(Integer int2) {

       var result = page.GetResult();
        var resultInteger = Integer.parseInt(result);
        assertEquals("Hesaplanan değer beklenenle uyuşmuyor." , resultInteger, (int)int2);


    }
}
