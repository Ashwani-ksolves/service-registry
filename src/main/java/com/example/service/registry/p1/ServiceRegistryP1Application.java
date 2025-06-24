package com.example.service.registry.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryP1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryP1Application.class, args);
	}

}
