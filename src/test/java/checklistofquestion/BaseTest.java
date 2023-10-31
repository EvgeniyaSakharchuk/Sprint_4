package ru.praktikum.sprint4;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pageobject.MainPage;


public class BaseTest {
    WebDriver webDriver;
    MainPage mainPage;
    @Before
    public void setUp() {
        String browserName = System.getProperty("browserName");
        webDriver = WebDriverFactory.get(browserName);
        webDriver.manage().window().maximize();
        mainPage = new MainPage(webDriver);
    }

    @After
    public void clean() {
        webDriver.quit();
    }
}