package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class D2ClientKarveApplication {

	public static void main(String[] args) {
		SpringApplication.run(D2ClientKarveApplication.class, args);
	}

}
