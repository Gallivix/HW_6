import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @Test
    void andreiSolntsevShouldBeTheFirstContributor() {
        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(Selectors.byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();


        $(".Popover-message").shouldHave(Condition.text("Andrei Solntsev"));

    }
}
