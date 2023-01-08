package pics.io;

import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pics.io.actions.BaseActions;
import pics.io.pages.collections.CollectionsPage;
import pics.io.pages.home.HomePage;

/**
 * Authorization tests
 */
@Feature("Authorization")
public class AuthTest extends BaseTest {

    @Test(description = "As a user I can sign in")
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

    @Test(description = "As a user I can sign out")
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
