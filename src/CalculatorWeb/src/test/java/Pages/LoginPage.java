package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {



    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[contains(text(),'Login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Open Calculator')]") //
    private WebElement newButton;


    public LoginPage(WebDriver driver){
        super(driver);

    }


    public void userAtHomePage() {
        driver.get("https://catchylabs-webclient.testinium.com/");
    }

    public  void  login(String username, String password){

        var waits = new WebDriverWait(driver, Duration.ofSeconds(1));

        waits.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.sendKeys(username);


        waits.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(password);

        waits.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public  void  buttonCheck(){

        var waits = new WebDriverWait(driver, Duration.ofSeconds(1));
        waits.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
    }


    public void checkMessage(String username) {
    }
}



