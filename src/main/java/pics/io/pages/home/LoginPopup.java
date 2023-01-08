package pics.io.pages.home;

import pics.io.pages.collections.CollectionsPage;
import pics.io.pages.common.SpinnerElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * This class cocktails actions/methods which could be performed within Log in popup
 */
public class LoginPopup {

    public LoginPopupElements popupElements;
    public SpinnerElements spinnerElements;

    public LoginPopup() {
        popupElements = new LoginPopupElements();
        spinnerElements = new SpinnerElements();
    }

    public LoginPopup assertLoginPopupIsDisplayed() {
        $(popupElements.getTitle()).shouldHave(text("Log in"));
        return this;
    }

    public LoginPopup typeEmail(String email) {
        $(popupElements.getEmailInput()).setValue(email);
        return this;
    }

    public LoginPopup typePassword(String password) {
        $(popupElements.getPasswordInput()).setValue(password);
        return this;
    }

    public CollectionsPage clickLoginButton() {
        $(popupElements.getLoginButton()).click();
        $(spinnerElements.getSpinner()).shouldBe(visible);
        return new CollectionsPage();
    }
}
