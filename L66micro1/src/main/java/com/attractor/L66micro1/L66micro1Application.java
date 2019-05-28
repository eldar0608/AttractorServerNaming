package com.attractor.L66micro1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class L66micro1Application {

	public static void main(String[] args) {
		SpringApplication.run(L66micro1Application.class, args);
	}

}
