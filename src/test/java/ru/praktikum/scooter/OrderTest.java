package ru.praktikum.scooter;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.Keys;
import ru.yandex.scooter.pageobjects.Order;

import static com.codeborne.selenide.Condition.*;

@DisplayName("заказ")
public class OrderTest extends BaseTest {

    Order order = new Order();

    @DisplayName("заказ первый с заполнением всей формы")
    @Test
    public void firstOrder () {
        order.orderHeader.click();
        order.orderOneFormOne();
        order.orderUnderground.click();
        order.station.click();
        order.further.click();
        order.orderOneFormTwo();
        order.date.sendKeys(Keys.ENTER);
        order.rent.click();
        order.rentDays.click();
        order.scooterColor.click();
        order.orderFinal.click();
        order.orderYes.click();
        order.orderPlaced.shouldBe(visible);
        order.viewStatus.shouldBe(visible);
    }

    @DisplayName("заказ второй с заполнением всей формы")
    @Test
    public void secondOrder () {
        order.orderHeader.click();
        order.orderTwoFormOne();
        order.orderUnderground.click();
        order.stationName.click();
        order.further.click();
        order.orderTwoFormTwo();
        order.date.sendKeys(Keys.ENTER);
        order.rent.click();
        order.rentDaysTwo.click();
        order.scooterColor.click();
        order.orderFinal.click();
        order.orderYes.click();
        order.orderPlaced.shouldBe(visible);
        order.viewStatus.shouldBe(visible);
    }
}