package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWarDeployApplication{
	
	@GetMapping(value = "/welcome")
	public String getMessage() {
		return "welcome to ashok it";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWarDeployApplication.class, args);
	}
	

}
