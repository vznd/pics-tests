package pics.io.pages.home;

import com.codeborne.selenide.Selenide;
import pics.io.services.UrlProvider;

import static com.codeborne.selenide.Selenide.$;

/**
 * This class contain actions/methods which can be performed on home page of pics.io
 */
public class HomePage {

    public HomePageElements elements;

    public HomePage() {
        elements = new HomePageElements();
    }

    public HomePage open() {
        Selenide.open(UrlProvider.basesUrl);
        return this;
    }

    public LoginPopup clickLogInButton() {
        $(elements.getLoginButton()).click();
        return new LoginPopup();
    }
}
