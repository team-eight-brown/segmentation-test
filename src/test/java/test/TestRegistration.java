package test;

import org.junit.jupiter.api.Test;
import page.DashboardPage;
import page.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;

public class TestRegistration {

    //Открыть страницу регистрации.
    //Ввести корректные данные в поля.
    //Нажать на кнопку "ЗАРЕГИСТРИРОВАЬСЯ"

    @Test
    public void testRegistration() {
        open("http://84.201.152.148:5173/register");

        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.enterName("name");
        registrationPage.enterEmail("email");
        registrationPage.enterPassword("password");
        registrationPage.clickRegistrationButton();

        new DashboardPage();
    }
}
