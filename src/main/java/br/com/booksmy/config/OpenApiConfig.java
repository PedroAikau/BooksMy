package br.com.booksmy.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig{

    @Bean
    OpenAPI customOpenAPI(){
        return new OpenAPI().info(
                new Info()
                        .title("REST API's RESTFUL FROM 0 WITH JAVA, SPRING BOOT, KUBERNETES AND DOCKER")
                        .version("v1").description("some description")
                        .license(new License().name("Apache 2.0").url("...")));
    }
}
