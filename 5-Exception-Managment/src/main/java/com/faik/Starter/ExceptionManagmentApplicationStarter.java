package com.faik.Starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication()
@EntityScan(basePackages = {"com.faik"})
@EnableJpaRepositories(basePackages = {"com.faik"})
@ComponentScan(basePackages = {"com.faik"})
public class ExceptionManagmentApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagmentApplicationStarter.class, args);
	}

}
