package com.proje.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.proje"})
@ComponentScan(basePackages = {"com.proje"})
@EnableJpaRepositories(basePackages = {"com.proje"})
@SpringBootApplication
public class ProjeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjeApplication.class, args);
    }

}
