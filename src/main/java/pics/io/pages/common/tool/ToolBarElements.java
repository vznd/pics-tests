package pics.io.pages.common.tool;

import org.openqa.selenium.By;

/**
 * Elements which are used in {@link ToolBar} class
 */
public class ToolBarElements {

    public By getLogoutButton() {
        return By.xpath("//span[@class='toolbarDropdownItemText'][contains(text(),'Log out')]");
    }
}
