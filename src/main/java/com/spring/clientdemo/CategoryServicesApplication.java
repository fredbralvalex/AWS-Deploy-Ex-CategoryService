package com.spring.clientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CategoryServicesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CategoryServicesApplication.class, args);

    }

}
