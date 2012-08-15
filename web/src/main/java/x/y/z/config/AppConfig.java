/**
 * AppConfig.java
 */
package x.y.z.config;

import x.y.z.web.config.WebConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Michael
 */
@Configuration
@Import({ WebConfig.class })
//@Import({ LoggingConfig.class, WebConfig.class })
@ImportResource({ "classpath:/logging-ctx.xml" })
public class AppConfig {

}
