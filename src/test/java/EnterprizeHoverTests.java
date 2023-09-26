import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EnterprizeHoverTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void selectByHover(){
        open("https://github.com");
        $(".header-menu-wrapper").$(byTagAndText("button", "Solutions")).hover();
        $(".header-menu-wrapper").$(byTagAndText("a", "Enterprise")).click();
        $(".h1-mktg.mb-3").shouldHave(text("Build like the best"));
    }
}
