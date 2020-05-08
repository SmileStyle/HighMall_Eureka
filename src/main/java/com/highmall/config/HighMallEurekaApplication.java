package com.highmall.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HighMallEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighMallEurekaApplication.class, args);
	}

}
