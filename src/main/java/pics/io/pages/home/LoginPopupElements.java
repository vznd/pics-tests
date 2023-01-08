package pics.io.pages.home;

import org.openqa.selenium.By;

/**
 * Elements which are used by {@link LoginPopup}
 */
public class LoginPopupElements {

    public By getTitle() {
        return By.className("popup__title");
    }

    public By getEmailInput() {
        return By.id("login-email");
    }

    public By getPasswordInput() {
        return By.id("login-password");
    }

    public By getLoginButton() {
        return By.xpath("//button[text()='Log in']");
    }
}
