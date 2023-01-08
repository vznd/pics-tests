package pics.io.actions;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import pics.io.services.UrlProvider;
import pics.io.utils.SelenideUtil;

import java.util.Map;

/**
 * This class contains method which are widely used in the project
 */
public class BaseActions {

    @Step("Login via http")
    public static void silentLogin(String email, String password) {
        // Open browser to be able to set cookies
        Selenide.open(UrlProvider.basesUrl);

        // Send sign in request
        Response response = HttpActions.sendSignInRequest(email, password);

        // Extract cookies from response
        Map<String, String> cookies = response.getCookies();

        // Set cookies to browser
        SelenideUtil.setCookies(cookies);

        // Set open root path of application with necessary cookies set
        Selenide.open(UrlProvider.basesUrl);
    }

}
