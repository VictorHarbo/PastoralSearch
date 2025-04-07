package com.ppdiscover.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow CORS requests from localhost:3000
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")  // Allow requests from localhost:3000
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Adjust the methods as per your needs
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true);  // Allow credentials if needed
    }
}
