package ru.praktikum.scooter;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;


class BaseTest {
    @Before
    public void testConfig()  {
    Configuration.timeout = 5000;
    WebDriverManager.chromedriver().setup();
//    Configuration.browser = "firefox";
    Configuration.browserSize = "1920x1080";
    open("https://qa-scooter.praktikum-services.ru");
    }
}
