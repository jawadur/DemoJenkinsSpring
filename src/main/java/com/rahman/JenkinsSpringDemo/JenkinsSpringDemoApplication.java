package com.rahman.JenkinsSpringDemo;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringDemoApplication {
	
	public static Logger logger=(Logger) LoggerFactory.getLogger(JenkinsSpringDemoApplication.class);
	
	@PostConstruct
	public void intt() {
		
		logger.info("Application Started.....");
	}

	public static void main(String[] args) {
		logger.info("Application Started.Testing Jenkins....");
		SpringApplication.run(JenkinsSpringDemoApplication.class, args);
	}

}
