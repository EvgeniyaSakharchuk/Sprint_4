package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final String site = "https://qa-scooter.praktikum-services.ru/";

    public void openSite() {
        driver.get(site);
    }
    // открытие главной страницы
    public static By orderButtonAbove = By.xpath(".//button[@class='Button_Button__ra12g']");
    // кнопка Заказать в шапке
    public static By orderButtonCenter = By.xpath(".//button[contains(@class, 'Button_Middle__1CSJM')]");
    // кнопка заказать в центре
    private final By questionImportant = By.xpath(".//div[text()='Вопросы о важном']");
    // заголовок Вопросы о важном
    private final By cookieButton = By.id("rcc-confirm-button");
    // кнопка куки

    //------------ Блок Вопросы -----------------
    public static By questionOne = By.id("accordion__heading-0");
    //вопрос №1 стоимость и оплата
    public static By questionTwo = By.id("accordion__heading-1");
    //вопрос №2 заказ нескольких самокатов
    public static By questionThree = By.id("accordion__heading-2");
    //вопрос №3 расчет времени аренды
    public static By questionFour = By.id("accordion__heading-3");
    //вопрос №4 заказ самоката на сегодня
    public static By questionFive = By.id("accordion__heading-4");
    //вопрос №5 продление или возврат раньше срока
    public static By questionSix = By.id("accordion__heading-5");
    //вопрос №6 зарядка с самокатом
    public static By questionSeven = By.id("accordion__heading-6");
    //вопрос №7 отмена заказа
    public static By questionEight = By.id("accordion__heading-7");
    //вопрос №8 доставка за МКАД

    //------------- Ответы на вопросы -----------
    public static By answerOne = By.id("accordion__panel-0");
    //Ответ на вопрос №1
    public static By answerTwo = By.id("accordion__panel-1");
    //Ответ на вопрос №2
    public static By answerThree = By.id("accordion__panel-2");
    //Ответ на вопрос №3
    public static By answerFour = By.id("accordion__panel-3");
    //Ответ на вопрос №4
    public static By answerFive = By.id("accordion__panel-4");
    //Ответ на вопрос №5
    public static By answerSix = By.id("accordion__panel-5");
    //Ответ на вопрос №6
    public static By answerSeven = By.id("accordion__panel-6");
    //Ответ на вопрос №7
    public static By answerEight = By.id("accordion__panel-7");
    //Ответ на вопрос №8

    //-----------Текстовки ответов -------------------------
    public static String questionOneText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //Текст ответа на вопрос №1
    public static String questionTwoText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //Текст ответа на вопрос №2
    public static String questionThreeText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //Текст ответа на вопрос №3
    public static String questionFourText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //Текст ответа на вопрос №4
    public static String questionFiveText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //Текст ответа на вопрос №5
    public static String questionSixText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //Текст ответа на вопрос №6
    public static String questionSevenText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //Текст ответа на вопрос №7
    public static String questionEightText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    //Текст ответа на вопрос №8

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToElement() {
        WebElement element = driver.findElement(questionImportant);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        //скролл к блоку Вопросы о важном
    }

    public void clickCookie() {
        driver.findElement(cookieButton).click();
        //принятие куки
    }

    public void clickOrderButton(By orderButton) {
        driver.findElement(orderButton).click();
        //нажать Заказать
    }

    public void clickButtonOneQuestion(By questionOne) {
        driver.findElement(questionOne).click();
        //нажать на вопрос 1
    }

    public String getTextQuestionOne() {
        driver.findElement(answerOne).getText();
        return questionOneText;
        //ответ на вопрос 1
    }

    public void clickButtonTwoQuestion(By questionTwo) {
        driver.findElement(questionTwo).click();
        //нажать на вопрос 2
    }

    public String getTextQuestionTwo() {
        driver.findElement(answerTwo).getText();
        return questionTwoText;
        //ответ на вопрос 2
    }

    public void clickButtonThreeQuestion(By questionThree) {
        driver.findElement(questionThree).click();
        //нажать на вопрос 3
    }

    public String getTextQuestionThree() {
        driver.findElement(answerThree).getText();
        return questionThreeText;
        //ответ на вопрос 3
    }

    public void clickButtonFourQuestion(By questionFour) {
        driver.findElement(questionFour).click();
        //нажать на вопрос 4
    }

    public String getTextQuestionFour() {
        driver.findElement(answerFour).getText();
        return questionFourText;
        //ответ на вопрос 4
    }

    public void clickButtonFiveQuestion(By questionFive) {
        driver.findElement(questionFive).click();
        //нажать на вопрос 5
    }

    public String getTextQuestionFive() {
        driver.findElement(answerFive).getText();
        return questionFiveText;
        //ответ на вопрос 5
    }

    public void clickButtonSixQuestion(By questionSix) {
        driver.findElement(questionSix).click();
        //нажать на вопрос 6
    }

    public String getTextQuestionSix() {
        driver.findElement(answerSix).getText();
        return questionSixText;
        //ответ на вопрос 6
    }

    public void clickButtonSevenQuestion(By questionSeven) {
        driver.findElement(questionSeven).click();
        //нажать на вопрос 7
    }

    public String getTextQuestionSeven() {
        driver.findElement(answerSeven).getText();
        return questionSevenText;
        //ответ на вопрос 7
    }

    public void clickButtonEightQuestion(By questionEight) {
        driver.findElement(questionEight).click();
        //нажать на вопрос 8
    }

    public String getTextQuestionEight() {
        driver.findElement(answerEight).getText();
        return questionEightText;
        //ответ на вопрос 8
    }


}
