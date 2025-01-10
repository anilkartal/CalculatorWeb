package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalculatorPage  extends BasePage{


    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[13]")
    private WebElement _1;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[14]")
    private WebElement _2;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[15]")
    private WebElement _3;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[9]")
    private WebElement _4;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[10]")
    private WebElement _5;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[11]")
    private WebElement _6;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[5]")
    private WebElement _7;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[6]")
    private WebElement _8;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[7]")
    private WebElement _9;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[17]")
    private WebElement _0;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[12]")
    private WebElement _eksi;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/div[20]")
    private WebElement _esit;


       @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div/span")
    private WebElement sonuc;



    public CalculatorPage(WebDriver driver) {
        super(driver);
    }


    public  void  calculate(){
        var waits = new WebDriverWait(driver, Duration.ofSeconds(1));
        waits.until(ExpectedConditions.elementToBeClickable(_1));
        _1.click();
        waits.until(ExpectedConditions.elementToBeClickable(_0));
        _0.click();
        waits.until(ExpectedConditions.elementToBeClickable(_0));
        _0.click();
        waits.until(ExpectedConditions.elementToBeClickable(_0));
        _0.click();

        waits.until(ExpectedConditions.elementToBeClickable(_eksi));
        _eksi.click();

        waits.until(ExpectedConditions.elementToBeClickable(_8));
        _8.click();
        waits.until(ExpectedConditions.elementToBeClickable(_0));
        _0.click();
        waits.until(ExpectedConditions.elementToBeClickable(_0));
        _0.click();

        waits.until(ExpectedConditions.elementToBeClickable(_esit));
        _esit.click();

    }

    public String GetResult(){
        var waits = new WebDriverWait(driver, Duration.ofSeconds(1));

        return sonuc.getText().replace("= ","");
    }
}
