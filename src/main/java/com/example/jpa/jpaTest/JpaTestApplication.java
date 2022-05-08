package com.example.jpa.jpaTest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JpaTestApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(JpaTestApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Info level log message");
		SpringApplication.run(JpaTestApplication.class, args);
	}

}
