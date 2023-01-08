package pics.io;

import org.testng.annotations.BeforeMethod;
import pics.io.actions.BaseActions;

public class CollectionTest extends BaseTest {

    @BeforeMethod
    public void login() {
        BaseActions.silentLogin(email, password);
    }

}
