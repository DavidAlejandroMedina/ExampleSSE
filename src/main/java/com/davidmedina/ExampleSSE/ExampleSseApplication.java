package com.davidmedina.ExampleSSE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExampleSseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSseApplication.class, args);
	}

}
