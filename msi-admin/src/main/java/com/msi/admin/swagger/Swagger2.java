package com.msi.admin.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * rest API swagger2
 * 浏览器中打开此网址 http://127.0.0.1:8080/swagger-ui.html
 */

@Configuration
@EnableSwagger2
public class Swagger2 {


  @Bean
  public Docket createRestApi() {

    return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(spiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.msi.admin.controller"))
            .paths(PathSelectors.any())
            .build();

  }

  private ApiInfo spiInfo() {
    return new ApiInfoBuilder()
            .title("拾肆亦-RESTful API文档")
            .contact(new Contact("岳晓辉", "#", "1023766685@qq.com"))
            .version("1.0.0")
            .description("rest API文档")
            .build();
  }


}
