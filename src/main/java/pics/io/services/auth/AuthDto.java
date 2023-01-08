package pics.io.services.auth;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Getter
@Setter
@ToString
public class AuthDto {

    private String email;

    private String password;

}
