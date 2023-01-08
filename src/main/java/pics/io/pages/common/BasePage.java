package pics.io.pages.common;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * This is a part of POM pattern
 * This class contains elements and methods that are available for logged in used on all pages(header, footer, etc.)
 * All *Page classes should inherit this class, except {@link pics.io.pages.home.HomePage} class
 */
public class BasePage {

    public BasePageElements elements;

    public BasePage() {
        elements = new BasePageElements();
    }

    public void assertSettingsButtonIsVisible() {
        $(elements.getSettingsButton()).shouldBe(visible);
    }
}
