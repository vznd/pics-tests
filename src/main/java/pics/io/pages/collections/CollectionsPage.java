package pics.io.pages.collections;

import pics.io.pages.common.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * This class contain actions/methods which can be performed on a collections page
 */
public class CollectionsPage extends BasePage {

    public CollectionsElements elements;

    public CollectionsPage() {
        elements = new CollectionsElements();
    }

    public CollectionsPage assertFoldersSideBarIsVisible() {
        $(elements.getFolderTree()).shouldBe(visible);
        return this;
    }
}
