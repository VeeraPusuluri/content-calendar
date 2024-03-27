package vsg.veera.contentcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import vsg.veera.contentcalendar.config.ContentCalendarProperties;

import java.util.Arrays;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        // ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
