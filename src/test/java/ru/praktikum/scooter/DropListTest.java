package ru.praktikum.scooter;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import ru.yandex.scooter.pageobjects.DropDownList;



@DisplayName(" Выпадающий список в разделе «Вопросы о важном».")
public class DropListTest extends BaseTest {

    DropDownList dropDownList = new DropDownList();

    @Test
    public void dropDownLisText() {
        dropDownList.cookie.click();
        dropDownList.dropDownLisTextCheck();
    }
}
