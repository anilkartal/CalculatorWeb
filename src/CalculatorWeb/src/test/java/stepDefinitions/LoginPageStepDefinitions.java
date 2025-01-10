package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage= new LoginPage(driver);


    @Given("User at home page")
    public void userAtHomePage() {

        loginPage.userAtHomePage();
    }


    @When("Load user and Password")
    public void loadUserAndPassword() {
        loginPage.login("anil.kartal","clabsanilkartal");
    }

    @When("Load Click login")
    public void click_Login() {
        loginPage.buttonCheck();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {

        loginPage.checkMessage(username);

    }
}


