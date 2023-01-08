package pics.io;

import org.testng.annotations.Test;
import pics.io.actions.BaseActions;
import pics.io.pages.collections.CollectionsPage;
import pics.io.pages.home.HomePage;

/**
 * Authorization tests
 */
public class AuthTest extends BaseTest {

    @Test
    public void signInTest() {
        new HomePage().open()
                .clickLogInButton()
                .assertLoginPopupIsDisplayed()
                .typeEmail(email)
                .typePassword(password)
                .clickLoginButton()
                .assertFoldersSideBarIsVisible()
                .assertSettingsButtonIsVisible();
    }

    @Test
    public void signOutTest() {
        BaseActions.silentLogin(email, password);

        new CollectionsPage().hoverOnSettingsButton()
                .clickLogoutButton()
                .assertLogoutPopupIsVisible()
                .assertLogoutPopupDescription("You are going to logout. Continue?")
                .clickOkButtonInPopup()
                .assertLoginButtonIsVisible();
    }

}
