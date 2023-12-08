package placeorder;
//
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pageobject.MainPage;
import pageobject.OrderPageAboutRent;
import pageobject.OrderPageForWhom;
import static org.junit.Assert.assertTrue;
import static pageobject.MainPage.*;
// проверка открытия формы заказа по кнопке заказать внизу
public class CheckIsFormOpened extends BaseTest {
    @Test
    public void checkFormIsOpen(){
        MainPage MainPage = new MainPage(driver);
        MainPage.site();
        MainPage.clickCookie();
        MainPage.clickButtonCeneter();
        OrderPageForWhom orderPageForWhom = new OrderPageForWhom(driver);
        assertTrue(orderPageForWhom.isFormOpened());

    }
}
