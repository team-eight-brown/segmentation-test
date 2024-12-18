package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {
    private static final By TOAST = By.className("Toastify");

    public BasePage() {
        check();
    }

    public abstract void check();

    public void checkToast(String toast) {
        $(TOAST).shouldBe(Condition.visible);
        $(TOAST).shouldHave(Condition.text(toast));
    }
}

