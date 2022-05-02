package ru.yandex.scooter.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Order {
    public final SelenideElement orderHeader  = $(By.xpath(".//button[@class='Button_Button__ra12g']"));
    public final SelenideElement orderName = $(By.xpath(".//input[@placeholder='* Имя']"));
    public final SelenideElement orderSurname  = $(By.xpath(".//input[@placeholder='* Фамилия']"));
    public final SelenideElement orderAddress  = $(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"));
    public final SelenideElement orderUnderground  = $(By.xpath(".//input[@placeholder='* Станция метро']"));
    public final SelenideElement station  = $(By.xpath(".//li[@data-index='3']"));
    public final SelenideElement stationName  = $(By.xpath(".//li[@data-index='2']"));
    public final SelenideElement orderPhone  = $(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"));
    public final SelenideElement further = $(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']"));
    public final SelenideElement date = $(By.xpath(".//input[@placeholder='* Когда привезти самокат']"));
    public final SelenideElement rent = $(By.xpath(".//div[@class='Dropdown-placeholder']"));
    public final SelenideElement rentDays = $(By.xpath(".//div[text()='сутки']"));
    public final SelenideElement rentDaysTwo = $(By.xpath(".//div[text()='двое суток']"));
    public final SelenideElement scooterColor  = $(By.xpath(".//input[@id='black']"));
    public final SelenideElement commentCourier  = $(By.xpath(".//input[@placeholder='Комментарий для курьера']"));
    public final SelenideElement orderFinal = $(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']"));
    public final SelenideElement orderYes = $(By.xpath(".//button[text()='Да']"));
    public final SelenideElement orderPlaced = $(By.xpath(".//div[text()='Заказ оформлен']"));
    public final SelenideElement viewStatus = $(By.xpath(".//button[text()='Посмотреть статус']"));



    public void orderOneFormOne (){
        orderName.setValue("Владимир");
        orderSurname.setValue("Ленин");
        orderAddress.setValue("Площадь Ленина, Москва");
        orderPhone.setValue("89999999999");
    }
    public void orderOneFormTwo (){
        date.setValue("01.02.2022");
        commentCourier.setValue("Оставить у двери");
    }
    public void orderTwoFormOne (){
        orderName.setValue("Иосиф");
        orderSurname.setValue("Сталин");
        orderAddress.setValue("Улица Сталина, Москва");
        orderPhone.setValue("88888999999");
    }
    public void orderTwoFormTwo (){
        date.setValue("02.02.2022");
        commentCourier.setValue("Оставить у забора");
    }
}



