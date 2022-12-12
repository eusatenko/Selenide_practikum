import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutoTest {

    @Test
    public void authTest() {
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
        // открывается страница и создаётся экземпляр класса страницы
        LoginPageMestoSelenide loginPage =
                open("https://qa-mesto.praktikum-services.ru/",
                        LoginPageMestoSelenide.class);

        // вход в приложение
        loginPage.login("nacalo3463@kixotic.com",
                "Qwerty123");

        $(byClassName("header__user")).shouldHave(exactText("acalo3463@kixotic.com"));

    }
}
