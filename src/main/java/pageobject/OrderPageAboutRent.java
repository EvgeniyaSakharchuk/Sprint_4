package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
    public class OrderPageAboutRent {
        // url страницы с формой заказа
        private final By dateField = By.xpath(".//input[contains(@placeholder, 'Когда привезти самокат')]");
        //поле Когда привезти самокат
        private final By choosingDate = By.xpath(".//div[contains(@class, 'react-datepicker__day--selected')]");
        //выбор даты возврата
        private final By rentField = By.xpath(".//div[@class='Dropdown-placeholder']");
        //поле с выпадающим списком со сроком аренды
        private final By choosingRentalPeriod = By.xpath(".//div[text()='сутки']");
        //выбор периода аренды
        private final By colorOfScooter = By.id("black");
        //выбор цвета (черный)
        private final By commentField = By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]");
        //поле для комментария курьеру
        private final By finalOrderButton = By.xpath(".//div[3]/button[text()='Заказать']");
        // кнопка заказать
        private final By yesOrderButton = By.xpath(".//button[text()='Да']");
        //поп ап с подтверждением заказа
        private final By notificationOfSuccessfulOrder = By.xpath(".//div[contains(text(), 'Заказ оформлен')]");
        //сообщение об успешном оформлении
        private final WebDriver driver;

        public OrderPageAboutRent(WebDriver driver) {
            this.driver = driver;
        }

        public void chooseDate(String dayWhatIWant) {
            driver.findElement(dateField).sendKeys(dayWhatIWant);
            driver.findElement(choosingDate).click();  //выбор даты
        }

        public void chooseRentalPeriod() {
            driver.findElement(rentField).click();
            driver.findElement(choosingRentalPeriod).click();
            //выбор срока аренды
        }

        public void chooseColor() {
            driver.findElement(colorOfScooter).click();
            //выбор чек-бокса с цветом самоката
        }

        public void writeComment(String comment) {
            driver.findElement(commentField).sendKeys(comment);
            // комментарий по желанию
        }

        public void clickFinalOrderButton() {
            driver.findElement(finalOrderButton).click();
            //нажать на кнопку Заказать
        }

        public void confirmOrder() {
            driver.findElement(yesOrderButton).click();
            //подтверждение заказа
        }

        public void checkOrderComplete() {
            driver.findElement(notificationOfSuccessfulOrder).isDisplayed();
            //сообщение об успешном заказе
        }
    }