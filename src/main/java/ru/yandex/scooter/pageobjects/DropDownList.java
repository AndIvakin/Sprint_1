package ru.yandex.scooter.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class DropDownList {
    public final SelenideElement cookie = $(By.xpath(".//button[@id='rcc-confirm-button']"));

    public final SelenideElement cost = $(By.xpath(".//div[@id='accordion__heading-0']"));
    public final SelenideElement costText = $(By.xpath(".//div[@id='accordion__panel-0']"));
    public final SelenideElement severalScooters = $(By.xpath(".//div[@id='accordion__heading-1']"));
    public final SelenideElement severalScootersText = $(By.xpath(".//div[@id='accordion__panel-1']"));
    public final SelenideElement rentalTime = $(By.xpath(".//div[@id='accordion__heading-2']"));
    public final SelenideElement rentalTimeText = $(By.xpath(".//div[@id='accordion__panel-2']"));
    public final SelenideElement orderToday = $(By.xpath(".//div[@id='accordion__heading-3']"));
    public final SelenideElement orderTodayText = $(By.xpath(".//div[@id='accordion__panel-3']"));
    public final SelenideElement extendOrder = $(By.xpath(".//div[@id='accordion__heading-4']"));
    public final SelenideElement extendOrderText = $(By.xpath(".//div[@id='accordion__panel-4']"));
    public final SelenideElement charging = $(By.xpath(".//div[@id='accordion__heading-5']"));
    public final SelenideElement chargingText = $(By.xpath(".//div[@id='accordion__panel-5']"));
    public final SelenideElement orderCancellation = $(By.xpath(".//div[@id='accordion__heading-6']"));
    public final SelenideElement orderCancellationText = $(By.xpath(".//div[@id='accordion__panel-6']"));
    public final SelenideElement mkad = $(By.xpath(".//div[@id='accordion__heading-7']"));
    public final SelenideElement mkadText = $(By.xpath(".//div[@id='accordion__panel-7']"));

    public final SelenideElement yandexLogo = $(By.xpath(".//a[@class='Header_LogoYandex__3TSOI']"));// логотип яндекс
    public final SelenideElement scooterLogo = $(By.xpath(".//a[@class='Header_LogoScooter__3lsAR']"));// логотип самокат
    public final SelenideElement orderStatusHeader = $(By.xpath(".//button[@class='Header_Link__1TAG7' and text()='Статус заказа']"));// кнопка Статус заказа
    public final SelenideElement ScooterCoupleDays = $(By.xpath(".//div[@class='Home_Header__iJKdX' and text()='Самокат ']"));// текст Самокат на пару дней
    public final SelenideElement bring = $(By.xpath(".//div[@class='Home_SubHeader__zwi_E' and text()='Привезём его прямо к вашей двери,']"));// текст Привезём его прямо к вашей двери
    public final SelenideElement pictureScooter = $(By.xpath(".//div[@class='Home_Scooter__3YdJy']"));// картинка самоката
    public final SelenideElement textLightWheels = $(By.xpath(".//div[text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']"));// текст Он лёгкий и с мощными колёсами
    public final ElementsCollection model = $$(By.xpath(".//div[@class='Home_Row__jdQW2']//div[1]")); //  текст Модель Toxic PRO к сожалению не догодался как по другому найти этот элемент
    public final SelenideElement maximumSpeed = $(By.xpath(".//div[text()= 'Максимальная скорость']"));// текст Максимальная скорость
    public final SelenideElement speedForty = $(By.xpath(".//div[text()= '40 км/ч']"));// текст 40 км/ч
    public final SelenideElement passCharges = $(By.xpath(".//div[text()= 'Проедет без поздарядки']"));// текст Проедет без поздарядки
    public final SelenideElement eightykm = $(By.xpath(".//div[text()= '80 км']"));// текст 80 км
    public final SelenideElement withstandsWeight = $(By.xpath(".//div[text()= 'Выдерживает вес']"));// текст Выдерживает вес
    public final SelenideElement oneHundredTwenty = $(By.xpath(".//div[text()= '120 кг']"));// текст 120 кг
    public final SelenideElement howItWorks = $(By.xpath(".//div[text()= 'Как это работает']"));// текст Как это работает
    public final SelenideElement one = $(By.xpath(".//div[@class='Home_StatusCircle__3_aTp' and text()='1']"));// текст 1
    public final SelenideElement two = $(By.xpath(".//div[@class='Home_StatusCircle__3_aTp' and text()='2']"));// текст 2
    public final SelenideElement three = $(By.xpath(".//div[@class='Home_StatusCircle__3_aTp' and text()='3']"));// текст 3
    public final SelenideElement four = $(By.xpath(".//div[@class='Home_StatusCircle__3_aTp Home_Lineless__2-Rxp' and text()='4']"));// текст 4
    public final SelenideElement orderingScooter = $(By.xpath(".//div[text()='Заказываете самокат']"));// текст Заказываете самокат
    public final ElementsCollection textCategories = $$(By.xpath(".//div[@class='Home_StatusDescription__3WGl5']")); // тоже не нашел дрйгой способ текст Выбираете, когда и куда привезти, А вы — оплачиваете аренду и т.д.
    public final SelenideElement courierScooter = $(By.xpath(".//div[text()='Курьер привозит самокат']"));// текст Курьер привозит самокат
    public final SelenideElement riding = $(By.xpath(".//div[text()='Катаетесь']"));// текст Катаетесь
    public final SelenideElement courierScooterTake = $(By.xpath(".//div[text()='Курьер забирает самокат']"));// текст Курьер забирает самокат
    public final SelenideElement orderMiddle = $(By.xpath(".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp' and text()='Заказать']"));// текст Заказать
    public final SelenideElement questionsImportant = $(By.xpath(".//div[text()='Вопросы о важном']"));// текст Вопросы о важном

    public void dropDownLisTextCheck (){
        cost.click();
        costText.shouldHave(exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
        severalScooters.click();
        severalScootersText.shouldHave(exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
        rentalTime.click();
        rentalTimeText.shouldHave(exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
        orderToday.click();
        orderTodayText.shouldHave(exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
        extendOrder.click();
        extendOrderText.shouldHave(exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
        charging.click();
        chargingText.shouldHave(exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
        orderCancellation.click();
        orderCancellationText.shouldHave(exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
        mkad.click();
        mkadText.shouldHave(exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }
}