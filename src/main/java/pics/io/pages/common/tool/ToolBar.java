package pics.io.pages.common.tool;

import io.qameta.allure.Step;
import pics.io.pages.common.logout.LogoutPopup;

import static com.codeborne.selenide.Selenide.$;

/**
 * This class contains actions/methods to navigate through the user toolbar
 */
public class ToolBar {

    public final ToolBarElements elements;

    public ToolBar() {
        elements = new ToolBarElements();
    }

    @Step("Click logout button in tool bar")
    public LogoutPopup clickLogoutButton() {
        $(elements.getLogoutButton()).click();
        return new LogoutPopup();
    }
}
