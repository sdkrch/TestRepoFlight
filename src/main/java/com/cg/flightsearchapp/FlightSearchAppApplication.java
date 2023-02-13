package com.cg.flightsearchapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ComponentScan(basePackages = "com.cg.flightsearchapp")
@SpringBootApplication
@EntityScan("com.cg.flightsearchapp.*")
@EnableJpaRepositories(basePackages="com.cg.flightsearchapp.repository")
public class FlightSearchAppApplication {

	private static final Logger logger = LoggerFactory.getLogger(FlightSearchAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FlightSearchAppApplication.class, args);
	}

}
