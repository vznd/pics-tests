package pics.io.pages.common.logout;

import pics.io.pages.home.HomePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LogoutPopup {

    public LogoutElements elements;

    public LogoutPopup() {
        elements = new LogoutElements();
    }

    public LogoutPopup assertLogoutPopupIsVisible() {
        $(elements.getLogoutPopup()).shouldBe(visible);
        return this;
    }

    public LogoutPopup assertLogoutPopupDescription(String description) {
        $(elements.getLogoutPopupDescription()).shouldHave(text(description));
        return this;
    }

    public HomePage clickOkButtonInPopup() {
        $(elements.getOkButton()).click();
        return new HomePage();
    }
}
