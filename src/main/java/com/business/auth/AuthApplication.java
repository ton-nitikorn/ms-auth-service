package com.business.auth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.business.auth.user.User;

@SpringBootApplication
@EnableEurekaClient
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initialUserData(UserRepository repository) {
		return (args)->{
			User user = new User("nitikorn.joonsukhon@scb.co.th","nitikorn.j","1234","Admin");
			repository.save(user);
		};
	}
}
