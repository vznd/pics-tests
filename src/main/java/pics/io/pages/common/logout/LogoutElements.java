package pics.io.pages.common.logout;

import org.openqa.selenium.By;

/**
 * Elements which are used by {@link LogoutPopup}
 */
public class LogoutElements {

    public By getLogoutPopup() {
        return By.className("simpleDialogTitle");
    }

    public By getLogoutPopupDescription() {
        return By.xpath("//div[@class='simpleDialogDescription']//span");
    }

    public By getOkButton() {
        // The space near simpleDialogFooterBtn is present in DOM
        return By.xpath("//span[@class='simpleDialogFooterBtn '][text()='Ok']");
    }

}
