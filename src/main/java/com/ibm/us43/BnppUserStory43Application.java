package com.ibm.us43;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BnppUserStory43Application {

	public static void main(String[] args) {
		SpringApplication.run(BnppUserStory43Application.class, args);
	}

}
