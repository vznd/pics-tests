package pics.io.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The util class that is used to manipulate JSON files and objects
 */
public class JsonUtil {

    public static String valueFromDto(final Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

}
