package com.example.demoazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAzureApplication {

	@GetMapping("/message")
	public String message(){
		return "ALPHA CHEESE";
	}

	@GetMapping("/message2")
	public String message2(){
		return "ALPHA CHEESE2";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoAzureApplication.class, args);
	}

}
