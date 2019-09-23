package AnnotationConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloAnnotationGenerator {
    @Bean
    public HelloAnnotation genBean() {
        return new HelloAnnotation("Spring annotation");
    }

}
