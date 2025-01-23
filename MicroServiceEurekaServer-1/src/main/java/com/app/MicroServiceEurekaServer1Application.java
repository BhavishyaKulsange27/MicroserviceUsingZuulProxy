package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServiceEurekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceEurekaServer1Application.class, args);
	}

}
