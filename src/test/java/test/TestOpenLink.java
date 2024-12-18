package test;

import org.junit.jupiter.api.Test;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class TestOpenLink {

    @Test
    public void testOpenLink() {
        open("http://localhost:5173/login");
    }

}
