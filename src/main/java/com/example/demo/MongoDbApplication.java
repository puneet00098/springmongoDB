package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication // Annotation for Spring boot application 
//@EnableMongoRepositories is required to connumicate with Mongo DB.
//location of the package is required ("com.example.repository")

@EnableMongoRepositories("com.example.repository")
@ComponentScan("com.example.*")

public class MongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}

}
