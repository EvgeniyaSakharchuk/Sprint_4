package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageForWom {
    private final By nameField = By.xpath(".//input[contains(@placeholder, 'Имя')]");
    private final By surnameField = By.xpath(".//input[contains(@placeholder, 'Фамилия')]");
    private final By addressField = By.xpath(".//input[contains(@placeholder, 'куда привезти заказ')]");
    private final By metroField = By.xpath(".//input[@class='select-search__input']");
    private final By metroStation = By.xpath(".//div[@class='select-search__select']/ul/li/button/div[2]");
    private final By telephoneField = By.xpath(".//div[5]/input[contains(@class, 'Input_Input__1iN_Z')]");
    private final By nextButton = By.xpath(".//button[text()='Далее']");
    private final WebDriver driver;

    public OrderPageForWom(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        this.driver.findElement(this.nameField).sendKeys(new CharSequence[]{name});
    }

    public void enterSurname(String surname) {
        this.driver.findElement(this.surnameField).sendKeys(new CharSequence[]{surname});
    }

    public void enterAddress(String address) {
        this.driver.findElement(this.addressField).sendKeys(new CharSequence[]{address});
    }

    public void clickMetroStation() {
        this.driver.findElement(this.metroField).click();
        this.driver.findElement(this.metroStation).click();
    }

    public void enterPhoneNumber(String number) {
        this.driver.findElement(this.telephoneField).sendKeys(new CharSequence[]{number});
    }

    public void clickNextButton() {
        this.driver.findElement(this.nextButton).click();
    }

    public boolean isFormOpened(String text) {
        return webDriver.findElement(By.xpath(".//input[contains(@placeholder" + (text)).isDisplayed);
    }


}