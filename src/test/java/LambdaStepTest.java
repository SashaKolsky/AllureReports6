import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepTest {

    public static final String REPOSITORY = "eroshenkoam/allure-example";
    public static final int ISSUE_NUMBER = 68;

    @Test
    public void testRepositoryIssue() {
        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });

        step("Ищем репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").val(REPOSITORY);
            $(".header-search-input").submit();
        });

        step("Переходим в репозиторий", () -> {
            $(By.linkText(REPOSITORY)).click();
        });

        step("Переходим в раздел Issues", () -> {
                    $(By.partialLinkText("Issues")).click();
        });

        step("Проверяем что существует Issue с номером " + ISSUE_NUMBER, () -> {
            $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);
        });
    }

}
