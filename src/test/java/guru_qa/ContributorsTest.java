package guru_qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {

    @Test
    void andreiSolntsevShouldContributeTheMost() {
        
        open("https://github.com/asolntsev");
        $(".layout-sidebar").$(byText("Contributors"))
                .ancestor(".BorderGrid-cell").$$("ul li").first()
                .hover();
        $$(".Popover-message").find(visible).shouldHave(text("Andrej Solntsev"));

    }
}
