package placeorder;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//
public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setUp(){
    // driver = new ChromeDriver();
    driver = new FirefoxDriver();

}

    @After
    public void cleanUp() {
        driver.quit();
    }

    public void implicitlyWait(long numberOfSeconds) {
        driver.manage().timeouts().implicitlyWait(numberOfSeconds, TimeUnit.SECONDS);
    }

}