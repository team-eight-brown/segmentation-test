package test;

import org.junit.jupiter.api.Test;
import page.DashboardPage;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class TestLogin {

    //������� �������� ������.
    //������ �������� �����.
    //������ �������� ������.
    //������ ������ "�����".

    @Test
    public void testLogin() {
        open("http://84.201.152.148:5173/login");

        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail("admin@gmail.com");
        loginPage.enterPassword("admin");
        loginPage.clickLoginButton();

        new DashboardPage();
    }

}
