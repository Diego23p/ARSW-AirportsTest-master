package edu.eci.arsw.AirportsTestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw.AirportsTest"})
public class AirportsTestAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportsTestAPIApplication.class, args);
	}

}