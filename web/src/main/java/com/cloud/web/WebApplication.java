package com.cloud.web;

import com.spring4all.swagger.EnableSwagger2Doc;
import com.cloud.web.controller.helloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// 不在SpringbootApplication目录下时用ComponetScan或@Bean来解决404问题
@ComponentScan(value = {"com.cloud.web.controller"})
@EnableSwagger2Doc
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

//    @Bean
//    public helloController helloController() {
//        return new helloController();
//    }

}
