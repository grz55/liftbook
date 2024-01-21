package com.grz55.liftbook.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrossOriginConfig implements WebMvcConfigurer {

    @Profile("prod")
    @Configuration
    public static class ProdCorsConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("https://grz55.github.io/liftbook-ui/")
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
        }
    }

    @Profile("!prod")
    @Configuration
    public static class DevCorsConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("http://localhost:4200")
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
        }
    }
}
