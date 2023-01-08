package pics.io.pages.common.tool;

import pics.io.pages.common.logout.LogoutPopup;
import pics.io.pages.home.HomePage;

import static com.codeborne.selenide.Selenide.$;

/**
 * This class contains actions/methods to navigate through the user toolbar
 */
public class ToolBar {

    public ToolBarElements elements;

    public ToolBar() {
        elements = new ToolBarElements();
    }

    public LogoutPopup clickLogoutButton() {
        $(elements.getLogoutButton()).click();
        return new LogoutPopup();
    }
}
