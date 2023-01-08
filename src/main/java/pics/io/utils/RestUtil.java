package pics.io.utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * The util class which is used to make http requests and related actions
 */
public class RestUtil {

    public static Response post(String url, String body, ContentType contentType) {
        return given().when()
                .body(body)
                .contentType(contentType)
                .post(url);
    }

}
