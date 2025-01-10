package stepDefinitions;

import Pages.OpenCalculatorPage;
import io.cucumber.java.en.Given;
import util.DriverFactory;

public class OpenCalculatorPageStepDefinitions {

    @Given("open Calculator Button")
    public void open_calculator_button() {
        var page  = new OpenCalculatorPage(DriverFactory.getDriver());
        page.OpenCalculatorButton();
    }
//    @Given("open Calculator Button")
//    public void open_calculator_button() {
//        var page  = new OpenCalculatorPage(DriverFactory.getDriver());
//        page.OpenCalculatorButton();
//    }

}

