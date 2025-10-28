package github;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        open("https://github.com/");
        $("[aria-label=\"Search or jump to…\"]").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("div[data-testid='results-list'] > div").first().$("a").click();
        sleep(5000);



    }
}
