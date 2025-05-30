package com.EagleVerse.PartnetWithUs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PartnetWithUsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartnetWithUsApplication.class, args);
	}

}
