package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import static java.time.Duration.*;


public class MainPage {


    public static final
    // url главной страницы-//----------------------------------------------------------
    String site = "https://qa-scooter.praktikum-services.ru/";
    private static WebDriver driver = null;


    //--------------------------------------------------------------------------------------
    public static final By orderButtonAbove = By.xpath(".//button[@class='Button_Button__ra12g']");
    // кнопка Заказать в шапке сайта
    public static final By orderButtonCenter = By.xpath(".//button[@class='Button_Button__ra12g']");
    // кнопка заказать по центру сайта
    private final By cookieButton = By.id("rcc-confirm-button");
    // кнопка с куки
    private final By frequentlyAskedQuestionsHeader = By.xpath("//div[@class='Home_FourPart__1uthg']//div[@class='Home_SubHeader__zwi_E']");
// Заголовок Вопросы о важном new

    //-----------------------------------------------------------------------------------
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage clickButtonCeneter(){
        WebElement buttonStartOrder = driver.findElement(orderButtonCenter);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonStartOrder);
        driver.findElement(orderButtonCenter).click();
        return this;
    }

    public  final MainPage site() {
        driver.get(site);
        final MainPage mainPage = this;
        return mainPage;
    }

    // Методы общие ----------------------------------------------------------

    public MainPage clickButtonAbove(){
        driver.findElement(orderButtonAbove).click();
        return this;
    }

    public MainPage clickCookie() {
        driver.findElement(cookieButton).click();
        return this;

    }


    //Методы для вопрос-ответ--------------------------------------------------
    public void goToFAQ() {
        WebElement faqHeader = driver.findElement(frequentlyAskedQuestionsHeader);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView();", faqHeader);//проскролить до заголовка Вопросы о важном new
    }

    public void openAccordionQuestion(String question) {
        driver.findElement(By.xpath("//div[@class='accordion__heading']//div[text()='" + question + "']")).click();
    }

    public String getAnswer(String answer) {
        final Wait<WebDriver> wait = new FluentWait<>(driver).withMessage("Элемент не найден").withTimeout(ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='accordion__panel']//p[text()='" + answer + "']"))));
        return driver.findElement(By.xpath("//div[@class='accordion__panel']//p[text()='" + answer + "']")).getText();
    }

}
