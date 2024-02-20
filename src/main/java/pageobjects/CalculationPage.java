package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CalculationPage extends BasePage {


    @FindBy(xpath = "//option[@value='minus']")
    private WebElement substractSymbol;


    public CalculationPage(WebDriver driver) {
        super(driver);
    }


    public void clickSubstractSymbol() {
        substractSymbol.click();
    }


}
