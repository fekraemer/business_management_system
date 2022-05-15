package com.fernanda.business_management_system.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.swing.plaf.basic.BasicToolBarUI;
import java.sql.Timestamp;
import java.time.LocalTime;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket businessManagementApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("API")
                .directModelSubstitute(LocalTime.class, String.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fernanda.business_management_system.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiEndPointsInfo()).directModelSubstitute(Timestamp.class, Long.class);
    }

    private ApiInfo apiEndPointsInfo(){
        return new ApiInfoBuilder()
                .title("Business Management API")
                .description("This API will provide the tools to manage a business." + "The users will be able to  and add individuals and companies, etc.")
                .version("1.0.0")
                .build();
    }
}
