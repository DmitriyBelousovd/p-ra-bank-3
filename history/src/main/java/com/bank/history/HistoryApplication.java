package com.bank.history;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication

public class HistoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(HistoryApplication.class, args);
    }
}
