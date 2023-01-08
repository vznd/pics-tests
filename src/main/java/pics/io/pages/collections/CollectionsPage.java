package pics.io.pages.collections;

import io.qameta.allure.Step;
import pics.io.pages.common.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * This class contain actions/methods which can be performed on a collections page
 */
public class CollectionsPage extends BasePage {

    public final CollectionsElements elements;

    public CollectionsPage() {
        elements = new CollectionsElements();
    }

    @Step("Check folders tree side bar is visible")
    public CollectionsPage assertFoldersSideBarIsVisible() {
        $(elements.getFolderTree()).shouldBe(visible);
        return this;
    }
}
