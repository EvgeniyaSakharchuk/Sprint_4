package placeorder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.MainPage;
import pageobject.OrderPageAboutRent;
import pageobject.OrderPageForWhom;
import java.time.Duration;
import static pageobject.MainPage.orderButtonAbove;
import static pageobject.MainPage.orderButtonCenter;


public class PlaceOrderScooter extends BaseTest {
    @RunWith(Parameterized.class)
    public class PlaceOrderKickScooter {
        private WebDriver driver
        private static String name;
        private static String surname;
        private static String address;
        private static String phoneNumber;
        private static String dayWhatIWant;
        private static String comment;

        public PlaceOrderKickScooter( String name, String surname, String address, String phoneNumber, String dayWhatIWant, String comment) {
            PlaceOrderKickScooter.name = name;
            PlaceOrderKickScooter.surname = surname;
            PlaceOrderKickScooter.address = address;
            PlaceOrderKickScooter.phoneNumber = phoneNumber;
            PlaceOrderKickScooter.dayWhatIWant = dayWhatIWant;
            PlaceOrderKickScooter.comment = comment;
        }

        @Parameterized.Parameters
        public static Object[][] getCredentials() {
            return new Object[][]{
                    {"Евгения", "Сахарчук", "улица", "+79998887766", "03.11.17911", "Дайте дженчине покататься"},
                    {"Антон", "Лихачев", "Северная улица", "88887776655", "01.01.2022", "Эх прокачусь"}
            };
        }

        @Test
        public void mainValidDataIsSuccess() {
            MainPage mainPage = new MainPage(driver);
            mainPage.clickOrderButton(orderButtonAbove);
            OrderPageForWhom orderPageForWhom = new OrderPageForWhom(driver);
            orderPageForWhom.enterName(name);
            orderPageForWhom.enterSurname(surname);
            orderPageForWhom.enterAddress(address);
            orderPageForWhom.clickMetroStation();
            orderPageForWhom.enterPhoneNumber(phoneNumber);
            orderPageForWhom.clickNextButton();
            //раздел для кого самокат

            OrderPageAboutRent orderPageAboutRent = new OrderPageAboutRent(driver);
            orderPageAboutRent.chooseDate(dayWhatIWant);
            orderPageAboutRent.chooseRentalPeriod();
            orderPageAboutRent.chooseColor();
            orderPageAboutRent.writeComment(comment);
            orderPageAboutRent.clickFinalOrderButton();
            orderPageAboutRent.confirmOrder();
            orderPageAboutRent.checkOrderComplete();
            //раздел про время аренды самоката
        }
        @Test
        public void checkFormIsOpen(){
            MainPage mainPage = new MainPage(driver);
            mainPage.clickOrderButton(orderButtonCenter);
            OrderPageForWhom orderPageForWhom = new OrderPageForWhom(driver);
            orderPageForWhom.clickNextButton();

        }

    }
}
