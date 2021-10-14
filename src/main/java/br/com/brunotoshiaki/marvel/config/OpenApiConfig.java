package br.com.brunotoshiaki.marvel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI custonOpenApi() {
        return new OpenAPI().info(new Info().title("Marvel API With Spring Boot 2.5.0").version("v1").description(""));
    }
}
