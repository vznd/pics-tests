package pics.io.pages.common.base;

import io.qameta.allure.Step;
import pics.io.pages.common.tool.ToolBar;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * This is a part of POM pattern
 * This class contains elements and methods that are available for logged in used on all pages(header, footer, etc.)
 * All *Page classes should inherit this class, except {@link pics.io.pages.home.HomePage} class
 */
public class BasePage {

    public final BasePageElements elements;

    public BasePage() {
        elements = new BasePageElements();
    }

    @Step("Check user settings button is visible")
    public void assertSettingsButtonIsVisible() {
        $(elements.getSettingsButton()).shouldBe(visible);
    }

    @Step("Hover mouse on settings button")
    public ToolBar hoverOnSettingsButton() {
        $(elements.getSettingsButton()).click();
        return new ToolBar();
    }
}
