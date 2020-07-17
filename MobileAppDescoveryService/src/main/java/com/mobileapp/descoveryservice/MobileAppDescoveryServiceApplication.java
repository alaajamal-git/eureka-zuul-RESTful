package com.mobileapp.descoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MobileAppDescoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAppDescoveryServiceApplication.class, args);
	}

}
