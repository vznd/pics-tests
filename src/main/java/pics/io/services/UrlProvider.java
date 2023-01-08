package pics.io.services;

/**
 * This class contains URLs that should be used in {@link pics.io.services} requests
 */
public class UrlProvider {

    // Should be populated from test configs, depending on test environment
    public static final String basesUrl = "https://pics.io";

    public static String getSignInUrl() {
        return basesUrl + "/users/signin";
    }
}
