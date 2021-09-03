package com.sprint.cars.SprintCars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SprintCarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintCarsApplication.class, args);
	}

}
