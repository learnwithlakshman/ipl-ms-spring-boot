package com.careerit.ms.isp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IplServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplServiceRegistryApplication.class, args);
	}

}
