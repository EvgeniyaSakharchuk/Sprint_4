package placeorder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pageobject.MainPage;
import pageobject.OrderPageAboutRent;
import pageobject.OrderPageForWhom;



@RunWith(Parameterized.class)
public class PlaceOrderKickScooter extends BaseTest {

    private final String name;
    private final String surname;
    private final String address;
    private final String phoneNumber;
    private final String dayWhatIWant;
    private final String comment;

    public PlaceOrderKickScooter(String name, String surname, String address, String phoneNumber, String dayWhatIWant, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dayWhatIWant = dayWhatIWant;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getDataSet() {
        return new Object[][]{
                {"Евгения", "Сахарчук", "улица", "+79998887766", "03.11.17911", "Дайте дженчине покататься"},
                {"Антон", "Лихачев", "Северная улица", "88887776655", "01.01.2022", "Эх прокачусь"}
        };
    }

    @Test
    public void mainValidDataIsSuccess() {
        MainPage mainPage = new MainPage(driver);
        mainPage.site();
        mainPage.clickCookie();
        mainPage.clickButtonAbove();
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

}