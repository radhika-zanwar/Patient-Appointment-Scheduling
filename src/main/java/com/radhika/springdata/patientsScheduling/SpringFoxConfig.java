package com.radhika.springdata.patientsScheduling;

import io.swagger.models.HttpMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
@Import({SpringDataRestConfiguration.class, BeanValidatorPluginsConfiguration.class})
public class SpringFoxConfig {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.baeldung.web.controller"))
                    .paths(PathSelectors.ant("/foos/*"))
                    .build()
                    .apiInfo(apiInfo())
                    .useDefaultResponseMessages(false)
                    .globalResponses(HttpMethod.GET, new ArrayList(
                            new ResponseBuilder().code("500")
                                    .description("500 message").build(),
                            new ResponseBuilder().code("403")
                                    .description("Forbidden!!!!!").build()));
        }
        private ApiInfo apiInfo() {
            return new ApiInfo(
                "My REST API",
                "Some custom description of API.",
                "API TOS",
                "Terms of service",
                 new Contact("John Doe", "www.example.com", "myeaddress@company.com"),
                "License of API", "API license URL", Collections.emptyList());
    }

        @Bean
        public EmailAnnotationPlugin emailPlugin() {
            return new EmailAnnotationPlugin();
    }

}
