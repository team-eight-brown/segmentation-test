package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage extends BasePage {

    private static final By NAME = By.id("username");
    private static final By EMAIL = By.id("email");
    private static final By PASSWORD = By.id("password");
    private static final By REGISTRATION_BTN = By.xpath("//*[contains(text(), 'ЗАРЕГЕСТРИРОВАТЬСЯ')]");

    @Override
    public void check() {
        $(NAME).shouldBe(Condition.visible);
        $(EMAIL).shouldBe(Condition.visible);
        $(PASSWORD).shouldBe(Condition.visible);
        $(REGISTRATION_BTN).shouldBe(Condition.visible);
    }

    public void enterName(String name) {
        $(NAME).setValue(name);
    }

    public void enterEmail(String email) {
        $(EMAIL).setValue(email);
    }

    public void enterPassword(String password) {
        $(PASSWORD).setValue(password);
    }

    public void clickRegistrationButton() {
        $(REGISTRATION_BTN).click();
    }

    public void register(String name, String email, String password) {
        enterName(name);
        enterEmail(email);
        enterPassword(password);
        clickRegistrationButton();
    }
}

