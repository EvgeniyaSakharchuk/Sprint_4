package checklistofquestion;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By
import static org.junit.Assert.assertEquals;
import static pageobject.MainPage.*;

@RunWith(Parameterized.class)
public class MainPageQuestions extends BaseTest {
    static MainPage mainPage
    private static String answer_text_expected;
    private static By question_click;
    private static By answer;
//testdata
    public MainPageQuestions(String answer_text_expected, By question_click, By answer) {
        this.answer_text_expected = answer_text_expected;
        this.question_click = question_click;
        this.answer = answer;
    }

    @Parameterized.Parameters

    public static Object[][] getCredentials() {
        return new Object[][] {
                { questionOneText,questionOne ,answerOne},
                { questionTwoText, questionTwo, answerTwo},
                { questionThreeText, questionThree, answerThree},
                { questionFourText, questionFour, answerFour},
                { questionFiveText, questionFive, answerFive},
                { questionSixText, questionSix, answerSix},
                { questionSevenText, questionSeven, answerSeven},
                { questionEightText, questionEight, answerEight}
        };
    }

    @Test
    public void checkActualText_expectText(){
        super.implicitlyWait(10);
        MainPage mainPage = new MainPage(driver);
        mainPage.Open();
        String actualQuestion = mainPage.clickQuest(question_click);
        String actualAnswer = mainPage.answerDisplayed(answer);
        assertEquals(answer_text_expected, question_click, answer);
    }

}