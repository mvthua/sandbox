/**
 * WebConfig.java
 */
package x.y.z.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Michael
 */
@ComponentScan(basePackages = { "x.y.z.web.controller" })
@Configuration
@EnableWebMvc
//@Import(DataConfig.class)
//@ImportResource("classpath:/logging-ctx.xml")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * {@inheritDoc}
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resource/**").addResourceLocations("/resource/");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

}
