package com.careerit.ms.iag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class IplApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplApiGatewayApplication.class, args);
	}

}
