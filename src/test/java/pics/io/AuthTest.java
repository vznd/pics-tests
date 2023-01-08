package pics.io;

import org.testng.annotations.Test;
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
}
