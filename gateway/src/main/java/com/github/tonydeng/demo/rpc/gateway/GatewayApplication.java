package com.github.tonydeng.demo.rpc.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.github.tonydeng.demo.rpc.*"})
public class GatewayApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        log.info("Gateway Application start......");
        SpringApplication.run(GatewayApplication.class, args);
    }
}