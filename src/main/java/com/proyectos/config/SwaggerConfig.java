package com.proyectos.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API de Camunda")
                .version("7.22")
                .description("Documentación de las APIs REST de Camunda integradas en Swagger")
                .contact(new Contact()
                    .name("Soporte Camunda")
                    .email("soporte@empresa.com")
                )
            )
            .externalDocs(new ExternalDocumentation()
                .description("Especificación OpenAPI de Camunda")
                .url("http://localhost:8080/openapi.json"))
            .servers(List.of(
                new Server().url("http://localhost/engine-rest").description("Servidor Camunda")
            ));
    }
}