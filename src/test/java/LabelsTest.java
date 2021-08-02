import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Раздел Issues")
public class LabelsTest {

    @Test
    @Feature("Issues")
    @Story("Проверка поиска по Issues для авторизованного пользователя")
    @Owner("SashaKolsky")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "Github", url = "https://github.com/")
    @Description("Здесь можно добавить детальное описание этого теста, как и для чего он нужен ...")
    @DisplayName("Проверка работы поиска по Issue через Аннотации")
    public void testLabelsWithAnnotations() {

    }

    @Test
    @DisplayName("Проверка работы поиска по Issue через Методы")
    public void testLabelsWithMethods() {
        Allure.feature("Issues");
        Allure.story("Поиск по Issue через Методы");
        Allure.label("owner", "sashakolsky");
        Allure.label("severity", SeverityLevel.BLOCKER.toString());
        Allure.link("GitHub", "https://github.com");
        Allure.description("Разширенное описание ...");
    }

}
