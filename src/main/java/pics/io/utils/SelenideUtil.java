package pics.io.utils;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Cookie;

import java.util.Map;

/**
 * The util class which contains a common actions/methods that involve Selenide and/or Selenium WebDriver
 */
public class SelenideUtil {

    public static void setCookies(Map<String, String> cookies) {
        for (Map.Entry<String, String> entry : cookies.entrySet()) {
            WebDriverRunner.getWebDriver().manage()
                    .addCookie(new Cookie(entry.getKey(), entry.getValue()));
        }
    }

}
