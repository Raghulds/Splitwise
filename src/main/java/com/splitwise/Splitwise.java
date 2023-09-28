package com.splitwise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.splitwise")
@ComponentScan(basePackages = {"com.splitwise.models", "com.splitwise.repositories", "com.splitwise.controllers", "com.splitwise.services"})
@EntityScan("com.splitwise.models")
@EnableJpaRepositories("com.splitwise.repositories")
public class Splitwise {
    public static void main(String[] args) {
        SpringApplication.run(Splitwise.class, args);
    }

}
