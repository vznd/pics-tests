package pics.io;

import org.testng.annotations.BeforeTest;

/**
 * All tests should inherit this class, since it initializes user data
 */
public class BaseTest {

    public String email;
    public String password;

    @BeforeTest
    public void initUser() {
        email = System.getenv("PICS_EMAIL");
        password = System.getenv("PICS_PASSWORD");
    }

}
