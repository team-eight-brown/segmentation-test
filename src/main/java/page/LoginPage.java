package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private static final By EMAIL = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BTN = By.xpath("//*[contains(text(), 'ВОЙТИ')]");

    @Override
    public void check() {
        $(EMAIL).shouldBe(Condition.visible);
        $(PASSWORD).shouldBe(Condition.visible);
        $(LOGIN_BTN).shouldBe(Condition.visible);
    }

    public void enterEmail(String email) {
        $(EMAIL).setValue(email);
    }

    public void enterPassword(String password) {
        $(PASSWORD).setValue(password);
    }

    public void clickLoginButton() {
        $(LOGIN_BTN).click();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
}
