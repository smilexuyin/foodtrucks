package com.mobile.foodtrucks.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author: yinxu
 * @date 2024/04/23
 * @desc SwaggerConfig
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI createRestApi(@Value("1.0") String appVersion) {
        return new OpenAPI()
                .info(new Info().title("Food trucks Web API")
                        .description("You can obtain the name of your favorite food truck through the API")
                        .version(appVersion));
    }
}
