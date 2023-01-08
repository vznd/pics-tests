package pics.io.pages.common.base;

import com.beust.ah.A;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.interactions.Actions;
import pics.io.pages.common.tool.ToolBar;

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

    public ToolBar hoverOnSettingsButton() {
//        SelenideElement settingsButton = $(elements.getSettingsButton());
//        Actions actions = new Actions(WebDriverRunner.getWebDriver());
//        actions.moveToElement(settingsButton);
//        actions.click();
//        actions.build().perform();
        $(elements.getSettingsButton()).click();
        return new ToolBar();
    }
}
