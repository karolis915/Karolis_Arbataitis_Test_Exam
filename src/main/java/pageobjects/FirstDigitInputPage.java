package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstDigitInputPage extends BasePage {
    @FindBy(css = "#number1")
    private WebElement inputDigitIntoFirstField;

    public FirstDigitInputPage(WebDriver driver) {
        super(driver);
    }

    public void typeDigitIntoFirstField(String digit) {
        inputDigitIntoFirstField.sendKeys(digit);
    }

}
