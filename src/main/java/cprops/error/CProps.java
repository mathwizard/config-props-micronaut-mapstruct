package cprops.error;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Data;

@ConfigurationProperties("pusher")
@Data
public class CProps {
    String baseUrl;
    String username;
    String password;
}
