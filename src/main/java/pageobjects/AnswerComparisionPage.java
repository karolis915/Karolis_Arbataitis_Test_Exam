package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnswerComparisionPage extends BasePage {
    @FindBy(css = "#answer")
    private WebElement answerNumber;

    public AnswerComparisionPage(WebDriver driver) {
        super(driver);
    }

    public String getAnswerNumber() {
        return answerNumber.getText();
    }
}
