package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class TestEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestEurekaClient2Application.class, args);
	}
	
	@GetMapping("/testEurekaClient")
	public String testEurekaClient() {
		System.out.println("In Client2");
		return "Please validate in Eureka UI 2.";
	}

}
