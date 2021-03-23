package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.*;

public class SeacrhElementOnPage {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void searchElement() {

       open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $("#wiki-wrapper").shouldHave(text("Soft assertions"));
        $(byText("Soft assertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}