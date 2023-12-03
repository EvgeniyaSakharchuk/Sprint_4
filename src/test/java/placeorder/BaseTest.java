package placeorder;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setUp() {
        String browser = System.getProperty("browser");
        if ("chrome".equalsIgnoreCase(browser)) {
            driver = new ChromeDriver();
        }
        else if ("firefox".equalsIgnoreCase(browser)) {
            driver = new FirefoxDriver();
        }}

    @After
    public void closeSession() {
        driver.quit();
    }
    public void implicitlyWait(long numberOfSeconds) {
        driver.manage().timeouts().implicitlyWait(numberOfSeconds, TimeUnit.SECONDS);
    }
}