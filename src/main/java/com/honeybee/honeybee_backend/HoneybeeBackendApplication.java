package com.honeybee.honeybee_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.honeybee")
@EntityScan(basePackages = "com.honeybee.model")
@EnableJpaRepositories(basePackages = "com.honeybee.repository")
public class HoneybeeBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoneybeeBackendApplication.class, args);
	}

}
