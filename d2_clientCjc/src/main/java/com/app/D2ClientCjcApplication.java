package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
public class D2ClientCjcApplication {

	public static void main(String[] args) {
		SpringApplication.run(D2ClientCjcApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate rt() {
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}
