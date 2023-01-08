package pics.io.actions;

import io.restassured.response.Response;
import pics.io.services.auth.AuthRequest;

/**
 * This class contains method to make http request on application services
 */
public class HttpActions {

    public static Response sendSignInRequest(String email, String password) {
        Response response = new AuthRequest()
                .withEmail(email)
                .withPassword(password)
                .send();
        response.then().statusCode(200);
        return response;
    }
}
