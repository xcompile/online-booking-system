package com.hongkongcoder.salon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class SalonApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SalonApplication.class, args);
	}

}