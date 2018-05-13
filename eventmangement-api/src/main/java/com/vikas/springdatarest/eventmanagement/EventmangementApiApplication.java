package com.vikas.springdatarest.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses = { EventmangementApiApplication.class, Jsr310Converters.class })
public class EventmangementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventmangementApiApplication.class, args);
	}
}
