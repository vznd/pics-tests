package pics.io.pages.home;

import org.openqa.selenium.By;

/**
 * Elements which are used by {@link pics.io.pages.home.HomePage}
 */
public class HomePageElements {

    public By getLoginButton() {
        return By.xpath("//a[text()='Log in']");
    }
}
