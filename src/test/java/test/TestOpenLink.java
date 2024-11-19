package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestOpenLink {

    @Test
    public void testOpenLink() {
        open("https://www.google.ru/");

    }
}
