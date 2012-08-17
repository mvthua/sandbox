/**
 * AppConfig.java
 */
package x.y.z.config;

import x.y.z.web.config.DataConfig;
import x.y.z.web.config.LoggingConfig;
import x.y.z.web.WebConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Michael
 */
@Configuration
//@Import({ DataConfig.class, WebConfig.class })
//@Import({ DataConfig.class, WebConfig.class })
//@Import({ LoggingConfig.class, WebConfig.class })
//@ImportResource({ "classpath:/logging-ctx.xml" })
public class AppConfig {

}
