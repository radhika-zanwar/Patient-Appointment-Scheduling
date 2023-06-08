package com.radhika.springdata.patients.scheduling;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PatientsSchedulingApplication {

	private static final Logger LOGGER = LogManager.getLogger(PatientsSchedulingApplication.class);

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(PatientsSchedulingApplication.class, args);

	}

}
