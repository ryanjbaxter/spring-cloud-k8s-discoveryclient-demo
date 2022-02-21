package com.example.springcloudk8sdiscoveryclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudK8sDiscoveryclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudK8sDiscoveryclientDemoApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hello Tanzu";
	}

}
