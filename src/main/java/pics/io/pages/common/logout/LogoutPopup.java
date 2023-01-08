package pics.io.pages.common.logout;

import io.qameta.allure.Step;
import pics.io.pages.home.HomePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LogoutPopup {

    public final LogoutElements elements;

    public LogoutPopup() {
        elements = new LogoutElements();
    }

    @Step("Check logout popup is visible")
    public LogoutPopup assertLogoutPopupIsVisible() {
        $(elements.getLogoutPopup()).shouldBe(visible);
        return this;
    }

    @Step("Check logout popup description")
    public LogoutPopup assertLogoutPopupDescription(String description) {
        $(elements.getLogoutPopupDescription()).shouldHave(text(description));
        return this;
    }

    @Step("Click Ok in Logout popup")
    public HomePage clickOkButtonInPopup() {
        $(elements.getOkButton()).click();
        return new HomePage();
    }
}
