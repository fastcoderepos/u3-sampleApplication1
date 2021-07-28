package com.fastcode.sampleapplication14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fastcode.sampleapplication14"})
public class Sampleapplication14Application {

	public static void main(String[] args) {
		SpringApplication.run(Sampleapplication14Application.class, args);
	}

}

