package pics.io.services;

import io.restassured.response.Response;

/**
 * The abstract request class
 * All requests should inherit this class
 */
public abstract class Request {

    public String url;
    public String body;

    public Request() {
        url = "";
        body = "";
    }

    @SuppressWarnings("unused")
    public abstract Response send();
}
