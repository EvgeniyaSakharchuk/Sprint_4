package checklistofquestion;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.MainPage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static pageobject.MainPage.*;

public class CheckListQuestions {
    private WebDriver driver;

    @Test
    public void testQuestionOne() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonOneQuestion(questionOne);
        assertEquals(MainPage.questionOneText, mainPage.getTextQuestionOne());  // сравнить текст
    }

    @Test
    public void testQuestionTwo() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonTwoQuestion(questionTwo);
        assertEquals(MainPage.questionTwoText, mainPage.getTextQuestionTwo());  // сравнить текст
    }

    @Test
    public void testQuestionThree() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonThreeQuestion(questionThree);
        assertEquals(MainPage.questionThreeText, mainPage.getTextQuestionThree());  // сравнить текст
    }

    @Test
    public void testQuestionFour() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonFourQuestion(questionFour);
        assertEquals(MainPage.questionFourText, mainPage.getTextQuestionFour());  // сравнить текст
    }

    @Test
    public void testQuestionFive() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonFiveQuestion(questionFive);
        assertEquals(MainPage.questionFiveText, mainPage.getTextQuestionFive());  // сравнить текст
    }

    @Test
    public void testQuestionSix() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonSixQuestion(questionSix);
        assertEquals(MainPage.questionSixText, mainPage.getTextQuestionSix());  // сравнить текст
    }

    @Test
    public void testQuestionSeven() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonSevenQuestion(questionSeven);
        assertEquals(MainPage.questionSevenText, mainPage.getTextQuestionSeven());  // сравнить текст
    }

    @Test
    public void testQuestionEight() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonEightQuestion(questionEight);
        assertEquals(MainPage.questionEightText, mainPage.getTextQuestionEight());  // сравнить текст
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
