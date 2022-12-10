package com.airport.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.airport.*")
@EnableJpaRepositories("com.airport.repository")
@EntityScan(basePackages = {"com.airport.model"})
public class AirportSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportSurveyApplication.class, args);
	}

}
