package pics.io.pages.home;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import pics.io.services.UrlProvider;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * This class contain actions/methods which can be performed on home page of pics.io
 */
@SuppressWarnings("UnusedReturnValue")
public class HomePage {

    public final HomePageElements elements;

    public HomePage() {
        elements = new HomePageElements();
    }

    @Step("Open home page")
    public HomePage open() {
        Selenide.open(UrlProvider.basesUrl);
        return this;
    }

    @Step("Click Log in button")
    public LoginPopup clickLogInButton() {
        $(elements.getLoginButton()).click();
        return new LoginPopup();
    }

    @Step("Check Log in button is visible")
    public HomePage assertLoginButtonIsVisible() {
        $(elements.getLoginButton()).shouldBe(visible);
        return this;
    }

}
