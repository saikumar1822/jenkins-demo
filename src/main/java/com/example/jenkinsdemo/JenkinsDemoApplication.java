package com.example.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsDemoApplication extends SpringBootServletInitializer{
	  static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
	public static void main(String[] args) {
		logger.info("********************* IN main class********************");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "wel come to jenkins";
	}
	
	

}
