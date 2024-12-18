package base;

import com.codeborne.selenide.Selenide;
import page.DashboardPage;
import page.LoginPage;
import page.RegistrationPage;

public class Navigator {

    private static final String REGISTRATION_URL = "http://localhost:5173/register";
    private static final String LOGIN_URL = "http://localhost:5173/login";
    private static final String DASHBOARD_URL = ""; //TODO на данный момент страница не реализована на фронте

    private RegistrationPage openRegistration() {
        Selenide.open(REGISTRATION_URL);
        return new RegistrationPage();
    }

    private LoginPage openLogin() {
        Selenide.open(LOGIN_URL);
        return new LoginPage();
    }

    private DashboardPage openDashboard() {
        Selenide.open(DASHBOARD_URL);
        return new DashboardPage();
    }
}

