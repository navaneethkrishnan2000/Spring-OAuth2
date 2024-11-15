package com.example.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity // required for the auto configurations of the spring security to kick in, so that it is necessary
public class LearnSpringOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOAuthApplication.class, args);
	}

}
