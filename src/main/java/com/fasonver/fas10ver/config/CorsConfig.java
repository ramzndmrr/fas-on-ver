package com.fasonver.fas10ver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedOrigins("*") // İzin verilen alan adını belirtin.
                        .allowedMethods("GET", "POST") // İzin verilen HTTP metotlarını belirtin.
                        .allowedHeaders("Content-Type"); // İzin verilen başlıkları belirtin.
            }
        };
    }
}
