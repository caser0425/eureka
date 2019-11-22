package com.cloud.gatewayzuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulDemoApplication.class, args);
    }

}
