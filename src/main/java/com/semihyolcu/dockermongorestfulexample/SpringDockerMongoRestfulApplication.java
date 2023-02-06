package com.semihyolcu.dockermongorestfulexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringDockerMongoRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerMongoRestfulApplication.class, args);
	}

}
