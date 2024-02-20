package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondDigitInputPage extends BasePage {
    @FindBy(css = "#number2")
    private WebElement inputDigitIntoSecondField;

    public SecondDigitInputPage(WebDriver driver) {
        super(driver);
    }

    public void typeDigitIntoSecondField(String digit) {
        inputDigitIntoSecondField.sendKeys(digit);
    }
}
