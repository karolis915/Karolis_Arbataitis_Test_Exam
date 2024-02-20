package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#calculate")
    private WebElement calculationButton;


    public void clickCalculationButton() {
        calculationButton.click();
    }

}