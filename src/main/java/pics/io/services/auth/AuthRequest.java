package pics.io.services.auth;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pics.io.services.Request;
import pics.io.services.UrlProvider;
import pics.io.utils.JsonUtil;
import pics.io.utils.RestUtil;

/**
 * The sign in request
 */
public class AuthRequest extends Request {

    public final AuthDto dto;

    public AuthRequest() {
        super();
        url = UrlProvider.getSignInUrl();
        dto = new AuthDto();
    }

    public AuthRequest withEmail(String email) {
        dto.setEmail(email);
        return this;
    }

    public AuthRequest withPassword(String password) {
        dto.setPassword(password);
        return this;
    }

    @Override
    public Response send() {
        body = JsonUtil.valueFromDto(dto);
        return RestUtil.post(url, body, ContentType.JSON);
    }

}
