package tests;

import org.junit.jupiter.api.Test;
import pageobjects.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest extends BaseTest {
    CalculationPage calculationPage;
    ResultPage resultPage;
    FirstDigitInputPage firstDigitInputPage;
    SecondDigitInputPage secondDigitInputPage;
    AnswerComparisionPage answerComparisionPage;


    @Test
    void userCanSubtract() {
        calculationPage = new CalculationPage(driver);
        resultPage = new ResultPage(driver);
        firstDigitInputPage = new FirstDigitInputPage(driver);
        secondDigitInputPage = new SecondDigitInputPage(driver);
        answerComparisionPage = new AnswerComparisionPage(driver);


        firstDigitInputPage.typeDigitIntoFirstField("3");
        calculationPage.clickSubstractSymbol();
        secondDigitInputPage.typeDigitIntoSecondField("2");
        resultPage.clickCalculationButton();

        String actualNumber = answerComparisionPage.getAnswerNumber();
        String expectedNumber = "1";

        assertEquals(expectedNumber, actualNumber);
    }


}
