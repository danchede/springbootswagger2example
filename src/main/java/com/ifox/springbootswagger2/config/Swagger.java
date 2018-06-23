package com.ifox.springbootswagger2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in9:18 2018/6/22
 * @Modified By:
 */
@Configuration
@EnableSwagger2
public class Swagger {
    @Autowired
    private Environment env;

    @Bean
    public Docket createRestApi(ServletContext servletContext) {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathProvider(new RelativePathProvider(servletContext) {
                    @Override
                    public String getApplicationBasePath() {
                        return env.getProperty("swagger.service-name") + super.getApplicationBasePath();
                    }
                })
                .host(env.getProperty("swagger.host"))
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ifox.springbootswagger2example"))
//                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
//                .pathMapping("admin-enduser-api");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2构建RESTful APIs")    //大标题
                .description("Spring Boot + Swagger2")  //描述
                .contact("zhongchao")
                .version("1.0")
                .build();
    }
}
