package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenCalculatorPage extends BasePage {



    @FindBy(xpath = "//div[contains(text(),'Open Calculator')]") //
    private WebElement openButton;


    public OpenCalculatorPage(WebDriver driver){
        super(driver);

    }

    public  void  OpenCalculatorButton(){
        var waits = new WebDriverWait(driver, Duration.ofSeconds(1));
        waits.until(ExpectedConditions.elementToBeClickable(openButton));
        openButton.click();
    }


}



