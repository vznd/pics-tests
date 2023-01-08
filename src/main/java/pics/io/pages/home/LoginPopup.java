package pics.io.pages.home;

import io.qameta.allure.Step;
import pics.io.pages.collections.CollectionsPage;
import pics.io.pages.common.SpinnerElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * This class cocktails actions/methods which could be performed within Log in popup
 */
public class LoginPopup {

    public final LoginPopupElements popupElements;
    public final SpinnerElements spinnerElements;

    public LoginPopup() {
        popupElements = new LoginPopupElements();
        spinnerElements = new SpinnerElements();
    }

    @Step("Check Log in popup is displayed")
    public LoginPopup assertLoginPopupIsDisplayed() {
        $(popupElements.getTitle()).shouldHave(text("Log in"));
        return this;
    }

    @Step("Type email in popup")
    public LoginPopup typeEmail(String email) {
        $(popupElements.getEmailInput()).setValue(email);
        return this;
    }

    @Step("Type password in popup")
    public LoginPopup typePassword(String password) {
        $(popupElements.getPasswordInput()).setValue(password);
        return this;
    }

    @Step("Click Log in button in popup")
    public CollectionsPage clickLoginButton() {
        $(popupElements.getLoginButton()).click();
        $(spinnerElements.getSpinner()).shouldBe(visible);
        return new CollectionsPage();
    }
}
