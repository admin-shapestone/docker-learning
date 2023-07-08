package com.example.dockerlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerLearningApplication.class, args);
	}
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello docker..";
	}
	
	@GetMapping("/{name}")
	public String sayHelloWithName(@PathVariable("name")String name) {
		return "Hello " + name;
	}

}
